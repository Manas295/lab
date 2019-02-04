package com.example.springreactivedemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.config.AbstractReactiveCouchbaseConfiguration;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.repository.annotation.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableReactiveCouchbaseRepositories(considerNestedRepositories = true)
public class SpringreactivedemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringreactivedemoApplication.class, args);
	}
	
		@Autowired Bucket bucket;
		@Autowired UserRepository repository;

		
		User john = new User("johnd","John","Doe",0);
		User dave = new User("daved","Dave","Doe",0);
		
		Random r = new Random();
		
		@Override
		public void run(String... args) throws Exception {
			
			System.out.println("run(String... args)");
			
			repository.saveAll(Arrays.asList(john,dave));
			/*
			Flux.interval(Duration.ofSeconds(1))
			.doOnNext(x -> {
				int johnHearRate = r.nextInt(175 - 60) + 60;
				int daveHearRate = r.nextInt(175 - 60) + 60;
				
				System.out.println("johnHearRate" + johnHearRate);
				System.out.println("daveHearRate" + daveHearRate);
				
				if(johnHearRate > 120)
				{
					bucket.mutateIn(john.id).counter("activeminutes", 1).execute();
				}
				
				if(daveHearRate > 120)
				{
					bucket.mutateIn(dave.id).counter("activeminutes", 1).execute();
				}
			});*/
		}
	}
		
		

	

@RestController
@RequiredArgsConstructor
class ActivityTrackerController{
	@Autowired UserRepository repository;
	
	@GetMapping("/leader")
	@ResponseBody
	Flux<User> getLeader()
	{
		System.out.println("Start");
		if(repository == null)
		{
			System.out.println("repository is null");
		}
		else
		{
			System.out.println("repository is initialized");
		}
		//Mono<User> user = repository.findById("johnd");
		//System.out.println(user.flatMap(p -> p.firstname));
		/*System.out.println("First Name: "+user.map(p -> p.firstname));
		System.out.println("Last Name: "+user.map(p -> p.lastname));
		System.out.println("All: "+repository.findById("johnd"));*/
		return repository.findAll();
	}
	
	@PostMapping("/leader/add")
	public Mono<User> addUser(@RequestBody User user)
	{
		return repository.save(user);
	}
	
	@GetMapping("/leader/{id}")
	public Mono<User> getLeader(@PathVariable String id)
	{
		return repository.findById(id);
	}
	
	
	/*@GetMapping(value = "/leaderStream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	Flux<User> getLeaderStream()
	{
		System.out.println("Start: getLeaderStream()");
		return Flux.interval(Duration.ofSeconds(5))
				.flatMap(x -> {
				System.out.println("Before findTop1ByActiveMinutesGreaterThanOrderByActiveMinutes");	
				return repository.findTop1ByActiveMinutesGreaterThanOrderByActiveMinutes(0);
				});
	}*/
}

@Document
class User {
	
	public User(String id, String firstname, String lastname, int activeMinutes) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.activeMinutes = activeMinutes;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", activeMinutes="
				+ activeMinutes + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getActiveMinutes() {
		return activeMinutes;
	}
	public void setActiveMinutes(int activeMinutes) {
		this.activeMinutes = activeMinutes;
	}
	@Id
	String id;
	@Field
	String firstname;
	@Field
	String lastname;
	@Field
	int activeMinutes;
}


@Repository
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "User", viewName = "all")
interface UserRepository extends ReactiveCouchbaseRepository<User, String>
{
	/*List<User> findByFirstname(String firstName);	*/
	 @View
	  List<User> findAllAdmins();
	 @View(viewName="firstNames")
	  List<User> findByFirstnameStartingWith(String fnamePrefix);
	 
	 @View(designDocument = "User", viewName = "all")
	   Flux<User> findAll();
}



/*@Configuration
class Config extends AbstractReactiveCouchbaseConfiguration{
	
	
	@Override
	protected List<String> getBootstrapHosts() {
		// TODO Auto-generated method stub
		return Arrays.asList("127.0.0.1");
	}

	@Override
	protected String getBucketName() {
		// TODO Auto-generated method stub
		return "acitivitytracker";
	}

	@Override
	protected String getBucketPassword() {
		// TODO Auto-generated method stub
		return "system123#";
	}
	*/
//}

