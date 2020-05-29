Feature: Automation Case Manager functions

  Scenario: Opening Brower
    Given User will open Browser

  Scenario Outline: Login into URl
    Given Enters the URL with "<username>" and "<password>"

    Examples: 
      | username | password |
      | p8admin  | mits123$ |

Scenario: Select Add button
    Then Clicks on Add button

Scenario Outline: Populate data to properties
    Then Selects a Group "<Group>" from the group name
    Then selects a segName "<SegName>" from the Segmant name
    Then selects a Channel "<Channel>" from the Channel name
    Then selects a OfferType "<OfferType>" from OfferType
    Then Selects a SPT "<SPT>" from Segmant product type
    Then Enters SOD "<SOD>" in Segmant Offer description
    Then Enters TC "<TC>" in Targetting Criteria
    Then Selects a SOSD "<SOSD>" from Segmant offer Start date
    Then Selects a SOED "<SOED>" from Segmant offer End date
    Then Enters SPA "<SPA>" in Sys print agent
    Then Enters MI "<MI>" in Merchant ID
    Then Enters PG "<PGC>" in Product Group code
    Then Selects a CTT "<CTT>" from card tier type
    Then Selects a OL "<OL>" from Offer Location
    Then Selects a lan "<lan>" from Language
    Then Selects a MC "<MC>" from Merchant Category
   Then selects a Test "<Test>" from Test Control
    Then writes SegPer "<SegPer>" from Segamnt percent
    Then Enters SC "<SC>" in Segmant Count
    Then Selects RC "<RC>" from Remail counter
    Then Selects TP "<TP>" from Target population
    Then Enters ES "<ES>" in Email Subject
    Then Enters EPH "<EPH>" in Email pre Header
    Then Enters CC "<CC>" in Creative Code
    Then Enters CM "<CM>" in CisMemmo

Examples: 
      | Group    | SegName | Channel         | OfferType | SOD               | TC                 | SOSD       | SOED       | SPA           | MI           | PGC       | CTT   | OL              | lan     | MC         | TestV   | SegPer | SC  | RC | TP           | ES           | EPH         | CC       | CM    |
      | Group 09 | F       | Banana Republic | Gifts     | Thats what I want | Perfection matters | 01/06/2008 | 02/26/2020 | Things change | French fries | Foot wear | (N/A) | World & Instore | Spanish | Healthcare | Control |      0 | 123 |  9 | DC - Upgrade | Data passage | Call Coffee | Call Tea | Karen |

Scenario: Select save button after filling data
 #   Given User Clicks save button
