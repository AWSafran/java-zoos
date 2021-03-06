package com.zoo.zoopackage.controller;

import com.zoo.zoopackage.model.Zoo;
import com.zoo.zoopackage.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController
{
    @Autowired
    private ZooService zooService;
    
    @DeleteMapping(value = "/zoos/{id}")
    public ResponseEntity<?> deleteZoo(@PathVariable long id)
    {
        zooService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PostMapping(value = "/zoos", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> addZoo(@RequestBody Zoo zoo)
    {
        zooService.addZoo(zoo);
        
        return new ResponseEntity<>(zoo, HttpStatus.OK);
    }
    
    @PutMapping(value = "/zoos/{id}", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> updateZoo(@RequestBody Zoo zoo, @PathVariable long id)
    {
        zooService.updateZoo(zoo, id);
        
        return new ResponseEntity<>(zoo, HttpStatus.OK);
    }
}
