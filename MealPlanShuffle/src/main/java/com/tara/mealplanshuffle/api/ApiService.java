package com.tara.mealplanshuffle.api;

import com.tara.mealplanshuffle.api.repositories.FoodRepository;
import com.tara.mealplanshuffle.api.repositories.MealRepository;
import com.tara.mealplanshuffle.api.repositories.TagRepository;
import com.tara.mealplanshuffle.api.models.Food;
import com.tara.mealplanshuffle.api.models.Meal;
import com.tara.mealplanshuffle.api.models.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApiService {
    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private MealRepository mealRepository;

    // Tag methods
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public Tag insertTag(Tag tag) {
        return tagRepository.save(tag);
    }

    public void deleteTagsByIds(List<String> ids) {
        tagRepository.deleteAllById(ids);
    }

    // Food methods
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food insertFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteFoodsByIds(List<String> ids) {
        foodRepository.deleteAllById(ids);
    }

    // Meal methods
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    public Meal insertMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public void deleteMealsByIds(List<String> ids) {
        mealRepository.deleteAllById(ids);
    }
}


