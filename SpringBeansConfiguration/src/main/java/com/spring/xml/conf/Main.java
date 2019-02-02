package com.spring.xml.conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.xml.Department;
import com.spring.beans.xml.Employee;
import com.spring.beans.xml.Operations;

public class Main {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	Employee employee = applicationContext.getBean(Employee.class);
	Department department = applicationContext.getBean(Department.class);
	Operations operations =  applicationContext.getBean(Operations.class);
	System.out.println(department);
	System.out.println(employee);
	System.out.println(operations);
	operations.helloWorld();
}
}
