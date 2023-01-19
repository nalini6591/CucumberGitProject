Feature: Login
Scenario: Successsfully login with valid credential
Given User Launch Crome Browser
When User Open URL "https://www.facebook.com/"
And user enter Email "nalinip93@gmail.com" and  Pass as  "nalini6591*"
And click on Login button
Then Invalid Password