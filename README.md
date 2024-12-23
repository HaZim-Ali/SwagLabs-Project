# SwagLabs Project

This project is a Selenium-based test automation framework for testing the SwagLabs e-commerce web application. The framework is built using Java, Cucumber, and Maven.

Project Structure (POM)

The project follows the standard Maven structure, organized as follows:


```
SwagLabs-Automation-Project/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   ├── pages/
│       │   │   ├── TC01_Login.java
│       │   │   ├── TC02_Product.java
│       │   │   ├── TC03_Card.java
│       │   │   └── TC04_Checkout.java
│       │   ├── stepDefs/
│       │   │   ├── Hooks.java
│       │   │   ├── TC01_LoginSteps.java
│       │   │   ├── TC02_ProductSteps.java
│       │   │   ├── TC03_CardSteps.java
│       │   │   └── TC04_CheckoutSteps.java
│       │   └── runners/
│       │       └── TestRunner.java
│       ├── resources/
│       │   ├── features/
│       │   │   ├── F02_Login.feature
│       │   │   ├── F03_Product.feature
│       │   │   ├── F04_Card.feature
│       │   │   └── F05_Checkout.feature
│       │   ├── extent.properties
│       │   ├── pdf-config.yaml
│       │   └── spark-config.xml
├── target/
├── pom.xml
└── .gitignore
```

## Key Components

* **Pages**: Each page corresponds to a test case and contains locators and methods for interacting with the web elements.

* **Step Definitions**: Contains the implementation of Cucumber step definitions corresponding to the features.

* **Runners**: Configures and runs the tests.

* **Feature Files**: Written in Gherkin language, these files define the test scenarios.

* **Resources**: Configuration files for reporting and other utilities.

## Test Scenarios

The project includes the following test scenarios:

1. **Login Functionality**  
   Verifies the login process of the user into the SwagLabs application.

2. **Product Listing**  
   Validates the product page, including adding products to the cart.

3. **Cart Functionality**  
   Ensures the cart displays correct items, quantities, and pricing.

4. **Checkout Process**  
   Verifies that the checkout process is completed successfully.

## Setup Instructions

### Prerequisites

Make sure you have the following tools installed:

* **Java Development Kit (JDK):** Version 8 or higher.
* **Maven:** For dependency management.
* **IDE:** IntelliJ IDEA (recommended) or Eclipse.
* **Browser Drivers:** ChromeDriver (configured in system PATH).

### Installation Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/HaZim-Ali/SwagLabs-Automation-Project.git
    ```

2. Open the project in your IDE.

3. Ensure Maven is installed and configured.

4. Run the following Maven command to install dependencies:
    ```bash
    mvn clean install
    ```

## Technologies Used

* **Programming Language:** Java
* **Test Automation Framework:** Selenium WebDriver
* **Test Framework:** Cucumber
* **Build Tool:** Maven
* **Reporting Tools:** ExtentReports, PDF, Spark
* **IDE:** IntelliJ IDEA

## Execution

### Run Tests Using Maven

Execute the tests using the following Maven command:

```bash
mvn test

Key Components

Pages: Each page corresponds to a test case and contains locators and methods for interacting with the web elements.

Step Definitions: Contains the implementation of Cucumber step definitions corresponding to the features.

Runners: Configures and runs the tests.

Feature Files: Written in Gherkin language, these files define the test scenarios.

Resources: Configuration files for reporting and other utilities.
```
# Author
```


Eng. HaZim Aly

📧 Email: hazimaly5@gmail.com

📱 Phone: +201020605066

💻 GitHub: HaZim-Ali


```
