package cucumberJava;

import java.util.Date;

import org.calculator.Boat;
import org.calculator.BoatType;
import org.calculator.Diesel;
import org.calculator.Electric;
import org.calculator.SemiTruck;
import org.calculator.Standard;
import org.calculator.VehicleOutOfRangeException;

import static org.junit.Assert.*;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class CucumberJava2 {
	
	Electric e=null;
	@Given("^Electric Car$")
	public void Electric_Car() {
	  
	}

	@When("^The vin is (\\d+), the color is red, and it is not a discount day$")
	public void The_vin_is_the_color_is_red_and_it_is_not_a_discount_day(int arg1) throws VehicleOutOfRangeException {
	   e = new Electric(300,508,200,"red","Tesla",200,false,4);
	}

	@Then("^Electric by tesla with VIN (\\d+) is available to rent in red. This monster has a range of (\\d+) and only costs \\$(\\d+).(\\d+) unless range exceeded.$")
	public void Electric_by_tesla_with_VIN_is_available_to_rent_in_red_This_monster_has_a_range_of_and_only_costs_$_unless_range_exceeded(int arg1, int arg2, int arg3, int arg4) {
	 //System.out.println(e.toString());
	 assertTrue(e.toString().startsWith("Electric by Tesla with vin 508 is available to rent in red color. The monster has a range of 300.0 and only costs"));
	 assertTrue(e.toString().endsWith("unless range exceeded"));
	}

	Boat b = null;
	@Given("^boat$")
	public void boat() {
	}

	@When("^The type is yacht with vin (\\d+) and a range of (\\d+), and the day is a discount day.$")
	public void The_type_is_yacht_with_vin_and_a_range_of_and_the_day_is_a_discount_day(int arg1, int arg2) {
	   b = new Boat(BoatType.yacht,6800.0,90210,4014.8,"black",80.0);
	}

	@Then("^Yacht with VIN (\\d+) is available to rent. This beauty has a range of (\\d+),(\\d+) and only costs \\$(\\d+),(\\d+).(\\d+)$")
	public void Yacht_with_VIN_is_available_to_rent_This_beauty_has_a_range_of_and_only_costs_$_(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
	    //System.out.println(b.toString());
	    assertTrue(b.toString().startsWith("yacht boatType with VIN 90210 is available to rent. This beauty has a range of 6800.0 and only costs"));
	}

	Standard s=null;
	@Given("^standard$")
	public void standard() {
	  
	}

	@When("^The manufacturer is toyota with a vin (\\d+), a color of blue, and a range of (\\d+). The day is not a discount day.$")
	public void The_manufacturer_is_toyota_with_a_vin_a_color_of_blue_and_a_range_of_The_day_is_not_a_discount_day(int arg1, int arg2) {
	    s= new Standard(9800,75082,900,"blue","toyota",900,4,new Date());
	}

	@Then("^Standard by toyota with VIN (\\d+) is available to rent in blue. The beast has a range of (\\d+),(\\d+) and only costs \\$(\\d+),(\\d+).(\\d+)$")
	public void Standard_by_toyota_with_VIN_is_available_to_rent_in_blue_The_beast_has_a_range_of_and_only_costs_$_(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
	    System.out.println(s.toString());
	    assertTrue(s.toString().startsWith("Standard by toyota with vin 75082 is available to rent in blue color. This beast has a range of 9800.0 and only costs "));
	}

	SemiTruck st=null;
	@Given("^Semi truck$")
	public void Semi_truck() {
	   
	}

	@When("^The manufacturer is volvo with a vin (\\d+) and a range of (\\d+). Today is a discount day.$")
	public void The_manufacturer_is_volvo_with_a_vin_and_a_range_of_Today_is_a_discount_day(int arg1, int arg2) throws VehicleOutOfRangeException {
	    st = new SemiTruck(498,7331,900,"black","volvo",200,6,3);
	}

	@Then("^SemiTruck by volvo with VIN (\\d+) is available to rent in black.This monster has a range of (\\d+) and only costs \\$(\\d+),(\\d+).(\\d+) unless range exceeded.$")
	public void SemiTruck_by_volvo_with_VIN_is_available_to_rent_in_black_This_monster_has_a_range_of_and_only_costs_$_unless_range_exceeded(int arg1, int arg2, int arg3, int arg4, int arg5) {
	    System.out.println(st.toString());
	    assertTrue(st.toString().startsWith("SemiTruck by volvo with vin 7331 is available to rent in black color. The monster has a range of 498.0 and only costs "));
	    assertTrue(st.toString().endsWith("unless range exceeded"));
	}

	Diesel d=null;
	@Given("^diesel$")
	public void diesel() {
	}

	@When("^The manufaacturer is Hummer with a vin (\\d+), in sunburst orange, and a range of (\\d+). Today is a discount day.$")
	public void The_manufaacturer_is_Hummer_with_a_vin_in_sunburst_orange_and_a_range_of_Today_is_a_discount_day(int arg1, int arg2) {
	   d= new Diesel(100,764528,1000,"sunburst orange","hummer",900,4,4);
	}

	@Then("^Diesel by Hummer with VIN (\\d+) is available to rent in sunburst orange. This beast has a range of (\\d+) and only costs \\$(\\d+),(\\d+).(\\d+)$")
	public void Diesel_by_Hummer_with_VIN_is_available_to_rent_in_sunburst_orange_This_beast_has_a_range_of_and_only_costs_$_(int arg1, int arg2, int arg3, int arg4, int arg5) {
	    System.out.println(d.toString());
	    assertTrue(d.toString().startsWith("Diesel by hummer with vin 764528 is available to rent in sunburst orange color. This beast has a range of 100.0 and only costs"));
	}

	@When("^The manufacturer is toyota with a vin (\\d+),a color of blue, and a range of (\\d+). The day is a discount day.$")
	public void The_manufacturer_is_toyota_with_a_vin_a_color_of_blue_and_a_range_of_The_day_is_a_discount_day(int arg1, int arg2) {
	     s= new Standard(9800,75082,700,"blue","toyota",900,4,new Date());
	}

	@Then("^Standard by toyota with VIN (\\d+) is available to rent in blue. This beast has a range of (\\d+),(\\d+) and only costs \\$(\\d+),(\\d+).(\\d+)$")
	public void Standard_by_toyota_with_VIN_is_available_to_rent_in_blue_This_beast_has_a_range_of_and_only_costs_$_(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		System.out.println(s.toString());
	    assertTrue(s.toString().startsWith("Standard by toyota with vin 75082 is available to rent in blue color. This beast has a range of 9800.0 and only costs "));
	
	   
	



}

}