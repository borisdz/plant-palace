package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.Plant;

import java.util.List;

public interface PlantService {

    List<Plant> getAllPlants();

    Plant getPlantById(Long id);

    Plant createPlant(Plant plant);

    Plant updatePlant(Long id, Plant plantDetails);

     void deletePlant(Long id);
}
