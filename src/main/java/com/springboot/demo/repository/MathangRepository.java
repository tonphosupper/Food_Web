package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.model.Mathang;

public interface MathangRepository extends JpaRepository<Mathang, Long> {

}
