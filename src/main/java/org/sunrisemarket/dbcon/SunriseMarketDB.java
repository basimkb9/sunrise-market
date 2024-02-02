package org.sunrisemarket.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SunriseMarketDB {
    protected Connection DBConn;
    private static final String connURL = "jdbc:mysql://127.0.0.1:3306/sunrisemarket";
    private static final String dbUser = "root";
    private static final String dbPassword = "basim123";

    public SunriseMarketDB(){
        if(DBConn == null){
            try {
                DBConn = DriverManager.getConnection(connURL,dbUser,dbPassword);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void closeConnection(){
        try {
            DBConn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
