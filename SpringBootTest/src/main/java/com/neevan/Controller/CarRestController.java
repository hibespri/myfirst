package com.neevan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neevan.Entity.MyTable;
import com.neevan.Repository.CarRepository;

@RestController
public class CarRestController {

	MyTable car;
	@Autowired
	CarRepository repository;

	@GetMapping("/car")
	public MyTable getDetails(@RequestParam(value = "uid") long uid) {
		System.out.println("In car");
		car = new MyTable();
		car = repository.findById(uid).get();
		System.out.println(car.getColor());
		return car;
	}
}
