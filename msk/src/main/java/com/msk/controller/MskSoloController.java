package com.msk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msk.modal.Person;

@RestController
@RequestMapping("/api")
public class MskSoloController {

	@RequestMapping("/")
	public Person mskTest() {
		Person p = new Person();
		p.setId(2);
		p.setName("solo");
	return p;
}
}
