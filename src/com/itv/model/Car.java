package com.itv.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car// implements InitializingBean,DisposableBean
{
	
		private String carMfgName;
		private String carModelName;
		private double price;
		private String color;
		
		private Engine engine;
		private Gear gear;
		
		public Car() {
			System.out.println("Constructor Called");
		}

		public void setCarMfgName(String carMfgName) {
			this.carMfgName = carMfgName;
		}

		public void setCarModelName(String carModelName) {
			this.carModelName = carModelName;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		public void setGear(Gear gear) {
			this.gear = gear;
		}

		@Override
		public String toString() {
			return "Car [carMfgName=" + carMfgName + ", carModelName=" + carModelName + ", price=" + price + ", color="
					+ color + ", engine=" + engine + ", gear=" + gear + "]";
		}

//		@Override
//		public void afterPropertiesSet() throws Exception {
//			System.out.println("After Construtor I will be called immidiately");
//			
//		}
//
//		@Override
//		public void destroy() throws Exception {
//			System.out.println("Just Before Destructor I will be called");
//			
//		}
		
		@PostConstruct
		public void apple()  {
			System.out.println("After Construtor I will be called immidiately@@@@@@");	
		}
		
		@PreDestroy
		public void mango()  {
			System.out.println("Just Before Destructor I will be called******");	
		}
}
