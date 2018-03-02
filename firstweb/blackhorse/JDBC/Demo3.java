package blackhorse.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3 {


    public void test1() throws Exception{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //反射机制加载驱动类
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.208:3306/test","root","Root@827");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM t_user");

        while (resultSet.next()){
            System.out.println(resultSet.getObject(2));
            System.out.println("--------------");
        }

        resultSet.close();
        statement.close();
        connection.close();

    }


    public void testinsert() throws Exception{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //反射机制加载驱动类
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.208:3306/test3?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true","root","Root@827");

        Statement statement = connection.createStatement();

        int i = statement.executeUpdate("insert INTO t_user VALUES (26 ,'王铮','admmmddd','dd')");

        System.out.println(i);

        statement.close();
        connection.close();
    }


    public void testupdate() throws Exception{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //反射机制加载驱动类
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.208:3306/test3?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true","root","Root@827");

        Statement statement = connection.createStatement();

        int i = statement.executeUpdate("UPDATE t_user SET username = '李四' WHERE id = '26'");

        System.out.println(i);

        statement.close();
        connection.close();
    }

    public void testdelete() throws Exception{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //反射机制加载驱动类
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.208:3306/test3?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true","root","Root@827");

        Statement statement = connection.createStatement();

        int i = statement.executeUpdate("DELETE from t_user WHERE id = '26'");

        System.out.println(i);

        statement.close();
        connection.close();
    }


}
