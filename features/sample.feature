Feature: This is hust a test feature for cucumber

#Scenario: User searches an item on Google and check if the title matches the keyword
#	Given I navigate to Google homepage
#	When I enter a keyword to serach
#	And I click on the search button
#	Then I should be able to see the title contains the keyword
	
Scenario Outline: User searches an item on Google and check if the title matches the keyword
	Given I navigate to Google homepage
	When I enter a <keyword> to serach
	And I click on the search button
	Then I should be able to see the title contains the <keyword>	
	
Examples: 
	|keyword|
	|"porsche"|
	|"toyota"|
	|"bmw"|
	|"Mercedes-Benz"|

	