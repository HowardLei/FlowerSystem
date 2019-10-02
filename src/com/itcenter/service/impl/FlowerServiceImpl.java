package com.itcenter.service.impl;

import com.itcenter.dao.FlowerDao;
import com.itcenter.dao.impl.FlowerDaoImpl;
import com.itcenter.pojo.Flower;
import com.itcenter.service.FlowerService;

import java.util.List;

/**
 * FlowerServiceImpl class
 *
 * @author apple
 * @date 2019/10/1
 */
public class FlowerServiceImpl implements FlowerService {
    private FlowerDao flowerDao = new FlowerDaoImpl();
    @Override
    public List<Flower> show() {
        return flowerDao.selAll();
    }

    @Override
    public int add(Flower flower) {
        return flowerDao.insFlower(flower);
    }
}
