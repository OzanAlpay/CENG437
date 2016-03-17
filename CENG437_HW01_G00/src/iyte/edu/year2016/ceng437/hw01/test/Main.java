package iyte.edu.year2016.ceng437.hw01.test;

import iyte.edu.year2016.ceng437.hw01.DecisionTable;
import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Menu;
import iyte.edu.year2016.ceng437.hw01.Shipment;

public class Main {

	/**
	 * Main scenario class for the assignment 1
	 */
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		int purchaseAmount = menu.readPurchaseAmount();
		int numberOfItems = menu.readNumberOfItems();
		DeliveryDay deliveryDay = menu.readDeliveryDay();
		
		Shipment shipment = new Shipment(purchaseAmount, numberOfItems, deliveryDay);
		DecisionTable decisionTable = new DecisionTable();
		
		double shippingCost = decisionTable.calculateShipmentCost(shipment);
		System.out.println("Shipping cost for given shipment (" + shipment + ") is " + shippingCost);
	}

}
