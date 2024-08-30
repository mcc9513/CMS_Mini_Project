
# Customer Management System

## Overview
A simple Customer Management System built with Spring Framework, demonstrating Dependency Injection, Spring IoC, and CRUD operations. The system includes a `NotificationService` that sends an email when a new customer is added (simulated with a print statement).

## Build Tool: Maven

- **Dependency Management:** Simplifies integration with Maven Central.
- **Standardized Structure:** Promotes best practices with a consistent project layout.
- **Ease of Use:** Declarative configuration via `pom.xml`.
- **Community Support:** Widely used with extensive documentation.

## Steps Taken

1. **Setup:**
   - Initialized a Maven project and configured Spring dependencies in `pom.xml`.
   
2. **Development:**
   - Created `Customer`, `CustomerService`, `CustomerServiceImpl`, and `NotificationService` classes.
   - Used setter injection for `Customer` in `CustomerServiceImpl`.
   - Applied constructor injection for `NotificationService`.
   
3. **Testing:**
   - Implemented `MainApp` to test CRUD operations and email notifications using Spring IoC.

## Challenges

- **Learning Curve:** Understanding Spring IoC and setting up dependencies took time.
- **Service Design:** Ensured a clean separation of concerns between services.

## Assumptions

- **Email Notifications:** Simulated using print statements.
- **Data Storage:** Used in-memory storage with a simple `List<Customer>` for focus on Spring functionality.

## Running the Application

1. Clone the repository.
2. Build with Maven:
   
   mvn clean install

3. Run `CmsMiniProjectApplication` to execute the application.
