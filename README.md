# Assignment 4 – SQAT  
## Selenium WebDriver with Page Object Model (POM)

---

## 📌 Overview

This project is created as part of **Assignment 4 SQAT**.  
The goal of the assignment is to practice advanced Selenium WebDriver concepts by refactoring an existing booking test case using the **Page Object Model (POM)** design pattern.

The booking scenario is reused from **Assignment 2**, but implemented in **Java** with a clean POM architecture.

---

## 🌐 Tested Web Application

- Website: https://www.blazedemo.com/
- Test Scenario: Flight booking from **Paris** to **Rome**

---

## 🛠 Technology Stack

- Java 11  
- Selenium WebDriver  
- JUnit 5  
- Maven  
- WebDriverManager  
- Page Object Model (POM)

---

## 📁 Project Structure

src
└── test
└── java
├── pages
│ ├── HomePage.java
│ ├── FlightsPage.java
│ ├── PurchasePage.java
│ └── ConfirmationPage.java
│
├── tests
│ └── BookingTest.java
│
└── utils
└── DriverFactory.java


---

## 🧩 Page Object Model Description

Each web page involved in the booking flow is represented by a separate Page Object class:

- **HomePage** – selecting departure and destination cities  
- **FlightsPage** – choosing a flight  
- **PurchasePage** – filling personal and payment details  
- **ConfirmationPage** – verifying booking confirmation  

All locators and page actions are encapsulated inside page classes.  
The test class controls only the test flow.

---

## ▶️ How to Run the Tests

### Prerequisites

Before running the project, ensure that the following are installed:

- Java JDK 11  
- Maven  
- Google Chrome  
- Internet connection  

Check versions:
```bash
java -version
mvn -version

---

## Test Execution

Run the following command from the project root:
```
mvn clean test