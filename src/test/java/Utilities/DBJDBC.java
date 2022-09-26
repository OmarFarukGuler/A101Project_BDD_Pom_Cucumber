package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.sql.*;

public class DBJDBC {
    public static void queryStart() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/zz_OFG_PROJE";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ResultSet resultSet = statement.executeQuery("select*from javadan_insert");
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnsInIndex = metaData.getColumnCount();

        for (int j = 1; j < columnsInIndex; j++) {
            System.out.printf("%-20s",metaData.getColumnName(j));
        }
        System.out.println();
        int a = 1;
        while (resultSet.next()) {
            for (int k = 1; k < columnsInIndex; k++) {
                System.out.printf("%-20s" , resultSet.getString(k));
            }
            System.out.println();
            a++;
        }
        System.out.println("a ="+(a-1));
    }


    public static void main(String[] args) throws SQLException {
        queryStart();
    }
}
