<p align= "center">
    <img src="https://raofin.github.io/r/img/BearBurger/nav-logo.png" title="Logo" alt="Logo" width="500px">
    <br/>
    <b>BearBurger-Swing</b> is a food management system, built using Java, Java Swing, Java Spring, JDBC Template, and Maven.
</p>

## Features
Customers can create accounts, log in to the system, browse foods, make purchases, and do many other things. There are also various features available for administrators. The application is essentially separated into two roles-
* **Customer:**
    * Login
    * Registration
    * Profile view and modify
    * Browse and search foods
    * Add foods to cart
    * Purchase foods
    * Payment with credit card
* **Administrator:**
    * Add and remove users
    * Modify user details
    * View user list
    * Add foods

## Tools & Technologies
* Java, JDBC Template, Maven
* **Frameworks:** Java Swing & Java Spring
* **Database:** MySQL
* **IDE:** IntelliJ IDEA

## How to Run
* **Executable JAR:**
    1. Execute the [SQL queries](src/main/resources/database/app.sql) in your MySQL server
    2. Download and run [BearBurger-Swing.jar](https://github.com/Raofin/BearBurger-Swing/releases/download/v1.0.0/BearBurger-Swing.jar)
* **Source Code:**
    1. Execute the [SQL queries](src/main/resources/database/app.sql) in your MySQL server.
    2. Clone the repository and open it with any Java IDE, like **IntelliJ IDEA**.
    3. Maven should automatically download the required dependencies. Wait till the process is completed.
    4. Make sure all the dependencies are properly downloaded **(Important!)**.
    5. If you have a different MySQL username, and password or running it on a different port, you can modify the project datasource configurations from `src\main\resources\application-context.xml`.
    6. Run the project using `src\main\java\org\apwj\bearburger\App.java`.

## Screenshots
<p align= "center">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(1).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(2).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(3).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(4).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(5).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(6).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(7).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(8).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(9).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(10).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(11).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(12).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(13).png" width="400">
<p/>

## License
This project is licensed under the [MIT License](LICENSE.md).
