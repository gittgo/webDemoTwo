package blackhorse.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

    private static String dburl;

    // 得到连接方法
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.208:3306/test","root","Root@827");

        return conn;
    }
}


