package com.zoo.zoopackage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.zoo.zoopackage.view.View;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(View.AnimalsOnly.class)
    private long animalid;
    
    @JsonView(View.AnimalsOnly.class)
    private String animaltype;
    
    @ManyToMany(mappedBy = "animals")
    @JsonIgnoreProperties("animals")
    private List<Zoo> zoos = new ArrayList<>();
    
    public Animal()
    {
    }
    
    public Animal(String animaltype, List<Zoo> zoos)
    {
        this.animaltype = animaltype;
        this.zoos = zoos;
    }
    
    public long getAnimalid()
    {
        return animalid;
    }
    
    public void setAnimalid(long animalid)
    {
        this.animalid = animalid;
    }
    
    public String getAnimaltype()
    {
        return animaltype;
    }
    
    public void setAnimaltype(String animaltype)
    {
        this.animaltype = animaltype;
    }
    
    public List<Zoo> getZoos()
    {
        return zoos;
    }
    
    public void setZoos(List<Zoo> zoos)
    {
        this.zoos = zoos;
    }
}
