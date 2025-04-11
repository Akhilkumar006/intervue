Login - Screenshot : Intervue.io

This project is an automated test script written in Java using Selenium and TestNG. It demonstrates a login flow test using Page Object Model (POM) design pattern.

-> Features:
Automated login with valid credentials
Verifies if the user is redirected to the homepage
Prints: "Logged in successfully"

Automated login with invalid credentials
Verifies the login fails
Takes a screenshot and saves it to the specified path
Uses TestNG DataProviders to supply two sets of login credentials

-> Technologies Used:
Java
Selenium WebDriver
TestNG

-> Screenshots:
Screenshots of failed logins are saved to a specified path on your local system.
⚠️ Note: Make sure to update the screenshot path in the script to match a directory on your system where the screenshot should be saved

-> How to Run
Clone the repository

Update the screenshot path in your code (if needed).

Run the test from the following class:
src/test/java/loginTest

Use your preferred IDE or Maven command to execute the test.
