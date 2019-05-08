package com.zoo.zoopackage.repos;

import com.zoo.zoopackage.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
}
