package com.zoo.zoopackage.repos;

import com.zoo.zoopackage.model.Zoo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    public Zoo findByZooname(String name);
    
    @Modifying
    @Query(value = "DELETE FROM zooanimals WHERE zooid = :zooid", nativeQuery = true)
    void deleteZooFromAnimalRecords(long zooid);
    
    @Modifying
    @Query(value = "DELETE FROM telephone WHERE zooid = :zooid", nativeQuery = true)
    void deletePhoneRecordsByZooid(long zooid);
}
