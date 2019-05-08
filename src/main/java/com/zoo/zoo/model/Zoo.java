package com.zoo.zoo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
public class Zoo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;
    
    private String zooname;
    
    @OneToMany(mappedBy = "zoo")
    private List<Telephone> telephones = new ArrayList<>();
}
