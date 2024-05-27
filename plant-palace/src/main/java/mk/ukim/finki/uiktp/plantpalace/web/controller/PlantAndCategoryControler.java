package mk.ukim.finki.uiktp.plantpalace.web.controller;


import mk.ukim.finki.uiktp.plantpalace.model.Plant;
import mk.ukim.finki.uiktp.plantpalace.service.PlantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://localhost:4200")
@RequestMapping("/plants")
public class PlantAndCategoryControler {

    private final PlantService plantService;

    public PlantAndCategoryControler(PlantService plantService) {
        this.plantService = plantService;
    }


    @GetMapping
    public List<Plant> getAllPlants() {
        return plantService.getAllPlants();
    }

    @GetMapping("/{id}")
    public Plant getPlantById(@PathVariable Long id) {
        return plantService.getPlantById(id);
    }

    @PostMapping("/add")
    public Plant createPlant(@RequestBody Plant plant) {
        return plantService.createPlant(plant);
    }

    @PutMapping("/edit/{id}")
    public Plant updatePlant(@PathVariable Long id, @RequestBody Plant plantDetails) {
        return plantService.updatePlant(id, plantDetails);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlant(@PathVariable Long id) {
        plantService.deletePlant(id);
    }
}
