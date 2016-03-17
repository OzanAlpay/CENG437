package iyte.edu.year2016.ceng437.hw01.test;

import iyte.edu.year2016.ceng437.hw01.DecisionTable;
import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Shipment;

/**
 * Simple Test class for DecisionTable
 */
public class TestDecisionTable {

	public static void main(String[] args) {
		DecisionTable decisionTable = new DecisionTable();
		
		Shipment shipmentFree = new Shipment(100, 4, DeliveryDay.IN_A_WEEK);
		double cost = decisionTable.calculateShipmentCost(shipmentFree);
		System.out.println("shipmentFree cost: expected=0, calculated=" + cost);
		
		Shipment shipment25 = new Shipment(100, 3, DeliveryDay.NEXT_DAY);
		cost = decisionTable.calculateShipmentCost(shipment25);
		System.out.println("shipment25 cost: expected=25, calculated=" + cost);
		
		Shipment shipmentN2_5 = new Shipment(250, 4, DeliveryDay.IN_A_WEEK);
		cost = decisionTable.calculateShipmentCost(shipmentN2_5);
		System.out.println("shipmentN2_5 cost: expected=10, calculated=" + cost);
	}

}
