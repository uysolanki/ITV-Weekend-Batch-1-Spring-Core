package com.itv.model;

import org.springframework.stereotype.Component;

@Component
public class Engine {
			private String engineMfgName;
			private int engineLitreCapacity;
			private int enginceCC;
			private String engineType;
			
			//Constructor Dependency Injection
			public Engine(String engineMfgName, int engineLitreCapacity, int enginceCC, String engineType) {
				this.engineMfgName = engineMfgName;
				this.engineLitreCapacity = engineLitreCapacity;
				this.enginceCC = enginceCC;
				this.engineType = engineType;
			}
			
			@Override
			public String toString() {
				return "Engine [engineMfgName=" + engineMfgName + ", engineLitreCapacity=" + engineLitreCapacity
						+ ", enginceCC=" + enginceCC + ", engineType=" + engineType + "]";
			}
			
			
			
}
