package org.sunrisemarket.services;

import org.sunrisemarket.exception.RecordAlreadyExistsException;
import org.sunrisemarket.model.Product;
import org.sunrisemarket.repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductService implements BaseService<Product> {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void insert(Product obj) {
        Product existingProduct = productRepository.getByTitle(obj.getTitle());

        try{
            if (existingProduct != null) {
                throw new RecordAlreadyExistsException("Record Already Exists");
            } else {
                productRepository.insert(obj);
            }
        }catch (RecordAlreadyExistsException | SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Product obj, Long id) {
        Product existingProduct = productRepository.getById(id);

        try{
            if (existingProduct != null) {
                productRepository.update(obj,id);
            } else {
                throw new RecordAlreadyExistsException("Record Doesn't exist with the provided ID");
            }
        }catch (RecordAlreadyExistsException | SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        Product existingProduct = productRepository.getById(id);

        try{
            if (existingProduct != null) {
                productRepository.deleteById(id);
            } else {
                throw new RecordAlreadyExistsException("Record Doesn't exist with the provided ID");
            }
        }catch (RecordAlreadyExistsException | SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Product getById(Long id) {
        return productRepository.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

}
