package com.example.junitlesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@Autowired
	CalculatorService calculatorService;

	@GetMapping("/multiply")
	public ResponseEntity multiply(@RequestParam("x") int x, @RequestParam("y") int y) {
		return ResponseEntity.ok(calculatorService.multiply(x, y));
	}

	@GetMapping("/divide")
	public ResponseEntity<Double> divide(@RequestParam("dividend") int dividend, @RequestParam("divisor") int divisor)
			throws CalculatorException {
		return ResponseEntity.ok(calculatorService.divide(dividend, divisor));
	}
}
