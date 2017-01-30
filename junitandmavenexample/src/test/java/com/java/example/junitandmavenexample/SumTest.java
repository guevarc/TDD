package com.java.example.junitandmavenexample;
import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
	
	@Test
	public void testSum() {
		Sum mySum = new Sum();
		int result = mySum.sum(2,5);
		assertEquals(7, result);
	}

}
