package com.example.localMarketplace.repository;

import com.example.localMarketplace.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "ratings", path = "ratings")
public interface RatingRepository extends MongoRepository<Rating, String> {
    List<Rating> findByTitle(@Param("title") String title);
}
