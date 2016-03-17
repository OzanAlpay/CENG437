package iyte.edu.year2016.ceng437.hw01.testSuit;

import static org.junit.Assert.*;

import org.junit.Test;

import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Shipment;
import iyte.edu.year2016.ceng437.hw01.DecisionTable;

public class DecisionTableTest {

	DecisionTable decisionTable = new DecisionTable();
	@Test
	public void testoutOfBoundsNegativePurchaseAmount() {
		
		Shipment shipment = new Shipment((-2147483645-5),1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK, shipment.getDeliveryDay());
		assertEquals(25,0,decisionTable.calculateShipmentCost(shipment));
		
	}

	@Test
	public void testNegativePurchaseAmountLowItemsNextDay() {
		Shipment shipment = new Shipment(-1,1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25,0,decisionTable.calculateShipmentCost(shipment));
		
	}
	
	@Test
	public void testNegativePurchaseAmountLowItemsTwoDays() {
		Shipment shipment = new Shipment(-1,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10,0,decisionTable.calculateShipmentCost(shipment));
	}
	
	@Test
	public void testNegativePurchaseAmountLowItemsNextWeek() {
		Shipment shipment = new Shipment(-1,1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test 
	public void testNegativePurchaseAmountMuchItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountMuchItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS, shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountMuchItemsNextWeek() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK, shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountLowItemsInvalidDate() {
		Shipment shipment = new Shipment(-1,1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK, shipment.getDeliveryDay());
		
	}
	
	
	@Test
	public void testZeroPurchaseAmountLowItemsNextDay() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountLowItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountLowItemsNextWeek() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK, shipment.getDeliveryDay());
	}
	
	@Test
	public void testZeroPurchaseAmountMuchItemsNextDay() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
	}
	
	@Test 
	public void testZeroPurchaseAmountMuchItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS, shipment.getDeliveryDay());
	}
	
	@Test
	public void testZeroPurchaseAmountMuchItemsNextWeek() {
		Shipment shipment = new Shipment(0,4,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
	}
	
	@Test
	public void testZeroPurchaseAmountMuchItemsInvalidDate() {
		Shipment shipment = new Shipment(0,4,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
	}
	
	@Test
	public void testpositivePurchaseAmountLowItemsNextDay() {
		
		Shipment shipment = new Shipment(50,1,DeliveryDay.NEXT_DAY);
		assertEquals(50,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testoutofBoundsPositivePurchaseAmountLowItemsNextDay() {
		
		Shipment shipment = new Shipment(2147483645+3,1,DeliveryDay.NEXT_DAY);
		assertEquals(2147483647+3,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
	}
	// ??
	
	@Test
	public void testinvalidPositivePurchaseAmountLowItemsNextDay() {
		
		Shipment shipment = new Shipment((Integer) null,1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
		
	}

}
