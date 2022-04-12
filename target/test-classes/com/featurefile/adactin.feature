
Feature: To check the login functionality of the Adactin Hotel website

  Scenario: User should login to the adactin hotel website
    Given user is in Adactin Hotel login page
    When user is able to see the Username,password textbox and login butoon in the Adactin Hotel login page
    Then enter the valid username, password details 
    And click login button and user should navigate to search hotel page
  

  Scenario: User should Search hotel providing all the required detail in the search hotel page
  
  		Given User is in Search Hotel page
  		When User will find the dropdowns and provide the required details
  		Then User will find the check in and check out textbox where user have to enter valid check in and check out date
  		And Click the search 	button and user should navigate to the Select hotel page
  		
  Scenario: User should select the hotel in the Select Hotel page
  
  		Given User is in Select Hotel Page
  		When  User will find the RadioBox and click the radio box
  		Then  Click the continue button and user should navigate to the Book a hotel page
  		
  Scenario:  User Should book the hotel providing the card details for payment
  
      Given  User is in Book the hotel page
      When  User will find the textbox and dropdowns where user have to provide valid details
      Then   Click the Booknow button and user should navigate to the booking confirmation page
      And   Click the My Itinerary and user should navigate to the Booked Itinerary page
      Then   Take screenshot and save it in separate folder named Screenshot
      
  Scenario:	 User should cancel the selected hotel
  
  		Given  User is in the Booked Itinerary page
  		When  User should select the radio button of the hotel which has to be cancelled
  		Then  User should click the cancel selected button and user should find the Confirm alert 
  		And   User should click the ok button in the confirm alert and the selected hotel should get cancelled 
  		Then  User should take screenshot and save it in the already created screenshot folder
  		And   User should click logout button and the user should navigate to the logged out page
  
  
  
  
  
  
  
  
  
   