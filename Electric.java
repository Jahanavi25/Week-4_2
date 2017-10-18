package org.calculator;

import java.util.Date;

public class Electric extends Automobile {
	private boolean isTesla=false;
	private int nBatteries;
	
	public Electric(double range, int vin, double basePrice, String color,
			String mName,double luxuryTax, boolean isTesla, int nBatteries) throws VehicleOutOfRangeException{
		super(range,vin,basePrice,color,mName,luxuryTax);
		
		if(range<50||range>499)
			throw new VehicleOutOfRangeException("out of range");
		this.isTesla=isTesla;
		this.nBatteries=nBatteries;
	}

	public boolean isTesla() {
		return isTesla;
	}

	public void setTesla(boolean isTesla) {
		this.isTesla = isTesla;
	}

	public int getnBatteries() {
		return nBatteries;
	}

	public void setnBatteries(int nBatteries) {
		this.nBatteries = nBatteries;
	}
	
	public String toString(){
		return "Electric by "+getmName()+" with vin " +getVin()+ " is available to rent in " +getColor()+ " color. The monster has a range of " +getRange()+ " and only costs $" +getcost()+ "unless range exceeded";
	}

		

}
