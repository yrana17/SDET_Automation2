
@BackgroundTest
Feature: Test Background feature in Cucumber

Background: User is logged into application
	Given goto home page
	When enter cred in form of user n pswd
	Then successfull logged 
	
		
  @Payment
  Scenario: Validate Payment Scenario
    When I add product to cart and checkout
    And do payment via credit card
    Then I should recieve order confirmation

  @Refund
  Scenario: Validate Payment Scenario
    When I request for returned product
    And delivery person has picked up
    Then I should recieve refund message along with its ETA