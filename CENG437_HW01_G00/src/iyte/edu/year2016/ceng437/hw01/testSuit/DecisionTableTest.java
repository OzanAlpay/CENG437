package iyte.edu.year2016.ceng437.hw01.testSuit;

import static org.junit.Assert.*;



	/*
	 * 
	 *   I used the same samples which i tested in ShipmentTest file
	 *   Since all of them passed the tests in the ShipmentTest now I am sure
	 *   about that i am testing the right Shipments [like it is impossible to find 
	 *   an error during shipment creation in my sample area].
	 *    
	 *   Since it is a financial program i assigned DELTA value to zero
	 * 
	 * 
	 */

import org.junit.Test;

import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Shipment;
import iyte.edu.year2016.ceng437.hw01.DecisionTable;

public class DecisionTableTest {

	DecisionTable decisionTable = new DecisionTable();
	private static final double DELTA = 0;
	
	@Test
	public void testCalculateNegativePurchaseAmountNegativeNumOfItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,-1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountNegativeNumOfItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS, shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountNegativeNumOfItemsAWeek() {
		
		Shipment shipment = new Shipment(-1,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountNegativeNumOfItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,-1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(-1,0,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(-1,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(-1,0,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountZeroItemInvalidDate() {
		
		Shipment shipment = new Shipment(-1,0,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(-1,1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,3,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(-1,3,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,3,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(24.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	@Test
	public void testCalculateNegativePurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateNegativePurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,4,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountNegativeNumOfItemsNextDay() {
		
		Shipment shipment = new Shipment(0,-1,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountNegativeNumOfItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountNegativeNumOfItemsAWeek() {
		
		Shipment shipment = new Shipment(0,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	@Test
	public void testCalculateZeroPurchaseAmountNegativeNumOfItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,-1,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(0,0,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(0,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(0,0,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountZeroItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,0,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,1,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(0,3,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(0,3,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,3,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(24.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateZeroPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,4,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountNegativeNumOfItemsNextDay() {
		
		Shipment shipment = new Shipment(1,-1,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountNegativeNumOfItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountNegativeNumOfItemsAWeek() {
		
		Shipment shipment = new Shipment(1,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountNegativeNumOfItemInvalidDate() {
		
		Shipment shipment = new Shipment(1,-1,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(1,0,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(1,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(1,0,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountZeroItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,0,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(1,1,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(1,1,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.50,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,1,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.50,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(1,3,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(1,3,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,3,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(1,4,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(24.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(1,4,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateOneDollarPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,4,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}

	@Test
	public void testCalculateHundredDollarsPurchaseAmountNegativeNumItemsNextDay() {
		
		Shipment shipment = new Shipment(100,-1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountNegativeNumItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountNegativeNumItemsAWeek() {
		
		Shipment shipment = new Shipment(100,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountNegativeNumItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,-1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(100,0,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(100,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(100,0,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountZeroItemInvalidDate() {
		
		Shipment shipment = new Shipment(100,0,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(100,1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(100,1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(1.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(100,3,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(25.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(100,3,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,3,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(4.5,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(100,4,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(24.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(100,4,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateHundredDollarsPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,4,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(0.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountNegativeNumItemsNextDay() {
		
		Shipment shipment = new Shipment(101,-1,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(35.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountNegativeNumItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(15.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountNegativeNumItemsAWeek() {
		
		Shipment shipment = new Shipment(101,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountNegativeNumItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,-1,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(101,0,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(35.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(101,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(15.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(101,0,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountZeroItemInvalidDate() {
		
		Shipment shipment = new Shipment(101,0,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(101,1,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(35.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(15.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(101,1,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,1,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(101,3,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(35.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(15.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(101,3,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,3,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(101,4,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		assertEquals(30.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		assertEquals(14.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(101,4,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}
	
	@Test
	public void testCalculateMoreThanHundredDollarsPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,4,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		assertEquals(10.0,decisionTable.calculateShipmentCost(shipment),DELTA);
		
	}


}
