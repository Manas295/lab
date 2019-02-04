package com.boot.app.SpringBootJpaPostgresExample;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

import com.boot.app.SpringBootJpaPostgresExample.repository.CustomerRepository;
import com.boot.app.SpringBootJpaPostgresExample.service.Customer;
import com.couchbase.client.java.Bucket;

@SpringBootApplication
@EnableReactiveCouchbaseRepositories(considerNestedRepositories = true)
public class SpringBootJpaPostgresExampleApplication   {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaPostgresExampleApplication.class, args);
	}


	@Autowired Bucket bucket;
	@Autowired 
	CustomerRepository repository;



	Random r = new Random();

	@Bean
	public CommandLineRunner metho(){

		Customer john = new Customer(123L,"John","Doe");
		Customer dave = new Customer(987L,"Dave","Doe");
		System.out.println("run(String... args)");

		repository.saveAll(Arrays.asList(john,dave)).subscribe();
		return null;
	}
}