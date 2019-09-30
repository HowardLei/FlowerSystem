package com.itcenter.util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    private static final String URL = "";
    private static final String USER = "root";
    private static final String PASSWORD = "SweetieCan@0830";
    public static void connection() {
        try {
            var connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
