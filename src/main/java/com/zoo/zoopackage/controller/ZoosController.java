package com.zoo.zoopackage.controller;

import com.zoo.zoopackage.model.Zoo;
import com.zoo.zoopackage.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping(value = "/zoos")
public class ZoosController
{
    @Autowired
    private ZooService zooService;
    
    // http://localhost:2019/zoos/zoos
    @GetMapping(value = "/zoos", produces = {"application/json"})
    public ResponseEntity<?> getAllZoos()
    {
        return new ResponseEntity<>(zooService.findAll(), HttpStatus.OK);
    }
    
    @GetMapping(value = "/{name}", produces = {"application/json"})
    public ResponseEntity<?> getZooByName(@PathVariable String name)
    {
        return new ResponseEntity<>(zooService.findZooByName(name), HttpStatus.OK);
    }
}
