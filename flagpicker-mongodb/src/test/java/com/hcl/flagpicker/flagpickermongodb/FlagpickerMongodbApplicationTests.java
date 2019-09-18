package com.hcl.flagpicker.flagpickermongodb;

import com.hcl.flagpicker.flagpickermongodb.repositoty.ContinentRepositoty;
import com.hcl.flagpicker.flagpickermongodb.service.ContinentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

@RunWith(SpringRunner.class)
@WebMvcTest
public class FlagpickerMongodbApplicationTests {

	@Autowired
	MockMvc mockMvc;

	//Mockito.mock
	//ContinentService continentService= Mockito.mock(ContinentService.class);

	@MockBean
	private ContinentService continentService;

//	@MockBean
//	private ContinentRepositoty continentRepositoty;

	private ContinentRepositoty continentRepositoty = Mockito.mock(ContinentRepositoty.class);

	@Test
	public void contextLoad() {

	}

//	@Test
//	public void testGetAll() throws Exception {
//
//    	Mockito.when(continentRepositoty.findAll()).thenReturn(
//          	Collections.emptyList()
//    	);
//
//    	MvcResult mvcResult = mockMvc.perform(
//          	MockMvcRequestBuilders.get("/")
//                .accept(MediaType.APPLICATION_JSON)
//    			).andReturn();
//
//    	System.out.println(mvcResult.getResponse());
//
//    	Mockito.verify(continentRepositoty).findAll();
// 	}

}
