package org.calculator;

public class SemiTruck extends Diesel {
	
	public SemiTruck(double range, int vin, double basePrice, String color, String mName,double luxuryTax,int nWheels, int cylinders) throws VehicleOutOfRangeException {
		
		super(range,vin,basePrice,color,mName,luxuryTax,nWheels,cylinders);
		if(range<50||range>499)
			throw new VehicleOutOfRangeException("out of range");
		
		
		
	}
	
	public String toString(){
		return "SemiTruck by "+getmName()+" with vin " +getVin()+ " is available to rent in " +getColor()+ " color. The monster has a range of " +getRange()+ " and only costs $" +getcost()+ "unless range exceeded";
	}

}
