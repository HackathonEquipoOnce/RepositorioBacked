package com.marketplace.NewPhone.service;

import com.marketplace.NewPhone.model.Product;

import java.util.List;

public interface ProductService {
    public Product getById(int id);

    public List<Product> getAll();
}
