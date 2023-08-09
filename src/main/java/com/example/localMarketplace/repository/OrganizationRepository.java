package com.example.localMarketplace.repository;

import com.example.localMarketplace.model.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "organizations", path="organizations")
public interface OrganizationRepository extends MongoRepository<Organization, String> {
    List<Organization> findByName(@Param("name") String name);
}
