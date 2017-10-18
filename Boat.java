package org.calculator;

public class Boat {
	
	BoatType bt;
	private double range;
	private int vin;
	private double basePrice;
	private String color;
	private double luxuryTax;
	public Boat(BoatType bt, double range, int vin, double basePrice,
			String color, double luxuryTax) {
		super();
		this.bt = bt;
		this.range = range;
		this.vin = vin;
		this.basePrice = basePrice;
		this.color = color;
		this.luxuryTax = luxuryTax;
	}
	public BoatType getBt() {
		return bt;
	}
	public void setBt(BoatType bt) {
		this.bt = bt;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public int getVin() {
		return vin;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLuxuryTax() {
		return luxuryTax;
	}
	public void setLuxuryTax(double luxuryTax) {
		this.luxuryTax = luxuryTax;
	}
	
	public double getcost(){
		double cost = ((basePrice * (vin))/ range) + luxuryTax;
		DiscountCalculator dc= new DiscountCalculatorImpl();
		DiscountDayz dd = new DiscountDayzImpl();
		double discount = dc.calculateDiscunt(dd);
		cost = cost-(cost*(discount/100));
		int temp = (int) (cost*100);
		return temp/100.0;
	}

	
	public String toString(){
		return getBt()+" boatType with VIN "+getVin()+" is available to rent. This beauty has a range of "+getRange()
			+" and only costs $"+getcost();
	}
	
	

}
