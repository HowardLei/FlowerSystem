package com.itcenter.service;

import com.itcenter.pojo.Flower;

import java.util.List;

/**
 * FlowerService interface
 *
 * @author apple
 * @date 2019/10/1
 */
public interface FlowerService {
    List<Flower> show();
    int add(Flower flower);
}
