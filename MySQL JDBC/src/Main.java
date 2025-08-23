import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Employee Management System");
        CreateEmployeeTable(Url,UserName,Password);
        insertRecord(Url,UserName,Password);
        readRecord(Url,UserName,Password);
        updateRecord(Url,UserName,Password);
        deleteRecord(Url,UserName,Password);
        DeleteEmployeeTable(Url,UserName,Password);
    }
    public static final String Url =""; //Enter your database url 
    public static final String UserName = ""; //Enter your database username 
    public static final String Password = ""; //Enter your database password
    public static void CreateEmployeeTable( String Url, String UserName, String Password ) throws Exception {
        Connection connection = DriverManager.getConnection(Url,UserName,Password);
        Statement statement = connection.createStatement();
        String query ="create table Employee( emp_id int unique primary key, emp_name varchar(20) , emp_age int, emp_role varchar(15) default 'unassigned');";
        try {
            int rows = statement.executeUpdate(query);
            System.out.println("Employee Table created");
            System.out.println(rows + " row(s) affected");
            connection.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void DeleteEmployeeTable( String Url, String UserName, String Password ) throws Exception {
        Connection connection = DriverManager.getConnection(Url,UserName,Password);
        Statement statement = connection.createStatement();
        String query ="drop table Employee";
        int rows =statement.executeUpdate(query);
        System.out.println("Employee Table dropped");
        System.out.println(rows + " row(s) affected");
        connection.close();
    }

    public static void readRecord(String Url, String UserName, String Password ) throws Exception{
        String query = "select * from Employee";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(Url,UserName,Password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println("Employees Details from Database");
        while (resultSet.next()) {
        System.out.println("Employee ID: " + resultSet.getInt(1));
        System.out.println("Employee Name: " + resultSet.getString(2));
        System.out.println("Employee Age: " + resultSet.getInt(3));
        System.out.println("Employee Role: " + resultSet.getString(4));
        System.out.println("-----------------------------------------------------");
        }
        connection.close();
    }
    public static void insertRecord( String Url, String UserName, String Password ) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID( In Number ): ");
        int id =scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String Name =scanner.next();
        System.out.print("Enter Employee Age( In Number ): ");
        int age=scanner.nextInt();
        System.out.print("Enter Employee Role: ");
        String Role =scanner.next();
        /*  This is normal insert
        String query = "insert into Employee values("+id+","+Name+","+age+","+Role+");";
        Connection connection = DriverManager.getConnection(Url,UserName,Password);
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(query);
        System.out.println("Employee Details inserted into Database");
        System.out.println(rows + " row(s) affected");
        connection.close();
        */
        String query = "insert into Employee values(?,?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(Url,UserName,Password);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,Name);
        preparedStatement.setInt(3,age);
        preparedStatement.setString(4,Role);
        try {
            int rows = preparedStatement.executeUpdate();
            System.out.println("Record inserted successfully");
            System.out.println(rows + " row(s) affected");
        } catch (Exception e){
            System.out.println(e);
        }
        connection.close();
    }
    public static void updateRecord( String Url, String UserName, String Password ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID to be update( Note:Full Employee Details Can be Modify ): ");
        int idForUpdate = scanner.nextInt();
        System.out.print("Enter Employee Name to be Update: ");
        String NameForUpdate = scanner.next();
        System.out.print("Enter Employee Age to be Update: ");
        int ageForUpdate = scanner.nextInt();
        System.out.print("Enter Employee Role to be Update: ");
        String RoleForUpdate = scanner.next();
        String query = "update Employee set emp_name = ?, emp_age = ?, emp_role = ? where emp_id = " + "'" + idForUpdate + "'" ;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(Url,UserName,Password);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,NameForUpdate);
        preparedStatement.setInt(2,ageForUpdate);
        preparedStatement.setString(3,RoleForUpdate);
        int rows = preparedStatement.executeUpdate();
        System.out.println("Record successfully updated");
        System.out.println(rows + " row(s) affected");
        connection.close();
    }
    public static void deleteRecord( String Url, String UserName, String Password ) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection(Url,UserName,Password);
        Statement statement = connection.createStatement();
        System.out.print("Enter Employee ID to be delete:");
        int idForDelete = scanner.nextInt();
        String query = "delete from Employee where emp_id = " + "'" + idForDelete + "';";
        int rows = statement.executeUpdate(query);
        System.out.println("Record successfully deleted");
        System.out.println(rows + " row(s) affected");
        connection.close();
    }
}
