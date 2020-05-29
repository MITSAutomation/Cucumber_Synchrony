package com.mits;

import java.awt.AWTException;
import java.util.Date;	
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import java.util.Set;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mits.exception.CustomizedException;

//import com.mits.exception.CustomizedException;

import org.openqa.selenium.Cookie;	
public class DriverMethods {
	static WebDriver driver;
	Properties prop;
	boolean b;
	Actions action;
	Robot robot;
	org.openqa.selenium.Alert al;
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriverWait wait;
	
 
	public void url(String Url) throws InterruptedException {
		driver.get(Url);
		Thread.sleep(2500);
		log.info("launching URL");

}
	public void checkvisibility(String locatorType, String value) {
	try{wait=new WebDriverWait(driver, 40);
	By locator = locatorValue(locatorType, value);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}catch(Exception e){
		log.info(e);
	}}
	  public void getcookies()	
	  {
	        // create file named Cookies to store Login Information		
	        File file = new File("Cookies.data");							
	        try		
	        {	  
	            // Delete old file if exists
				file.delete();		
	            file.createNewFile();			
	            FileWriter fileWrite = new FileWriter(file);							
	            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
	            // loop for getting the cookie information 		
	            	
	            // loop for getting the cookie information 		
	            for(Cookie ck : driver.manage().getCookies())							
	            {			
	                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
	                Bwrite.newLine();             
	            }			
	            Bwrite.close();			
	            fileWrite.close();	
	            
	        }
	        catch(Exception ex)					
	        {		
	            ex.printStackTrace();			
	        }		
	    }
	  public void readwritecookies() {
		  Set<Cookie> allCookies = driver.manage().getCookies();

	        driver.close();

	        //open a new browser window
driverDetails();

	        //restore all cookies from previous session
	        for(Cookie cookie : allCookies) {
	            driver.manage().addCookie(cookie);
	        }
	  }
	  public void usecookies() {
		  try{
			  File file = new File("Cookies.data");							
		        FileReader fileReader = new FileReader(file);							
		        BufferedReader Buffreader = new BufferedReader(fileReader);							
		        String strline;			
		        while((strline=Buffreader.readLine())!=null){									
		        StringTokenizer token = new StringTokenizer(strline,";");									
		        while(token.hasMoreTokens()){					
		        String name = token.nextToken();					
		        String value = token.nextToken();					
		        String domain = token.nextToken();					
		        String path = token.nextToken();					
		        Date expiry = null;					
		        		
		        String val;			
		        if(!(val=token.nextToken()).equals("null"))
				{		
		        	expiry = new Date(val);					
		        }		
		        Boolean isSecure = new Boolean(token.nextToken()).								
		        booleanValue();		
		        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
		        System.out.println(ck);
		        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
		        }		
		        }			
	        }catch(Exception ex){					
	        ex.printStackTrace();			
	        }		
}	
	  
	public void uploadDocs(String FileLoc) throws AWTException, InterruptedException {
		robot = new Robot();
		StringSelection sc = new StringSelection(FileLoc);
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,
		// null);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
log.info("Documents uploaded");
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void ListElementClick(String locatorType, String value, String text) throws InterruptedException { // 2
		By locator = locatorValue(locatorType, value);// 3
		List<WebElement> wb = driver.findElements(locator);
		log.info("List of elements"+wb.size());
		log.info(wb.size());
		for (WebElement wb2 : wb) {
			log.info(wb2.getText());
			if (wb2.getText().equalsIgnoreCase(text)) {

				wb2.click();

			}
		}
	log.info("click performed ");
	}

	public void ListElementClickDrodown(String locatorType, String value, String text) throws InterruptedException { // 2
		By locator = locatorValue(locatorType, value);// 3
		List<WebElement> wb = driver.findElements(locator);
		System.out.println(wb.size() + "lent");
		for (WebElement wb2 : wb) {
			Thread.sleep(2000);
			try {
				robot = new Robot();

				while (wb2.getText().equalsIgnoreCase(text)) {
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_DOWN);
				}
				log.info("Drop-down value selected");
			} catch (Exception e) {
				log.info(e);
			}
		}

	}

	public void ListElementSendKeys(String locatorType, String value, String text1) throws InterruptedException { 
		try{
		By locator = locatorValue(locatorType, value);// 3
		List<WebElement> wb = driver.findElements(locator);

		for (WebElement wb2 : wb) {
			if (wb2.getText().equalsIgnoreCase(text1)) {

				wb2.sendKeys(text1);
			}
		}
		log.info("entered value");
		} catch (Exception e) {
			log.info(e);
		}
	}

	public void ListBYTagNameSIN(String locatorType, String value, String text, String tg1)
			throws InterruptedException {
		By locator = locatorValue(locatorType, value);
		WebElement ls0 = driver.findElement(locator);
		List<WebElement> rows2 = ls0.findElements(By.tagName(tg1));
		for (WebElement ss : rows2) {
			ss.sendKeys(text);
			log.info("entred text");

		}
	}

