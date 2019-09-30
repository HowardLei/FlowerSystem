package com.itcenter.dao.impl;

import com.itcenter.dao.FlowerDao;
import com.itcenter.pojo.Flower;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {
    private static final String URL = "jdbc:mysql://localhost:3306/FlowerSystem";
    private static final String USER = "root";
    private static final String PASSWORD = "SweetieCan@0830";
    @Override
    public List<Flower> selAll() {
        var list = new ArrayList<Flower>();
        try {
            var connection = DriverManager.getConnection(URL, USER, PASSWORD);
            var statement = connection.createStatement();
            var resultSet = statement.executeQuery("select * from FlowerSystem.Flower;");
            while (resultSet.next()) {
                var id = resultSet.getInt(1);
                var name = resultSet.getString(2);
                var price = resultSet.getDouble(3);
                var production = resultSet.getString(4);
                var flower = new Flower(id, name, price, production);
                list.add(flower);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int addFlower(Flower flower) {
        return 0;
    }
}
