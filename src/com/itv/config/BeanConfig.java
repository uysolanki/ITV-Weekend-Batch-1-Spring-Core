package com.itv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itv.model.Car;
import com.itv.model.Engine;
import com.itv.model.Gear;

@Configuration
public class BeanConfig {

	@Bean(name="eng1")
	public Engine makeEngineUsingConstructor()
	{
		Engine e1=new Engine("Toyota", 30, 3000, "Petrol");
		return e1;
	}
	
	@Bean(name="eng2")
	public Engine makeEngineUsingConstructor1()
	{
		Engine e1=new Engine("Volvo", 40, 4000, "Diesel");
		return e1;
	}
	
	@Bean(name="g2")
	public Gear makeGearUsingSetter()
	{
		Gear gear=new Gear();
		gear.setGearLever(10);
		gear.setGearMfgName("Tata");
		gear.setNumberOfGears(18);
		return gear;
	}
	
	
	@Bean(name="car1")
	public Car makeCarUsingSetter()
	{
		Car car=new Car();
		car.setCarMfgName("Mercedes");
		car.setCarModelName("C Class");
		car.setColor("white");
		car.setPrice(3333);
		return car;
	}
}
