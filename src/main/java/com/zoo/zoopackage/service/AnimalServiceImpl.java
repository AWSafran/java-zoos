package com.zoo.zoopackage.service;

import com.zoo.zoopackage.model.Animal;
import com.zoo.zoopackage.repos.AnimalRepository;
import com.zoo.zoopackage.view.CountZoosWithAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalRepository;
    
    @Override
    public ArrayList<Animal> findAll()
    {
        ArrayList<Animal> list = new ArrayList<>();
        
        animalRepository.findAll().iterator().forEachRemaining(list::add);
        
        return list;
    }
    
    @Override
    public Animal findAnimalByName(String name) throws EntityNotFoundException
    {
        Animal animal = animalRepository.findAnimalByAnimaltype(name);
        
        if(animal == null)
        {
            throw new EntityNotFoundException();
        }
        return animal;
    }
    
    @Override
    public ArrayList<CountZoosWithAnimal> getCountZoosWithAnimal()
    {
        return animalRepository.getCountZoosWithAnimal();
    }
}
