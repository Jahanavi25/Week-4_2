package org.calculator;

import java.util.Date;

public class Test {

	public static void main(String[] args) throws VehicleOutOfRangeException {
		// TODO Auto-generated method stub
		
		Standard s= new Standard(50,12,3000," black","ford",0.0,4,new Date());
		Electric e = new Electric(70,76,15000,"white","chrysler",153,false,2);
		Diesel d = new Diesel(80,54,8000,"red","fiat",50, 4, 3);
		SemiTruck st = new SemiTruck(99,66,20000,"silver","BMW",3000,4,5);
		
		Boat yacht = new Boat(BoatType.yacht,10000,8047,985000,"white",60000);
		Boat speedBoat = new Boat(BoatType.speed,100,123,35000,"whiteblack",2200);
		Boat b2 = new Boat(BoatType.barge,100,893,500000,"silver",5000);
		Boat b3 = new Boat(BoatType.cargo,100,542,750000,"cream",85000);

		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(d.toString());
		System.out.println(st.toString());
		
		System.out.println(yacht.toString());
		System.out.println(speedBoat.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		
		System.out.println(s.getcost());
		System.out.println(e.getcost());
		System.out.println(d.getcost());
		System.out.println(st.getcost());
		
		System.out.println(yacht.getcost());
		System.out.println(speedBoat.getcost());
		System.out.println(b2.getcost());
		System.out.println(b3.getcost());
		
		 double totalCost = 2*e.getcost()+speedBoat.getcost()+yacht.getcost()+st.getcost()+d.getcost()+s.getcost();
		 int tempCost=(int)(totalCost*100);
		 System.out.println(" cost of a business renting 2 electric cars, a speed boat, yaht, semi truck, diesel, and standard vehicles:"+(tempCost/100.0));
	}

}
