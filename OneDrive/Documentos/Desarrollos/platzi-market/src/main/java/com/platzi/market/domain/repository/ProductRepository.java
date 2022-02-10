package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarceProducts(int quantity);
    Optional<List<Product>> getHigherValue (double price);
    Optional<Product> getProduct (int productId);
    Product save (Product product);
    void delete (int productId);
}
