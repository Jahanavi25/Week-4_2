package org.calculator;

import java.util.Date;

public class DiscountDayzImpl implements DiscountDayz {
	@Override
	public boolean isDiscountDay(Date date) {
		if(date.getMonth()==6||date.getMonth()==7||date.getMonth()==9)
			return true;
		else
			return false;
	}
}
