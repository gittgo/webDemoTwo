package blackhorse.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {


    public static void main(String[] args) throws Exception{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.208:3306/rtwm_project","root","Root@827");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM uc_user");

        while (resultSet.next()){
            System.out.println(resultSet.getObject(2));
            System.out.println("--------------");
        }

        resultSet.close();
        statement.close();
        connection.close();


    }
}
