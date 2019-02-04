package com.boot.app.SpringBootJpaPostgresExample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.app.SpringBootJpaPostgresExample.service.Customer;
import com.boot.app.SpringBootJpaPostgresExample.service.CustomerService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
	
	
	CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<Flux<Customer>> getAllCustomers() {
		return  new ResponseEntity<Flux<Customer>>(customerService.getAllCustomer(),HttpStatus.OK);
	}
	
	/*@PostMapping
	public ResponseEntity<Object> addCustomers(@RequestBody Customer customer) {
		long Id = customerService.addCustomerToList(customer);
		return new ResponseEntity<>(Id,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public Optional<Customer> getCustomer(@PathVariable Long id) {
		return customerService.getCustomerDetails(id);
	}*/
	
	@GetMapping("/bylastname/{lastName}")
	public Flux<Customer> getCustomerByLastName(@PathVariable String lastName) {
		System.out.println("getCustomerByLastName");
		return customerService.getCustomerByLastName(lastName);
	}
}
