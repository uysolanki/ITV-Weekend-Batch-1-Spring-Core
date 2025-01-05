package com.itv.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itv.config.BeanConfig;
import com.itv.model.Car;

public class JavaBasedDriver {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(BeanConfig.class);
//		Engine myEng=beanFactory.getBean("apple", Engine.class);
//		System.out.println(myEng);
		
//		Gear myGear=beanFactory.getBean("g2", Gear.class);
//		System.out.println(myGear);
		
		Car myCar=beanFactory.getBean("car1", Car.class);
		System.out.println(myCar);

	}

}
