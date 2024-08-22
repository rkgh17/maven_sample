package com.test.sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void additionTest() {
		Calculator calc = new Calculator();
		int result = calc.add(2, 3);
		assertEquals(5, result);  // 2 + 3 = 5 여야 테스트 통과
	}
	
	@Test
	void subtractionTest() {
		Calculator calc = new Calculator();
		int result = calc.subtract(5, 3);
		assertEquals(2, result);  // 5 - 3 = 2 여야 테스트 통과
	}

}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}
