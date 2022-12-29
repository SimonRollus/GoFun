package com.spring.henallux.firstSpringProject.dataAccess.repository;


import com.spring.henallux.firstSpringProject.dataAccess.entity.DiscountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<DiscountEntity, Integer> {
}
