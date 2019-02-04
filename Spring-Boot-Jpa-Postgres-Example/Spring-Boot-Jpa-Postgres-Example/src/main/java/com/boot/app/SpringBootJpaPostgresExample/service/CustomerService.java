package com.boot.app.SpringBootJpaPostgresExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.app.SpringBootJpaPostgresExample.repository.CustomerRepository;

import reactor.core.publisher.Flux;


@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	/*public long addCustomerToList(Customer customer) {
		//topic.add(topic1);
		return customerRepository.save(customer).getId();
	}
*/
	public Flux<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	/*public Optional<Customer> getCustomerDetails(Long Id) {

		return customerRepository.findById(Id);

	}*/

	public Flux<Customer> getCustomerByLastName(String lastname) {
		
		return customerRepository.findByLastName(lastname);

	}
}
