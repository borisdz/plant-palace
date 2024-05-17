package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.Plant;
import mk.ukim.finki.uiktp.plantpalace.model.Plant_Category;
import mk.ukim.finki.uiktp.plantpalace.repository.PlantCategoryRepository;
import mk.ukim.finki.uiktp.plantpalace.service.PlantCategoryService;
import mk.ukim.finki.uiktp.plantpalace.service.PlantService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlantCategoryServiceImpl implements PlantCategoryService {

    private final PlantCategoryRepository plantCategoryRepository;

    public PlantCategoryServiceImpl(PlantCategoryRepository plantCategoryRepository) {
        this.plantCategoryRepository = plantCategoryRepository;
    }

    public List<Plant_Category> getAllCategories() {
        return plantCategoryRepository.findAll();
    }

    public Plant_Category getCategoryById(Long id) {
        return plantCategoryRepository.findById(id).orElse(null);
    }

    public Plant_Category createCategory(Plant_Category plantCategory) {
        return plantCategoryRepository.save(plantCategory);
    }

    public Plant_Category updateCategory(Long id, Plant_Category plantCategoryDetails) {
        Plant_Category plantCategory = plantCategoryRepository.findById(id).orElse(null);
        if (plantCategory != null) {
            plantCategory.setName(plantCategoryDetails.getName());
            return plantCategoryRepository.save(plantCategory);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        plantCategoryRepository.deleteById(id);
    }
}
