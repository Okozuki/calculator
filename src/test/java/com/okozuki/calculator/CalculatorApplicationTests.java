package com.okozuki.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@DirtiesContext
class CalculatorApplicationTests {
	@Autowired
	private Calculator calculator;

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
