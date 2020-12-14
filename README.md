# Applitools Holiday Shopping Hackathon
This repository includes automated tests for Version 1,Version 2 and Version 3 of Applifashion.

## Languages and Frameworks:
The project uses the following languages and frameworks:
 Java 8 as the programming language
 Page object design pattern as a test automation design framework model
 Selenium WebDriver as the web browser automation framework
 Applitools Eyes SDK for visual testing
 Mvn installation
 
## Additional setup detail
 pom.xml file has all dependencies needed
 config.properties file includes all the version url
 Chrome driver executable
 Applitools API Key is being used as an environment variable.  

## Running Visual AI Ultrafast Grid Tests
### How to run tests:
To run the code for V1,V2,V3 need to uncomment the url from config.properties file for which we want to test code

Before running app install all required dependencies:
```mvn clean install```

Initiate test with below:
```mvn test```

### Write tests for v1 of AppliFashion batch run, on  browsers and devices
     Browsers: Chrome,
     Width:    1200,
     Height:   800,    
     Device:  Laptop

### Write tests for v2 of AppliFashion, on different browsers and devices
     Browsers: Chrome,
     Width:    1200,
     Height:   800,    
     Device:  Laptop

### Write tests for v3 of AppliFashion, on different browsers and devices
    Browsers: Chrome,Firefox,Edge Chromium,iPhoneX
    Width:    1200,
    Height:   800,    
    Device:  Laptop,Mobile

###Result Dashboard
    V1:https://eyes.applitools.com/app/test-results/00000251794671260752?accountId=Dp2JRc1hnUGvGf1_MCV7gw~~&display=gallery&top=00000251794670711478%283%29
    V2:https://eyes.applitools.com/app/test-results/00000251794671157295?accountId=Dp2JRc1hnUGvGf1_MCV7gw~~&display=gallery&top=00000251794670711478%283%29
    V3:https://eyes.applitools.com/app/test-results/00000251794670711478?accountId=Dp2JRc1hnUGvGf1_MCV7gw~~&display=gallery&top=00000251794670711478%283%29
 
    