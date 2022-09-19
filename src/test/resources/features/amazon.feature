Feature: Test amazon product page

@smoketest
Scenario: Verify if product features are visible for second highest priced Samsung TV
		  	Given I open the URL
		   	When I click on Search input box
		   	And I search for item
			And I click on second item link
			When I click on Add to Cart button
			Then TV should be added in the cart
			

Scenario: Verify if product features are visible for second highest priced Samsung TV
		  	Given I open the URL
		   	When I click on Hamburger Menu
		   	And I click on Tv Appliance Electronics link
			And I click on Televisions link
		   	Then I should see televisions link
			When I click on samsung tab
			Then Verify samsung link
			When search results are sorted by High to low
			When I click on second product in sorted list
			Then There should be product features regarding that tv