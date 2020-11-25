package com.ferescalona.minesweeperapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ferescalona.minesweeperapi.game.Cell;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    @Qualifier("getCell2")
    private Cell cell;

    @Before
    public void setUp() {

        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void getItworks() throws Exception {
        mockMvc.perform(get("/itworks")).andExpect(status().isOk()).andReturn();
    }

    @Test
    public void getItworksNot() throws Exception {
        mockMvc.perform(get("/itwork")).andExpect(status().isNotFound()).andReturn();
    }

    @Test
    public void getMethodName() throws Exception {

        mockMvc.perform(get("/test")).andExpect(status().isOk()).andExpect(content().string("Tu mamá! Mamagüevazo false"));


    }

}