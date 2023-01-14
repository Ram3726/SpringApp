package com.SpringApplication.SpringApp.repository;

import com.SpringApplication.SpringApp.entity.FirstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstRepository extends JpaRepository<FirstEntity, Integer> {
}
