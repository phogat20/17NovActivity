package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.h2.Driver");
        Connection connection = DriverManager.getConnection("jdbc:h2:./student", "sa", "");
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE student (id INTEGER , name VARCHAR (255),age INTEGER)");
//        statement.executeUpdate("INSERT INTO student(id,name,age) VALUES (1,'chetan',20)");
//        statement.executeUpdate("INSERT INTO student(id,name,age) VALUES (2,'sumit',21)");
//        ResultSet rs = statement.executeQuery("SELECT * FROM student");
//        while (rs.next()) {
//            System.out.println(rs.getInt("id"));
//            System.out.println(rs.getString("name"));
//            System.out.println(rs.getInt("age"));
        }

//        connection.close();
    }
//}

