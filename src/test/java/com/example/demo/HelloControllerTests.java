package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class HelloControllerTests {

    @Autowired
    private MockMvc mockMvc;

    /*@Test
    public void testHelloDefault() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }

    @Test
    public void testWithName() throws Exception {
        mockMvc.perform(get("/hello").param("name", "GitLab"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, GitLab!"));
    }*/

}
