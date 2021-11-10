# ERS-System
The Expense Reimbursement System (ERS) will manage the process of reimbursing employees for expenses incurred while on company time. All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement.

**Technologies Used**
* Java 8
* Postgresql Database
* AWS RDS
* Junit for unit testing
* Log4j for logging
* DAO design pattern for data connectivity
* JavaScript
* CSS
* HTML
* Maven
* Bootsrap

**Features**

As an employee you can:

-   Login
-   Logout
-   View the employee home page
-   Submit a reimbursement request
-   View pending reimbursement requests
-   View resolved reimbursement requests
-   View my account information
-   Update account information
-   Employees can select the type of reimbursement as: LODGING, TRAVEL, FOOD, or OTHER.

As a manager you can:

-   Login
-   Logout
-   View the manager home page
-   Approve/Deny pending reimbursement requests
-   View all pending requests of all employees
-   View all resolved requests of all employees
-   View reimbursement requests of a specific employee
-   View all employees

**Technical Features**

-   The application employs the DAO design pattern, and properly separate the code into the appropriate layers
-   The back-end system uses JDBC to talk to the Database
-   The application deploys onto a Tomcat Server
-   The middle tier uses Servlet technology for dynamic Web application development
-   The front-end view uses JavaScript and use AJAX to call server-side components.

**Getting Started**

Download the files for the project from the remote repository and place them in the repository on your machine
Push the code to your remote repository, and import the project into STS as a Maven project
Create a new Repository on GitHub. For running this project you need to Import the Maven project in STS, and have an AWS RDS PostgreSQL database, and put your database connection settings in JDBC properties in the project.
