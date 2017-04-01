/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.ssdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author W208033650
 */
public class StudentDB {

    private static String dbURL = "jdbc:derby://localhost:1527/JavaClass;create=true;user=root;password=root";
    private static String tableName = "Student";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;

    public static void main(String[] args) {
        createConnection();
        insertStudents("LaVals", "Berkeley", 5);
        selectStudents();
        shutdown();
    }

    private static void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL);
        } catch (Exception except) {
            except.printStackTrace();
        }
    }

    private static void insertStudents(String firstName, String lastName, int age) {
        try {
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " (firstname, lastname, age) values ('" + firstName + "','" + lastName + "'," + age + ")");
            stmt.close();
        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }
    }

    private static void selectStudents() {
        try {
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select * from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i = 1; i <= numberCols; i++) {
                //print Column Names
                System.out.print(rsmd.getColumnLabel(i) + "\t\t");
            }

            System.out.println("\n--------------------------------------------------------------------");

            while (results.next()) {
                String firstName = results.getString(2);
                String lastName = results.getString(3);
                int age = results.getInt(4);

                System.out.println(firstName + "\t\t" + lastName + "\t\t" + age + "\t\t");
            }
            results.close();
            stmt.close();
        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }
    }

    private static void shutdown() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }
        } catch (SQLException sqlExcept) {

        }

    }
}
