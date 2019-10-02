package com.itcenter.dao;

import com.itcenter.pojo.Flower;

import java.util.List;

/**
 * FlowerDao interface
 *
 * @author apple
 * @date 2019/9/30
 */
public interface FlowerDao {
    List<Flower> selAll();
    int insFlower(Flower flower);
}