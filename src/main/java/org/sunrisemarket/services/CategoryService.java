package org.sunrisemarket.services;

import org.sunrisemarket.exception.RecordAlreadyExistsException;
import org.sunrisemarket.exception.ResourceNotFoundException;
import org.sunrisemarket.model.Category;
import org.sunrisemarket.repository.CategoryRepository;

import java.sql.SQLException;
import java.util.List;

public class CategoryService implements BaseService<Category> {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @Override
    public void insert(Category obj){
        Category existingCategory = categoryRepository.getByName(obj.getTitle());

        try{
            if(existingCategory != null){
                throw new RecordAlreadyExistsException("Record Already Exists!");
            }
            else{
                categoryRepository.insert(obj);
            }
        }catch (SQLException | RecordAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Category obj, Long id) {
        Category existingCategory = categoryRepository.getById(id);

        try{
            if(existingCategory != null){
                categoryRepository.update(obj,id);
            }
            else{
                throw new ResourceNotFoundException("Record doesn't exist with the provided ID");
            }
        }catch (SQLException | ResourceNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void delete(Long id) {
        Category existingCategory = categoryRepository.getById(id);

        try{
            if(existingCategory != null){
                categoryRepository.deleteById(id);
            }
            else{
                throw new ResourceNotFoundException("Record doesn't exist with the provided ID");
            }
        }catch (SQLException | ResourceNotFoundException e) {
            System.out.println(e.getMessage());
        }
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
