# Java Test Automation Framework

This is a robust Java 11-based test automation framework designed for scalable, maintainable, and cloud-ready testing. 

It utilizes TestNG as the primary test runner and supports both local and LambdaTest cloud execution. 

The framework supports data-driven testing through multiple sources (OpenCSV, JSON, Apache POI for Excel) and integrates the Faker library for dynamic test data creation.


## 🚀 About Me
My name is Ashish Mahato and I have 4+ years of experience. In automation testing, Using technologies like selenium WebDriver, AI Automation, Jenkins

My major expertise is in Java programming language.


## Authors

- [@Ashish.Mahato](https://github.com/ASHISH1524)
EmailAddress: ashish.we.1524@gmail.com


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/ASHISH1524)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ashish-mahato1524/)



## Prerequisites
Before running this framework, ensure the following software is installed on your system.


- **Java 11 or newer** - Make sure Java is installed and the JAVA_HOME environment variable is set.
- **Maven** - Ensure Maven is installed and added to the system



## Features

- **Data-Driven Testing:** Using OpenCSV, Apache POI, and Gson for reading test data from CSV and Excel files.

- **Cross-Browser Testing:** Supports running tests on different browsers.

- **Headless Mode:** Faster execution by running tests in headless mode.

- **Cloud Testing:** Integrated with LambdaTest to run tests on the cloud.

- **Logging:** Uses Log4j for detailed logs.

- **Reporting:** Generates detailed reports using Extent Reports.


## Technologies Used
- Java 11
- TestNG
- OpenCSV
- Gson
- Apache POI
- Faker
- LambdaTest
- Log4j
- Extent Reports



**Clone the Repository:**

```bash
git clone https://github.com/ASHISH1524/Hybrid-Test-Automation-Framework.git

cd Test-Automation-Framework
```

**Running Tests on LambdaTest:** 

```bash
mvn test -DBrowser=chrome -DisLambdaTest=true -DisHeadless=false -X
```

**Running Tests on Chrome browser on Local Machine in Headless Mode:** 

```bash
mvn test -DBrowser=chrome -DisLambdaTest=false -DisHeadless=true -X
```


## Reports & Logs
- Reports: After execution, a detailed HTML report will be generated at ./report.html.

The report contains information on test cases executed, passed, failed, and skipped, along with screenshots for failed tests.

## Logs:
Logs are created during the test execution and stored in the ./logs/ directory.

