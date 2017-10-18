package org.calculator;

import java.util.Date;

public class Standard extends Automobile{
	
	private int nSeats;
	private Date eTest;
	
	public Standard(double range, int vin, double basePrice, String color,
			String mName,double luxuryTax, int nSeats, Date eTest){
		super(range,vin,basePrice,color,mName,luxuryTax);
		this.nSeats=nSeats;
		this.eTest=eTest;
		
	}

	public int getnSeats() {
		return nSeats;
	}

	public void setnSeats(int nSeats) {
		this.nSeats = nSeats;
	}

	public Date geteTest() {
		return eTest;
	}

	public void seteTest(Date eTest) {
		this.eTest = eTest;
	}
	
	public String toString(){
		return "Standard by "+getmName()+" with vin " +getVin()+ " is available to rent in " +getColor()+ " color. This beast has a range of " +getRange()+ " and only costs $" +getcost();
	}


}
