package org.sunrisemarket.services;

import org.sunrisemarket.model.Product;

import java.util.List;

public class ProductService implements BaseService<Product> {
    @Override
    public int insert(Product obj) {
        return 0;
    }

    @Override
    public int update(Product obj, Long id) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
