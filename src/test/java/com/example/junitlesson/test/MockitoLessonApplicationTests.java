package com.example.junitlesson.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junitlesson.CalculatorException;
import com.example.junitlesson.CalculatorService;

@SpringBootTest
public class MockitoLessonApplicationTests {

	@Mock
	private CalculatorService calService;

	@BeforeEach
	void setup() throws CalculatorException {
		when(calService.multiply(9, 9)).thenReturn(81);
		when(calService.multiply(9, 0)).thenReturn(0);
		when(calService.multiply(0, 9)).thenReturn(0);
		when(calService.multiply(0, 0)).thenReturn(0);
		when(calService.multiply(-9, 9)).thenReturn(-81);
		when(calService.multiply(9, -9)).thenReturn(-81);
		when(calService.multiply(-9, -9)).thenReturn(81);
		when(calService.divide(9, 9)).thenReturn((double) 1);
		when(calService.divide(9, 0)).thenReturn((double) 0);
		when(calService.divide(0, 9)).thenReturn((double) 0);
		when(calService.divide(-9, 9)).thenReturn((double) -1);
		when(calService.divide(9, -9)).thenReturn((double) -1);
		when(calService.divide(-9, -9)).thenReturn((double) 1);
		when(calService.divide(0, 0)).thenReturn((double) 0);

	}

	@Test
	void testMultiply() throws CalculatorException {
		assertEquals(81, calService.multiply(9, 9));
		assertEquals(0, calService.multiply(9, 0));
		assertEquals(0, calService.multiply(0, 9));
		assertEquals(0, calService.multiply(0, 0));
		assertEquals(-81, calService.multiply(-9, 9));
		assertEquals(-81, calService.multiply(9, -9));
		assertEquals(81, calService.multiply(-9, -9));

	}

	@Test
	void testDivide() throws CalculatorException {
		assertEquals(1, calService.divide(9, 9));
		assertEquals(0, calService.divide(9, 0));
		assertEquals(0, calService.divide(0, 9));
		assertEquals(-1, calService.divide(-9, 9));
		assertEquals(-1, calService.divide(9, -9));
		assertEquals(1, calService.divide(-9, -9));
		assertEquals(0, calService.divide(0, 0));
	}

}
