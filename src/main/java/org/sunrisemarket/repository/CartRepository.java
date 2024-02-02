package org.sunrisemarket.repository;

import org.sunrisemarket.model.Cart;

import java.util.List;

public class CartRepository implements BaseRepository<Cart> {
    @Override
    public int insert(Cart obj) {
        return 0;
    }

    @Override
    public List<Cart> getAll() {
        return null;
    }

    @Override
    public Cart getById(Long id) {
        return null;
    }

    @Override
    public int update(Cart obj, Long id) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }
}
