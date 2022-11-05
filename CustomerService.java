package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class CustomerService {
	@Autowired
	CustomerDao cusdao;
	
	public String addcus(@RequestBody Customer c) {
		return cusdao.addcus(c);

}
}
