package com.zoo.zoopackage.service;

import com.zoo.zoopackage.model.Zoo;

import java.util.ArrayList;

public interface ZooService
{
    public ArrayList<Zoo> findAll();
    
    public Zoo findZooByName(String name);
}
