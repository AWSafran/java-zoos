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
    
    private long zooid;
    
    @ManyToOne
    @JoinColumn(name = "zooid")
    private Zoo zoo;
    
    public Telephone()
    {
    }
    
    public Telephone(String zooname, String phonenumber, long zooid, Zoo zoo)
    {
        this.zooname = zooname;
        this.phonenumber = phonenumber;
        this.zooid = zooid;
        this.zoo = zoo;
    }
    
    public long getPhoneid()
    {
        return phoneid;
    }
    
    public void setPhoneid(long phoneid)
    {
        this.phoneid = phoneid;
    }
    
    public String getZooname()
    {
        return zooname;
    }
    
    public void setZooname(String zooname)
    {
        this.zooname = zooname;
    }
    
    public String getPhonenumber()
    {
        return phonenumber;
    }
    
    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    
    public long getZooid()
    {
        return zooid;
    }
    
    public void setZooid(long zooid)
    {
        this.zooid = zooid;
    }
    
    public Zoo getZoo()
    {
        return zoo;
    }
    
    public void setZoo(Zoo zoo)
    {
        this.zoo = zoo;
    }
}
