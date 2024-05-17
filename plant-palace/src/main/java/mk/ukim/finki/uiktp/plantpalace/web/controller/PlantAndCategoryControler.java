package mk.ukim.finki.uiktp.plantpalace.web.controller;


import mk.ukim.finki.uiktp.plantpalace.model.Plant;
import mk.ukim.finki.uiktp.plantpalace.model.Plant_Category;
import mk.ukim.finki.uiktp.plantpalace.service.PlantCategoryService;
import mk.ukim.finki.uiktp.plantpalace.service.PlantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plantscategory")
public class PlantAndCategoryControler {

    private final PlantService plantService;

    private final PlantCategoryService plantCategoryService;

    public PlantAndCategoryControler(PlantService plantService, PlantCategoryService plantCategoryService) {
        this.plantService = plantService;
        this.plantCategoryService = plantCategoryService;
    }


    @GetMapping("/plants")
    public List<Plant> getAllPlants() {
        return plantService.getAllPlants();
    }

    @GetMapping("/plants/{id}")
    public Plant getPlantById(@PathVariable Long id) {
        return plantService.getPlantById(id);
    }

    @PostMapping("/plants")
    public Plant createPlant(@RequestBody Plant plant) {
        return plantService.createPlant(plant);
    }

    @PutMapping("/plants/{id}")
    public Plant updatePlant(@PathVariable Long id, @RequestBody Plant plantDetails) {
        return plantService.updatePlant(id, plantDetails);
    }

    @DeleteMapping("/plants/{id}")
    public void deletePlant(@PathVariable Long id) {
        plantService.deletePlant(id);
    }


    @GetMapping("/categories")
    public List<Plant_Category> getAllCategories() {
        return plantCategoryService.getAllCategories();
    }

    @GetMapping("/categories/{id}")
    public Plant_Category getCategoryById(@PathVariable Long id) {
        return plantCategoryService.getCategoryById(id);
    }

    @PostMapping("/categories")
    public Plant_Category createCategory(@RequestBody Plant_Category plantCategory) {
        return plantCategoryService.createCategory(plantCategory);
    }

    @PutMapping("/categories/{id}")
    public Plant_Category updateCategory(@PathVariable Long id, @RequestBody Plant_Category plantCategoryDetails) {
        return plantCategoryService.updateCategory(id, plantCategoryDetails);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        plantCategoryService.deleteCategory(id);
    }




}
