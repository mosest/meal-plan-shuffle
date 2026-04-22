package com.tara.mealplanshuffle.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "meals")
public class Meal {
    @Id
    private String id;
    private String name;
    private String description;
    private List<String> foodIds;
    private List<String> tagIds;

    public Meal() {
    }

    public Meal(String name, String description, List<String> foodIds, List<String> tagIds) {
        this.name = name;
        this.description = description;
        this.foodIds = foodIds;
        this.tagIds = tagIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getFoodIds() {
        return foodIds;
    }

    public void setFoodIds(List<String> foodIds) {
        this.foodIds = foodIds;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }
}