	public void ListBYTagNameMULwithALERT(String locatorType, String value, String text, String tg1, String tg2)
			throws InterruptedException {
		By locator = locatorValue(locatorType, value);
		WebElement ls = driver.findElement(locator);

		List<WebElement> rows = ls.findElements(By.tagName(tg1));
		//
		log.info(rows.size() + "=first lookup");
		for (int i1 = 0; i1 < rows.size(); i1++) {

			List<WebElement> cols = ls.findElements(By.tagName(tg2));
			log.info(cols.size() + "=size of cols");
			for (WebElement a2 : cols) {
				if (a2.getText().equalsIgnoreCase(text)) {
					a2.click();
					driver.switchTo().alert().accept();

					// log.info(a2.getText());
					break;

				}
			}
		}

	}

	public void ListBYTagNameMULwithoutALERT(String locatorType, String value, String text, String tg1, String tg2)
			throws InterruptedException {
		By locator = locatorValue(locatorType, value);
		WebElement ls = driver.findElement(locator);

		List<WebElement> rows = ls.findElements(By.tagName(tg1));
		//
		log.info(rows.size() + "=first lookup");
		for (int i1 = 0; i1 < rows.size(); i1++) {

			List<WebElement> cols = ls.findElements(By.tagName(tg2));
			log.info(cols.size() + "=size of cols");
			for (WebElement a2 : cols) {
				if (a2.getText().equalsIgnoreCase(text)) {
					a2.click();

					// log.info(a2.getText());
					break;
				}
			}
		}

	}

	
	public boolean isDisplyedElement(String locatorType, String value) {
	
		By locator = locatorValue(locatorType, value);
		return b = driver.findElement(locator).isDisplayed();
	}
	

	public void Alert() {try{
		al = driver.switchTo().alert();
		al.accept();
		log.info("accepted aleart");}
	catch(Exception e){
		log.info(e);
	}
	}
	

	public void MoveToElement(String locatorType, String value) throws InterruptedException {
		try{
		action = new Actions(driver);
		By locator = locatorValue(locatorType, value);
		action.moveToElement(driver.findElement(locator)).click().build().perform();
		log.info("Action performed");
		}
		catch(Exception e){
			log.info(e);
		}

	}

	public void MoveTOElementAndSendKeys(String locatorType, String value, String keys) throws InterruptedException {
		try{action = new Actions(driver);
		By locator = locatorValue(locatorType, value);
		action.moveToElement(driver.findElement(locator)).sendKeys(keys).perform();
		log.info("action performed");
		}
		catch(Exception e){
			log.info(e);
		}
	}



	public void driverDetails() // 5
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\EclipseWorkspace\\Cucumber_sync\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	private By locatorValue(String locatorType, String value) {
		By by;
		switch (locatorType) {
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		case "tagName":
			by = By.tagName(value);
			break;
		default:
			by = null;
			break;
		}
		return by;
	}

	public void enterText(String locatorType, String value, String text) throws InterruptedException, CustomizedException { // 6
		Exception message=null;
		try{wait=new WebDriverWait(driver, 40);
		By locator = locatorValue(locatorType, value);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		
		element.sendKeys(text);
	//	message = "Success";
	//	return message;
		}
		catch(Exception e){
			new CustomizedException(e, driver);
		//	log.info(e);
		//	log.error("While reading the Excel error :" + e.getMessage());
			message = e;
		throw e;		
		//	return e;
		}
		
		
		}

	public String clickOnLocator(String locatorType, String value) throws InterruptedException, CustomizedException { // 7
		String message = null;
		try{
		By locator = locatorValue(locatorType, value);
		WebElement element = driver.findElement(locator);
		element.click();
		Thread.sleep(500);
		message = "Success";
		return message;
		}
		catch(Exception e){
			throw new CustomizedException(e, driver);	}
	}

