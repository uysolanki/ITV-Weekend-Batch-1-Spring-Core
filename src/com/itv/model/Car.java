package com.itv.model;

public class Car {
	
		private String carMfgName;
		private String carModelName;
		private double price;
		private String color;
		
		private Engine engine;
		private Gear gear;
		
		public Car() {}

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
		
		
}
