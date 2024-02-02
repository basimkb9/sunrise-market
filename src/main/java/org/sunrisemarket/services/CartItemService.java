package org.sunrisemarket.services;

import org.sunrisemarket.model.CartItem;

import java.util.List;

public class CartItemService implements BaseService<CartItem>{
    @Override
    public int insert(CartItem obj) {
        return 0;
    }

    @Override
    public int update(CartItem obj, Long id) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public CartItem getById(Long id) {
        return null;
    }

    @Override
    public List<CartItem> getAll() {
        return null;
    }
}
