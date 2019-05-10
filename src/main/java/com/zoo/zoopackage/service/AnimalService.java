package com.zoo.zoopackage.service;

import com.zoo.zoopackage.model.Animal;
import com.zoo.zoopackage.view.CountZoosWithAnimal;

import java.util.ArrayList;
import java.util.List;

public interface AnimalService
{
    public ArrayList<Animal> findAll();
    
    public Animal findAnimalByName(String name);
    
    public ArrayList<CountZoosWithAnimal> getCountZoosWithAnimal();
}