	public void Select_A_DropDwon_Value(String locatorType, String value, String value1, String Text)
			throws InterruptedException, AWTException, CustomizedException {
		try{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		wait=new WebDriverWait(driver, 40);
		By locator = locatorValue(locatorType, value);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		WebElement element = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.doubleClick(element).perform();

		try {

			Thread.sleep(1500);
			Robot rb = new Robot();

			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			log.info("Selects"+Text);

		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			throw new CustomizedException(e);
		}
		Thread.sleep(1500);
		ListElementClick(locatorType, value1, Text);
		log.info("Element Clicked"+Text);}
		catch(Exception e){
			throw new CustomizedException(e);
			
		}
	}

	

	
	public void Enters_Data(String locatorType, String value, String Text) throws InterruptedException {
		try{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		
		action = new Actions(driver);
		wait=new WebDriverWait(driver, 40);
		By locator = locatorValue(locatorType, value);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		WebElement element = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.moveToElement(element).doubleClick().perform();
		Thread.sleep(1500);

		try {
			String text = Text;
			StringSelection stringSelection = new StringSelection(text);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, stringSelection);

			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			log.info("Entered"+Text);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
		
			log.info(e);
		}

		Thread.sleep(1000);}
	catch(Exception e){
		log.info(e);
	}
	
		
	}

	public void Enters_Data_1(String locatorType, String value, String Text) throws InterruptedException {
		try{

		int count = 0;
		boolean clicked = false;
		while (count < 4 && !clicked) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				action = new Actions(driver);
				wait=new WebDriverWait(driver, 40);
				By locator = locatorValue(locatorType, value);
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

				WebElement element = driver.findElement(locator);
				js.executeScript("arguments[0].scrollIntoView();", element);
				action.moveToElement(element).doubleClick().perform();
				Thread.sleep(1500);

				try {
					String text = Text;
					StringSelection stringSelection = new StringSelection(text);
					Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard.setContents(stringSelection, stringSelection);

					robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					log.info("Entered"+Text);
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					log.info(e);
				}

				Thread.sleep(1000);

				
				 clicked = true;
			} catch (StaleElementReferenceException e) {
				e.toString();
				System.out.println("Trying to recover from a stale element :" + e.getMessage());
				count = count + 1;
				log.info(e);
			}
		}
		}
		catch(Exception e){
			log.info(e);
		}
	}
//	public Sheet Excel(String FileNameWithArea, String sheetName1) throws IOException { // 4
//		File f = new File(FileNameWithArea);
//		FileInputStream f1 = new FileInputStream(f);
//		XSSFWorkbook xb = new XSSFWorkbook(f1);
//		Sheet s = xb.getSheet(sheetName1);
//		return s;
//
//	}
//	
//	public void select_A_DropDown_value_1(String locatorType, String value, String value1, String Text) throws InterruptedException {
//
//		int count = 0;
//		boolean clicked = false;
//		while (count < 4 && !clicked) {
//			try {
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				action = new Actions(driver);
//				wait=new WebDriverWait(driver, 40);
//				By locator = locatorValue(locatorType, value);
//				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//
//				WebElement element = driver.findElement(locator);
//				js.executeScript("arguments[0].scrollIntoView();", element);
//				action.doubleClick(element).perform();
//
//				try {
//
//					Thread.sleep(1500);
//					Robot rb = new Robot();
//
//					rb.keyPress(KeyEvent.VK_DOWN);
//					rb.keyRelease(KeyEvent.VK_DOWN);
//
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					
//					log.info(e);
//				}
//				Thread.sleep(1500);
//				ListElementClick(locatorType, value1, Text);
//				
//				 clicked = true;
//			} catch (StaleElementReferenceException e) {
//				e.toString();
//				System.out.println("Trying to recover from a stale element :" + e.getMessage());
//				count = count + 1;
//				log.info(e);
//			}
//		}
//	}
//
//	
//	public void select3(String locatorType, String value, String value1, String Text, String value2, String Text2)
//			throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		action = new Actions(driver);
//		By locator = locatorValue(locatorType, value);
//		WebElement element = driver.findElement(locator);
//		js.executeScript("arguments[0].scrollIntoView();", element);
//		action.moveToElement(element).doubleClick().perform();
//		Thread.sleep(1500);
//		action.click().perform();
//		Thread.sleep(500);
//		enterText(locatorType, value1, Text);
//		Thread.sleep(500);
//
//		ListElementClick(locatorType, value2, Text2);
//
//	}

	


//	public void select4(String locatorType, String value, String Text) throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		action = new Actions(driver);
//		By locator = locatorValue(locatorType, value);
//		WebElement element = driver.findElement(locator);
//		js.executeScript("arguments[0].scrollIntoView();", element);
//
//		action.moveToElement(element).doubleClick().perform();
//		Thread.sleep(2000);
//		action.doubleClick().doubleClick().perform();
//		Thread.sleep(500);
//
//		try {
//			String text = Text;
//			StringSelection stringSelection = new StringSelection(text);
//			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//			clipboard.setContents(stringSelection, stringSelection);
//
//			robot = new Robot();
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		/// enterText(locatorType, value1, Text);
//		Thread.sleep(500);
//
//	}

	

	public void closeBrowser() { // 8
		// wait = new WebDriverWait(driver,2);
		driver.close();
	}

	// Url(String Url)
	// ListElementClick(String locatorType, String value,String text)
	// WebElement(String locatorType, String value)
	// driverDetails()
	// Excel(String FileNameWithArea)
	// clickOnLocator(String locatorType, String value)
	// closeBrowser()
	public void WebdriverMethods1(String propertiesDoc) throws IOException {
		FileInputStream ss9 = new FileInputStream(propertiesDoc);
		prop = new Properties();
		prop.load(ss9);

	}
}
