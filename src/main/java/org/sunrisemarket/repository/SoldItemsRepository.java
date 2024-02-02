package org.sunrisemarket.repository;

import org.sunrisemarket.model.SoldItems;

import java.util.List;

public class SoldItemsRepository implements BaseRepository<SoldItems> {
    @Override
    public int insert(SoldItems obj) {
        return 0;
    }

    @Override
    public List<SoldItems> getAll() {
        return null;
    }

    @Override
    public SoldItems getById(Long id) {
        return null;
    }

    @Override
    public int update(SoldItems obj, Long id) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }
}
