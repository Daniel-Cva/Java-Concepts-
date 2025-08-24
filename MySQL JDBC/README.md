# Employee Management System (Java + MySQL + JDBC)

Simple and small Employee Management System built with Java, MySQL and JDBC.

This README uses simple, easy words. It tells how to set up the database, configure the project, run the program, and what the program does.

---

## What is this
- A small program to manage employees (add, list, update, delete).
- Uses Java for the app, MySQL for data, and JDBC (Connector/J) to connect.

---

## Technologies
- Java (JDK 8+ recommended)
- MySQL (5.7+ or 8.0+)
- MySQL Connector/J (JDBC driver)
- Plain JDBC (no frameworks)

---

## Prerequisites
1. Java JDK installed.
2. MySQL server installed and running.
3. MySQL Connector/J (a .jar file) downloaded.
4. Basic command line knowledge.

---

## Database setup (simple)
Run these SQL commands in MySQL (for example using MySQL Workbench or mysql CLI):

CREATE DATABASE and table:
```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
  id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  email VARCHAR(150),
  department VARCHAR(100),
  salary DOUBLE,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

You can change names as you like (database name, table name, columns).

---

## Configuration
The code usually needs:
- JDBC URL, for example: `jdbc:mysql://localhost:3306/employee_db`
- Database username (e.g., `root`)
- Database password (your password)
- Path to MySQL Connector/J jar on the classpath

Example simple config file (config.properties):
```
db.url=jdbc:mysql://localhost:3306/employee_db
db.user=root
db.password=your_password_here
```

Place `config.properties` where the program reads it, or update the connection strings directly in code.

---

## How to compile and run (command line)
1. Put the MySQL Connector/J jar in the project folder (example: `mysql-connector-java.jar`).
2. Compile Java files:
   - On Linux/macOS:
     ```
     javac -cp .:mysql-connector-java.jar *.java
     ```
   - On Windows:
     ```
     javac -cp .;mysql-connector-java.jar *.java
     ```
3. Run the main class:
   - On Linux/macOS:
     ```
     java -cp .:mysql-connector-java.jar Main
     ```
   - On Windows:
     ```
     java -cp .;mysql-connector-java.jar Main
     ```
Replace `Main` with the real main class name in your project.

If your project uses packages, use the full package name when running.

---

## What the app does (typical)
- Add a new employee (asks for name, email, department, salary).
- List all employees.
- Update an employee by id.
- Delete an employee by id.
- Simple console-based menu (if implemented).

(If the code in your folder is different, follow its menu or methods.)

---

## Common problems & tips
- ClassNotFoundException for com.mysql.cj.jdbc.Driver:
  - Make sure Connector/J jar is on the classpath.
  - For newer drivers the driver registers automatically, but adding the jar is required.
- Access denied for user:
  - Check MySQL username/password.
  - Check user has access to the database.
- Port or connection refused:
  - Make sure MySQL server is running and listening on port 3306 (or your custom port).
- Timezone or SSL warnings:
  - You can add `?serverTimezone=UTC&useSSL=false` to the JDBC URL if needed.

Example:
```
jdbc:mysql://localhost:3306/employee_db?serverTimezone=UTC&useSSL=false
```

---


## Contributing
- Keep changes small and clear.
- If you add fields to the `employees` table, update the SQL schema and the Java code together.
- Add comments in code to explain database queries.

---

## License
- Add a LICENSE file if you want to make licensing clear (MIT is a common simple choice).

---
