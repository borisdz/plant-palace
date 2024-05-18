package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.Category;

import java.util.List;

public interface CategoryService {

    Category findById(Long id);

    List<Category> listAll();

    Category create(String name, Long categoryId);

    List<Category> findAllByParent(Long id);

    Category delete(Long id);
}
