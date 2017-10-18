package org.calculator;

import java.util.Date;

public class DiscountCalculatorImpl implements DiscountCalculator {
	
	double discount=0;
	Date date;
	public DiscountCalculatorImpl(Date date)
	{
		this.date=date;
	}
	public DiscountCalculatorImpl()
	{
		this.date=new Date();
	}
	@Override
	public double calculateDiscunt(DiscountDayz dd) {
		if(dd.isDiscountDay(date))
		{
			if(date.getMonth()==6);
			discount=10;
			if(date.getMonth()==7);
			discount=20;
			if(date.getMonth()==9);
			discount=30;
		}
		return discount;
		
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "discount calculator providing "+discount+"% discount";
	}
	

}
