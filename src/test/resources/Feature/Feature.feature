Feature: verifying the BeautyBay website

  Background: 
    Given user is on Beauty Bay site

  Scenario Outline: verifying the BeautyBay website by purchasing a product
    When user clicks on the Signin image and navigates to the loginURL Page
    And user enters the "<Email>" and "<password>" and clicks on the sigin button and navigates to account page
    And user checks on the brokenlinks and broken image
    And user moves to the Explore link and click on NudePalettes link
    And user clicks on the Sort button and click on the Customer Rating
    And user clicks on the Filter button and  click on Brand button and select on Wet and Wild checkbox and click on the close button
    And user clicks on Done button
    And user Selects a product  and click on that particular product
    And user Selects the colour for the product in the dropdown box
    And user clicks on Add to bag button and click on the view bag button on the popup message
    And user clicks on the  + icon in the box to add up the qnty of the items
    
   
    Then user see the outcome

    Examples: 
      | Email                          | password  |
      | lakshmichokalingam13@gmail.com | Vimala@13 |
