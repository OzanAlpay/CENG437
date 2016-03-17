package iyte.edu.year2016.ceng437.hw01;

public class DecisionTable {

	public DecisionTable() { 
		
	}
	
	/**
	 * Implements decision table given in the "files/assignment1.ppt"
	 */
	public double calculateShipmentCost(Shipment shipment) { 
		DeliveryDay deliveryDay = shipment.getDeliveryDay();
		int numberOfItems = shipment.getNumberOfItems();
		int purchaseAmount = shipment.getPurchaseAmount();
		
		double cost = 0;
		if(purchaseAmount <= 100) {
			if(numberOfItems <= 3) { 
				switch(deliveryDay) {
					case NEXT_DAY:
						cost = 25;
						break;
					case IN_TWO_DAYS:
						cost = 10;
						break;
					case IN_A_WEEK:
						cost = numberOfItems * 1.50;
						break;
				}
			} else {
				switch(deliveryDay) {
					case NEXT_DAY:
						cost = numberOfItems * 6.00;
						break;
					case IN_TWO_DAYS:
						cost = numberOfItems * 2.50;
						break;
					case IN_A_WEEK:
						cost = 0;
						break;
				}
			}
		} else { /* purchaseAmount > 100 */
			if(numberOfItems <= 3) { 
				switch(deliveryDay) {
					case NEXT_DAY:
						cost = 35;
						break;
					case IN_TWO_DAYS:
						cost = 15;
						break;
					case IN_A_WEEK:
						cost = 10;
						break;
				}
			} else {
				switch(deliveryDay) {
					case NEXT_DAY:
						cost = numberOfItems * 7.50;
						break;
					case IN_TWO_DAYS:
						cost = numberOfItems * 3.50;
						break;
					case IN_A_WEEK:
						cost = numberOfItems * 2.50;
						break;
				}
			}
		}
		return cost;
	}
}


