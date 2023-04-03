package com.msk.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.mock.mockito.MockBean;

import com.msk.service.EmpService;


//@ExtendWith(MockitoExtension.class)
public class TestMsk {
	
	@MockBean
	EmpService serv;

	@Before
	 void beforeTest() {
		//MockitoAnnotations.openMocks(this);
		System.out.println("Inside before");
	}
	
	@Test
	void firstTest() {
		System.out.print("first test");
		
		/*System.out.println(serv.findAllEmployeeByID(0));
		when(serv.findAllEmployeeByID(0)).thenReturn(serv.findAllEmployeeByID(0));*/
		assertEquals("msk","msk");
	}
}
