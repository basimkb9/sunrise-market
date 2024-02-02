package org.sunrisemarket.repository;

import org.sunrisemarket.model.Product;

import java.util.List;

public class ProductRepository implements BaseRepository<Product> {
    @Override
    public int insert(Product obj) {
        return 0;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public int update(Product obj, Long id) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }
}
