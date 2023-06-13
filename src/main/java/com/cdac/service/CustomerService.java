package com.cdac.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.model.Customer;
import com.cdac.repository.CustomerDto;


@Service
public class CustomerService {

	@Autowired 
	private CustomerDto customerDto;
	
	public void saveCustomer() {
		String line="";
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("src/main/resorces/fileName"));
			
			while((line=br.readLine())!=null) {
				
				String [] data=line.split(",");
				
				Customer c= new Customer();
				
				c.setName(data[0]);
				c.setIssue(data[1]);
				c.setIssueId(data[2]);
				c.setAge(data[3]);
				
				customerDto.save(c);
				
			}
			
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	
}


