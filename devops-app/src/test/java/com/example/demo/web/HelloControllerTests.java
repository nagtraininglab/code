package com.example.demo.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = HelloController.class)
public class HelloControllerTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void helloTest() throws Exception {
		
		MvcResult result=mvc.perform(get("/api/hello"))
		.andExpect(status().isOk())
		.andReturn();
		
		String actualMessage=result.getResponse().getContentAsString();
		assertEquals("hello devops", actualMessage);
	}

}
