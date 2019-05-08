package com.zoo.zoo.model;

import javax.persistence.*;

@Entity
@Table(name = "telephone")
public class Telephone
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;
    
    private String zooname;
    private String phonenumber;
    
    @ManyToOne
    @JoinColumn(name = "zooid")
    private Zoo zoo;
}
