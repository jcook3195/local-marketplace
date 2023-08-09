package com.example.localMarketplace.repository;

import com.example.localMarketplace.model.BusinessType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "business-types", path = "business-types")
public interface BusinessTypeRepository extends MongoRepository<BusinessType, String> {
    List<BusinessType> findByName(@Param("name") String name);
}
