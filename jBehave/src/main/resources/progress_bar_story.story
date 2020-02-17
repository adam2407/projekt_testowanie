Scenario: simpleForm
Given Firefox browser
When We go to the site URL https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html
Then Click download button
Then Check progress label
Then Close the firefox