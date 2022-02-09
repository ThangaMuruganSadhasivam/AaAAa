Feature: Automating Amazon Page
Scenario Outline: Checking search box
Given User should enter "<text>" into the amazon page
When User should enter the search box value
And User should Verify

Examples:
|text|
|Iphone|