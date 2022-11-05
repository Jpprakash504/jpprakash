package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	CustomerService cuser;
	@PostMapping("/addcus")
	public String addcus(@RequestBody Customer c) {
		return cuser.addcus(c);
	}
	
	

}
