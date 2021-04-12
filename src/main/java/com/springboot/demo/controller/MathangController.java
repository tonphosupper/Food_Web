package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Mathang;
import com.springboot.demo.repository.MathangRepository;

@RestController
@RequestMapping("/test")
public class MathangController {
	
	@Autowired
	MathangRepository mathangRepository;
	
	@GetMapping("/getall")
	public List<Mathang> getAllMH(){
		return mathangRepository.findAll();
	}
}
