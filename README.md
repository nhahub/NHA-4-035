# NHA-4-35
Auto generated repo

🚀 SauceDemo Automation Framework
A robust test automation framework for the SauceDemo (Swag Labs) website using Selenium WebDriver and the Page Object Model (POM) design pattern. This project ensures the quality of the login process and inventory management through various positive and negative test scenarios.

🛠 Tech Stack
Language: Java 25.

Build Tool: Maven.

Testing Framework: TestNG.

Browser Automation: Selenium WebDriver (v4.39.0).

Reporting: Allure Reports.

Driver Management: WebDriverManager (v6.3.3).

Utilities: AspectJ (for detailed reporting), Java Faker (data generation).

🏗 Project Architecture
The project follows the Page Object Model (POM) to enhance maintainability and code reusability:

BasePage: Contains the WebDriver initialization, shared utility methods, and smart waits (WebDriverWait).

Pages: UI elements are defined using By Locators instead of the Page Factory pattern to improve stability and prevent StaleElementReferenceException.

TestCases: Contains the test logic, leveraging Data-Driven Testing to cover multiple user profiles.

Utils: Helper classes for reading configurations (ConfigUtil) and environmental properties.

🧪 Test Scenarios
The LoginTest suite covers the following cases:

Successful Login: Using the standard_user profile.

Expected Failure Cases:

Locked-out user: Testing system behavior for disabled accounts.

Invalid Credentials: Verifying error messages for wrong passwords or usernames.

Empty Fields: Ensuring validation triggers when fields are left blank.

Boundary/Security Testing: Passing SQL injection strings, JavaScript snippets, and extremely long strings to ensure input sanitization.

🚀 Getting Started
Prerequisites
JDK 25 installed (Note: JDK 21 LTS is recommended for full AspectJ compatibility).

Maven installed.

Execution Steps
Clone the repository:

Bash
git clone [your-repository-link]
Clean and build the project:

Bash
    mvn clean install
    ```
3.  **Run the tests:**
    ```bash
    mvn test
    ```
4.  **Generate Allure Report:**
    ```bash
    allure serve allure-results
    ```

## 📊 Reporting

We use **Allure Reports** to provide a high-level overview of test execution. Each action is documented using the `@Step` annotation within the Page classes, making it easy to identify exactly where a test failed during the execution flow.

## ⚙️ Technical Highlights
*   **Wait Strategy:** Replaced implicit waits with **Explicit Waits** (`ExpectedConditions`) to handle asynchronous page loading.
*   **Wrapper Methods:** Created custom wrappers for `ClickElement` and `SendKeys` that include built-in waiting logic, reducing code duplication.
*   **Parallel Execution:** Configured via `maven-surefire-plugin` to run tests in parallel, significantly reducing the total execution time.

---
*This project was developed as part of the DEPI Graduation Project.*
