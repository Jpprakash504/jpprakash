package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cusrep;
	@Autowired
	RestTemplate restemp;
	 public String addcus( Customer c) {
		 String url1="http://localhost:8080/getBankByifsc/";
		 String j=c.getName();
		 String h=c.getBranch();
		
		 ResponseEntity<String> res=restemp.exchange(url1+j+"/"+h, HttpMethod.GET, null,String.class);
		 String th=res.getBody();
		 c.setIfsc(th);
		 cusrep.save(c);
		 return "Saved Sucssfully";
	 }
		

}
