package com.example.localMarketplace.repository;

import com.example.localMarketplace.model.UserType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user-types", path = "user-types")
public interface UserTypeRepository extends MongoRepository<UserType, String> {
    List<UserType> findByname(@Param("name") String name);
}
