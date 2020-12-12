package com.example.junitlesson.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
public class JunitLessonApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void testMultiply1() throws Exception {
		mockMvc.perform(get("/calculator/multiply").param("x", "9").param("y", "9")).andExpect(content().string("81"))
				.andExpect(status().isOk());
	}

	@Test
	void testMultiply2() throws Exception {
		mockMvc.perform(get("/calculator/multiply").param("x", "0").param("y", "9")).andExpect(content().string("0"))
				.andExpect(status().isOk());
	}

	@Test
	void testMultipl3() throws Exception {
		mockMvc.perform(get("/calculator/multiply").param("x", "9").param("y", "0")).andExpect(content().string("0"))
				.andExpect(status().isOk());
	}

	@Test
	void testMultiply4() throws Exception {
		mockMvc.perform(get("/calculator/multiply").param("x", "0").param("y", "0")).andExpect(content().string("0"))
				.andExpect(status().isOk());
	}

	@Test
	void testMultiply5() throws Exception {
		mockMvc.perform(get("/calculator/multiply").param("x", "-9").param("y", "9")).andExpect(content().string("-81"))
				.andExpect(status().isOk());
	}

	@Test
	void testMultiply6() throws Exception {
		mockMvc.perform(get("/calculator/multiply").param("x", "9").param("y", "-9")).andExpect(content().string("-81"))
				.andExpect(status().isOk());
	}

	@Test
	void testMultiply7() throws Exception {
		mockMvc.perform(get("/calculator/multiply").param("x", "-9").param("y", "-9")).andExpect(content().string("81"))
				.andExpect(status().isOk());
	}

	@Test
	void testDivide1() throws Exception {
		mockMvc.perform(get("/calculator/divide").param("dividend", "9").param("divisor", "9"))
				.andExpect(content().string("1.0"))
				.andExpect(status().isOk());
	}

	@Test
	void testDivide2() throws Exception {
		mockMvc.perform(get("/calculator/divide").param("dividend", "9").param("divisor", "0"))
				.andExpect(content().string("除数に0は指定できません。"))
				.andExpect(status().is5xxServerError());
	}

	@Test
	void testDivide3() throws Exception {
		mockMvc.perform(get("/calculator/divide").param("dividend", "0").param("divisor", "9"))
				.andExpect(content().string("0.0"))
				.andExpect(status().isOk());
	}

	@Test
	void testDivide4() throws Exception {
		mockMvc.perform(get("/calculator/divide").param("dividend", "-9").param("divisor", "9"))
				.andExpect(content().string("-1.0"))
				.andExpect(status().isOk());
	}

	@Test
	void testDivide5() throws Exception {
		mockMvc.perform(get("/calculator/divide").param("dividend", "9").param("divisor", "-9"))
				.andExpect(content().string("-1.0"))
				.andExpect(status().isOk());
	}

	@Test
	void testDivide6() throws Exception {
		mockMvc.perform(get("/calculator/divide").param("dividend", "-9").param("divisor", "-9"))
				.andExpect(content().string("1.0"))
				.andExpect(status().isOk());
	}

	@Test
	void testDivide7() throws Exception {
		mockMvc.perform(get("/calculator/divide").param("dividend", "0").param("divisor", "0"))
				.andExpect(content().string("除数に0は指定できません。"))
				.andExpect(status().is5xxServerError());
	}
}
