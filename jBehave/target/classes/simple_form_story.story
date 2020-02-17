Scenario: simpleForm
Given Firefox browser
When We go to the site URL "https://www.seleniumeasy.com/test/basic-first-form-demo.html"
Then Fill Value A
Then Fill Value B
When Click on get total button
Then See result
Then Close the firefox