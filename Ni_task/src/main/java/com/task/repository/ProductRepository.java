package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
