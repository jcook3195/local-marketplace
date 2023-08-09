package com.example.localMarketplace.repository;

import com.example.localMarketplace.model.OrganizationType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "organization-types", path = "organization-types")
public interface OrganizationTypeRepository extends MongoRepository<OrganizationType, String> {
    List<OrganizationType> findByName(@Param("name") String name);
}
