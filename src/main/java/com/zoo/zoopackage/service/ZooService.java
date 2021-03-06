package com.zoo.zoopackage.service;

import com.zoo.zoopackage.model.Zoo;

import java.util.ArrayList;

public interface ZooService
{
    public ArrayList<Zoo> findAll();
    
    public Zoo findZooByName(String name);
    
    public void deleteById(long id);
    
    public Zoo addZoo(Zoo zoo);
    
    public Zoo updateZoo(Zoo zoo, long zooid);
}
