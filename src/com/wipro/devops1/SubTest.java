package com.wipro.devops1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void AddTest() {
		devopsnew junit= new devopsnew();
		int result=junit.sub(200, 100);
		assertEquals(100,result);
	}

}
