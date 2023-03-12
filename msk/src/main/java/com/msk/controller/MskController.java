package com.msk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MskController {
	
	@Value("${msk.name}")
	   private String name;
	
	@GetMapping("/getname")
public String mskTest() {
	return "SUCCESS"+name;
}
}
