package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.Plant;
import mk.ukim.finki.uiktp.plantpalace.repository.PlantRepository;
import mk.ukim.finki.uiktp.plantpalace.service.PlantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {

    private final PlantRepository plantRepository;

    public PlantServiceImpl(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public List<Plant> getAllPlants() {
        return this.plantRepository.findAll();
    }

    public Plant getPlantById(Long id) {
        return this.plantRepository.findById(id).orElse(null);
    }

    public Plant createPlant(Plant plant) {
        return this.plantRepository.save(plant);
    }

    public Plant updatePlant(Long id, Plant plantDetails) {
        Plant plant = plantRepository.findById(id).orElse(null);
        if (plant != null) {
            plant.setIme(plantDetails.getIme());
            plant.setName(plantDetails.getName());
            plant.setDescription(plantDetails.getDescription());
            plant.setPrice(plantDetails.getPrice());
            plant.setDiscount(plantDetails.getDiscount());
            plant.setTotalPrice(plantDetails.getTotalPrice());
            plant.setQuantity(plantDetails.getQuantity());
            plant.setFilePath(plantDetails.getFilePath());
            plant.setFileExtension(plantDetails.getFileExtension());
            plant.setSlug(plantDetails.getSlug());
            return plantRepository.save(plant);
        }
        return null;
    }

    public void deletePlant(Long id) {
        this.plantRepository.deleteById(id);
    }
}
