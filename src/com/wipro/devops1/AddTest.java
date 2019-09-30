package com.wipro.devops1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void AddTest() {
		devopsnew junit= new devopsnew();
		int result=junit.add(100, 200);
		assertEquals(300,result);
	}

}
