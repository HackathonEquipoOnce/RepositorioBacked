package com.marketplace.NewPhone.repository;


import com.marketplace.NewPhone.model.Product;

import java.util.List;

public interface ProductRepository {
    public List<Product> getAll();
    public Product getById(Integer id);
}
