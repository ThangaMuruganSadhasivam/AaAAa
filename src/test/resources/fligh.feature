Feature: 
Scenario Outline: 
Given User is on makemytrip
When User click "<From>" and "<To>"
And User should click
Then User should verify
Examples:
|From   |To        |
|Chennai|Coimbatore|    