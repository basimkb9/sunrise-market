package org.sunrisemarket.repository;

import org.sunrisemarket.model.CartItem;

import java.util.List;

public class CartItemRepository implements BaseRepository<CartItem> {
    @Override
    public int insert(CartItem obj) {
        return 0;
    }

    @Override
    public List<CartItem> getAll() {
        return null;
    }

    @Override
    public CartItem getById(Long id) {
        return null;
    }

    @Override
    public int update(CartItem obj, Long id) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }
}
