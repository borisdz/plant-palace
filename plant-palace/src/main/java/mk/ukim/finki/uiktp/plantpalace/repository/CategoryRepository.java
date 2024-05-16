package mk.ukim.finki.uiktp.plantpalace.repository;

import mk.ukim.finki.uiktp.plantpalace.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
    List<Category> findAllByParent(Category parentCategory);
}
