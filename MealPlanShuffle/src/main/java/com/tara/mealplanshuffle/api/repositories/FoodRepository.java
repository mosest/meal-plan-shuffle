package com.tara.mealplanshuffle.api.repositories;

import com.tara.mealplanshuffle.api.models.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FoodRepository extends MongoRepository<Food, String> {
    List<Food> findByName(String name);
}

