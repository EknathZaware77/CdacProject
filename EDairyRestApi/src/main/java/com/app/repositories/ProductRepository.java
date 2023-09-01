package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
