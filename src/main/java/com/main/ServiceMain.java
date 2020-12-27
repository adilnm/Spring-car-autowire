package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CarService;

public class ServiceMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("service-car.xml");
		CarService srv = (CarService) context.getBean("srv1");

		System.out.println(srv.getEmployee());

	}

}
