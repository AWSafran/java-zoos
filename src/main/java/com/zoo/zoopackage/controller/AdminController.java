package com.zoo.zoopackage.controller;

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
}
