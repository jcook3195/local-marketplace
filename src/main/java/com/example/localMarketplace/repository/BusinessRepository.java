package com.example.localMarketplace.repository;

import com.example.localMarketplace.model.Business;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "businesses", path="businesses")
public interface BusinessRepository extends MongoRepository<Business, String> {
    List<Business> findByName(@Param("name") String name);
}
