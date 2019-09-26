Feature: Automation Case Manager functions

  Scenario Outline: Validating Action Performance
  
    Given User Open Browser
    Then Enters valid user name "<username>"
    Then Enters valid password "<Password>"
    Then Click on Login Button
    Then select the solution "<Solution>"
    Then select the role  "<Role>"
    Then Open the "<caseID>"
    Then perform action "<Response>"

    Examples: 
      | username |  | Password |  | caseID          |  | Response |  | Solution     |  | Role                 |
      | cladmin	 |  | mits123$ |  | CLR190000000551 |  | Approve  |  | Fixed Assets |  | Car Lease Admin Team |

  Scenario Outline: Validating Opening Of case
    
    Given User Open Browser1
 	Then Enters valid user name1 "<username>"
    Then Enters valid password1 "<Password>"
    Then Click on Login Button1
    Then select the solution1 "<Solution>"
    Then select the role1  "<Role>"
    Then Open the "<caseID>"

    Examples: 
      | username |  | Password |  | caseID          |  | Solution     |  | Role                   |
      | cladmin  |  | mits123$ |  | CLR190000000551 |  | Fixed Assets |  | Car Lease Finance Team |
      