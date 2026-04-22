package com.tara.mealplanshuffle.api.repositories;

import com.tara.mealplanshuffle.api.models.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MealRepository extends MongoRepository<Meal, String> {
    List<Meal> findByName(String name);
}

