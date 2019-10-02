package com.itcenter.dao.impl;

import com.itcenter.dao.FlowerDao;
import com.itcenter.pojo.Flower;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * FlowerDaoImpl class
 *
 * @author apple
 * @date 2019/9/30
 */
public class FlowerDaoImpl implements FlowerDao {
    private static final String URL = "jdbc:mysql://localhost:3306/FlowerSystem";
    private static final String USER = "root";
    private static final String PASSWORD = "SweetieCan@0830";
    @Override
    public List<Flower> selAll() {
        var list = new LinkedList<Flower>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
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
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insFlower(Flower flower) {
        try {
            var connection = DriverManager.getConnection(URL, USER, PASSWORD);
            var preparedStatement = connection.prepareStatement("insert into FlowerSystem.Flower(name, price, production) values (?, ?, ?);");
            preparedStatement.setObject(1, flower.getName());
            preparedStatement.setObject(2, flower.getPrice());
            preparedStatement.setObject(3, flower.getProduction());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
