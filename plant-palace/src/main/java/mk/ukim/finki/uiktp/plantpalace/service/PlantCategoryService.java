package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.Plant_Category;

import java.util.List;

public interface PlantCategoryService {

    List<Plant_Category> getAllCategories();

    public Plant_Category getCategoryById(Long id);

    Plant_Category createCategory(Plant_Category plantCategory);

    Plant_Category updateCategory(Long id, Plant_Category plantCategoryDetails);

    public void deleteCategory(Long id);


}
