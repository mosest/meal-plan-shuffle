package com.tara.mealplanshuffle.api;

import com.tara.mealplanshuffle.api.models.Food;
import com.tara.mealplanshuffle.api.models.Meal;
import com.tara.mealplanshuffle.api.models.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ApiService apiService;

    // Tag endpoints
    @GetMapping("/tags")
    public ResponseEntity<List<Tag>> getAllTags() {
        return ResponseEntity.ok(apiService.getAllTags());
    }

    @PostMapping("/tags")
    public ResponseEntity<Tag> insertTag(@RequestBody Tag tag) {
        return ResponseEntity.status(HttpStatus.CREATED).body(apiService.insertTag(tag));
    }

    @DeleteMapping("/tags")
    public ResponseEntity<Void> deleteTagsByIds(@RequestBody List<String> ids) {
        apiService.deleteTagsByIds(ids);
        return ResponseEntity.noContent().build();
    }

    // Food endpoints
    @GetMapping("/foods")
    public ResponseEntity<List<Food>> getAllFoods() {
        return ResponseEntity.ok(apiService.getAllFoods());
    }

    @PostMapping("/foods")
    public ResponseEntity<Food> insertFood(@RequestBody Food food) {
        return ResponseEntity.status(HttpStatus.CREATED).body(apiService.insertFood(food));
    }

    @DeleteMapping("/foods")
    public ResponseEntity<Void> deleteFoodsByIds(@RequestBody List<String> ids) {
        apiService.deleteFoodsByIds(ids);
        return ResponseEntity.noContent().build();
    }

    // Meal endpoints
    @GetMapping("/meals")
    public ResponseEntity<List<Meal>> getAllMeals() {
        return ResponseEntity.ok(apiService.getAllMeals());
    }

    @PostMapping("/meals")
    public ResponseEntity<Meal> insertMeal(@RequestBody Meal meal) {
        return ResponseEntity.status(HttpStatus.CREATED).body(apiService.insertMeal(meal));
    }

    @DeleteMapping("/meals")
    public ResponseEntity<Void> deleteMealsByIds(@RequestBody List<String> ids) {
        apiService.deleteMealsByIds(ids);
        return ResponseEntity.noContent().build();
    }
}


