package com.zoo.zoopackage.service;

import com.zoo.zoopackage.model.Zoo;
import com.zoo.zoopackage.repos.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "zooService")
public class ZooServiceImpl implements ZooService
{
    @Autowired
    private ZooRepository zoorepo;
    
    @Override
    public ArrayList<Zoo> findAll()
    {
        ArrayList<Zoo> list = new ArrayList<>();
        zoorepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
    
    @Override
    public Zoo findZooByName(String name) throws EntityNotFoundException
    {
        Zoo zoo = zoorepo.findByZooname(name);
        
        if(zoo == null)
        {
            throw new EntityNotFoundException();
        }
        return zoo;
        
    }
    
    @Transactional
    @Override
    public void deleteById(long id) throws EntityNotFoundException
    {
        if(zoorepo.findById(id).isPresent())
        {
            zoorepo.deletePhoneRecordsByZooid(id);
            zoorepo.deleteZooFromAnimalRecords(id);
            zoorepo.deleteById(id);
        } else
        {
            throw new EntityNotFoundException();
        }
    }
    
    @Transactional
    @Override
    public Zoo addZoo(Zoo zoo)
    {
        zoorepo.addZoo(zoo.getZooname(), zoo.getZooid());
        
        return zoo;
    }
    
    @Transactional
    @Override
    public Zoo updateZoo(Zoo zoo, long zooid)
    {
        zoorepo.updateZoo(zoo.getZooname(), zooid);
        
        return zoo;
    }
}
