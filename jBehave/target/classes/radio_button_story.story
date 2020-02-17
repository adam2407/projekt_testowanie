Scenario: RadioButton
Given Firefox browser
When We go to the site URL "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html"
Then Click Male
When Click Get Chcecked Value BUtton
Then See result
Then Click Female
When Click Get Chcecked Value BUtton
Then See result2
Then Close the firefox