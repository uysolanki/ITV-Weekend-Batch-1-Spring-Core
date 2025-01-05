package com.itv.model;

public class Gear {
			private int gearLever;
			private String gearMfgName;
			private int NumberOfGears;
			
			public Gear() {}

			public void setGearLever(int gearLever) {
				this.gearLever = gearLever;
			}

			public void setGearMfgName(String gearMfgName) {
				this.gearMfgName = gearMfgName;
			}

			public void setNumberOfGears(int numberOfGears) {
				NumberOfGears = numberOfGears;
			}

			@Override
			public String toString() {
				return "Gear [gearLever=" + gearLever + ", gearMfgName=" + gearMfgName + ", NumberOfGears="
						+ NumberOfGears + "]";
			}
			
			
}
