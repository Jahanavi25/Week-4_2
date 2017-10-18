package org.calculator;
//calculating automobile prices
//testing
public class Automobile {
	private double range;
	private int vin;
	private double basePrice;
	private String color;
	private final String mName;
	private double luxuryTax;
	

    public Automobile(){
    	this(0.0,0,0.0,"black"," ",0.0);
    }
	public Automobile(double range, int vin, double basePrice, String color,
			String mName,double luxuryTax) {
		super();
		this.range = range;
		this.vin = vin;
		this.basePrice = basePrice;
		this.color = color;
		this.mName = mName;
		this.luxuryTax=luxuryTax;
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
	public String getmName() {
		return mName;
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
	
		
	

}
