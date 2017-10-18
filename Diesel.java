package org.calculator;

public class Diesel extends Automobile {
	
	private int nWheels;
	private int cylinders;
	public Diesel(double range, int vin, double basePrice, String color, String mName,double luxuryTax,int nWheels, int cylinders) {
		super(range,vin,basePrice,color,mName,luxuryTax);
		this.nWheels = nWheels;
		this.cylinders = cylinders;
	}
	public Diesel(){
		
	}
	public int getnWheels() {
		return nWheels;
	}
	public void setnWheels(int nWheels) {
		this.nWheels = nWheels;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	
	public String toString(){
		return "Diesel by "+getmName()+" with vin " +getVin()+ " is available to rent in " +getColor()+ " color. This beast has a range of " +getRange()+ " and only costs $" +getcost();
	}

	


}
