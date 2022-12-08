package com.jcodepoint.jwt.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcodepoint.jwt.response.Product;

@RestController
public class ProductsController {

	@GetMapping(path = "/products")
	public List<Product> listProducts() {
		return Arrays.asList(new Product("001", "Resma", 100D));
	}
	
}
