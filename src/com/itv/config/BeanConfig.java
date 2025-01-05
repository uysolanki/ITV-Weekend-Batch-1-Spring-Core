package com.itv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itv.model.Engine;
import com.itv.model.Gear;

@Configuration
public class BeanConfig {

	@Bean(name="apple")
	public Engine makeEngineUsingConstructor()
	{
		Engine e1=new Engine("Toyota", 30, 3000, "Petrol");
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
}
