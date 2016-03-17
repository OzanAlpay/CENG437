package iyte.edu.year2016.ceng437.hw01.test;

import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Shipment;

/**
 * Simple test class for Shipment
 */
public class TestShipment {

	public static void main(String[] args) {
		
		Shipment shipment1 = new Shipment(-250, 1, null);
		System.out.println("Shipment 1: " + shipment1);
		
		Shipment shipment2 = new Shipment(25, -4, DeliveryDay.IN_TWO_DAYS);
		System.out.println("Shipment 2: " + shipment2);
		
		Shipment shipment3 = new Shipment(55, 4, DeliveryDay.IN_A_WEEK);
		System.out.println("Shipment 3: " + shipment3);
		
	}
	
}
