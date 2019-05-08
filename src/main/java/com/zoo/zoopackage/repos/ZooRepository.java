package com.zoo.zoopackage.repos;

import com.zoo.zoopackage.model.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    public Zoo findByZooname(String name);
}
