package com.jsontocsv.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jsontocsv.model.*;

public class WriteCsv {
	final String  CsvHeader ="id,name,email,password,address,age";
	
	
	String filepath = null;
	public String  writerFile(User user) throws IOException {
	
	
	
//	User user = new User();
		List<User> users = new ArrayList<>();
		users.add(user);
		
		
	 
	 
	boolean alreadyExists = new File("src/main/resources/CsvFiles/User.csv").exists();
		
	FileWriter fileWriter = new FileWriter("src/main/resources/CsvFiles/User.csv",true);
		if (!alreadyExists) {
			fileWriter.append(CsvHeader);
			fileWriter.append('\n');
		}
		
		for (User user1:users) {
				fileWriter.append(user1.getId());
				fileWriter.append(',');
				fileWriter.append(user1.getName());
				fileWriter.append(',');
				fileWriter.append(user1.getEmail());
				fileWriter.append(',');
				fileWriter.append(user1.getPassword());
				fileWriter.append(',');
				fileWriter.append(user1.getAddress());
				fileWriter.append(',');
				fileWriter.append(user1.getAge());
				fileWriter.append('\n');
			}
			
		System.out.println("Write SCV Succefully");
		fileWriter.flush();
		fileWriter.close();
		File file = new File("User.csv");
		filepath = file.getAbsolutePath();

	
		return filepath;
	}
	}
	

