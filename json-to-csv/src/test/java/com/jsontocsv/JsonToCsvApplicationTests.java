package com.jsontocsv;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import com.jsontocsv.controller.*;
import com.jsontocsv.model.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonToCsvApplicationTests {
	String listOfFiles;
	
	@Test
	public void convertDataCsv() throws IOException {
		MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
		User user = new User("13","ali","ali@yahoo.com","1234","lahore","28");
		bodyMap.add("user", user);
		 HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap, headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<User> response = restTemplate.exchange("http://localhost:8080/AddUser",HttpMethod.POST, requestEntity, User.class);
		
		WriteCsv filepath = new WriteCsv();
		String filePath = filepath.writerFile(user);
		System.out.println("File Path "+filePath);
		
		System.out.println("Response value "+response);
	}
     }



	
