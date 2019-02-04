package com.boot.app.SpringBootJpaPostgresExample.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;

import com.boot.app.SpringBootJpaPostgresExample.service.Customer;

import reactor.core.publisher.Flux;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "Customer", viewName = "all")
public interface CustomerRepository extends ReactiveCouchbaseRepository<Customer, Long> {
	
	
    Flux<Customer> findByLastName(String lastName);
    
    @View(designDocument = "Customer", viewName = "all")
	   Flux<Customer> findAll();


}
