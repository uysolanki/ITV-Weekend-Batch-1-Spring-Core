package com.itv.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itv.model.Car;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/bean-config.xml");
//		Engine myEngine=(Engine)beanFactory.getBean("e2");
//		System.out.println(myEngine);
		
//		Gear myGear=(Gear)beanFactory.getBean("g1");
//		System.out.println(myGear);
		
		Car myCar=(Car)beanFactory.getBean("c1");
		System.out.println(myCar);

	}

}
