Feature: To automate webtables

Scenario: I want to count no. of user are enabled in webtable.

Given Launch browser "http://seleniumpractise.blogspot.com/2021/08/"
#And Enter username "Admin" and password "admin123"
#And Click on login button
#Then Click on admin menu and admin management and then select user
And Count enabled users in webtable
Then close the browser
