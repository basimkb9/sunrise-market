package org.sunrisemarket.services;

import org.sunrisemarket.model.Category;
import org.sunrisemarket.repository.CategoryRepository;

import java.util.List;

public class CategoryService implements BaseService<Category> {

    private final CategoryRepository categoryRepository = new CategoryRepository();

    @Override
    public int insert(Category obj) {
        return categoryRepository.insert(obj);
    }

    @Override
    public int update(Category obj, Long id) {
        return categoryRepository.update(obj,id);
    }

    @Override
    public int delete(Long id) {
        return categoryRepository.deleteById(id);
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
}
