package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.Category;
import mk.ukim.finki.uiktp.plantpalace.model.exceptions.InvalidCategoryIdException;
import mk.ukim.finki.uiktp.plantpalace.repository.CategoryRepository;
import mk.ukim.finki.uiktp.plantpalace.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()->new InvalidCategoryIdException(id));
    }

    @Override
    public List<Category> listAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category create(String name, Long categoryId) {
        Category category;
        if(categoryId==null){
            category = new Category(name);
        }else{
            Category parentCategory = categoryRepository.findById(categoryId).orElseThrow(()->new InvalidCategoryIdException(categoryId));
            category = new Category(name, parentCategory);
        }
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findAllByParent(Long id) {
        Category parentCategory = categoryRepository.findById(id).orElseThrow(()->new InvalidCategoryIdException(id));
        return categoryRepository.findAllByParent(parentCategory);
    }

    // Ako Category nema children ja brise samo
    // Ako Category ima children ja brishe + site children
    @Override
    public Category delete(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(()->new InvalidCategoryIdException(id));

        deleteChildCategories(category);
        categoryRepository.delete(category);

        return category;
    }

    private void deleteChildCategories(Category parentCategory) {
        List<Category> childCategories = categoryRepository.findAllByParent(parentCategory);

        for (Category childCategory : childCategories) {
            deleteChildCategories(childCategory);
            categoryRepository.delete(childCategory);
        }
    }
}
