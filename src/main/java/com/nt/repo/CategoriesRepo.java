package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Categories;

public interface CategoriesRepo extends JpaRepository<Categories, Integer> {

}
