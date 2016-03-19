package iyte.edu.year2016.ceng437.hw01.testSuit;

import static org.junit.Assert.*;

import org.junit.Test;

import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Shipment;

public class ShipmentTest {
	
	/*
	 *         Our Sampling Method for ShipmentTest
	 *         
	 *         For Purchase Amount Input Set We Took 5 Different Samples
	 *         
	 *         From (-∞ to 0) --> our sample is = -1
	 *         We also used 0 since it is a boundary value we need to use it
	 *         From (0 to 100] --> our sample is = 1
	 *         We also used 100 since it is a boundary value
	 *         From (100 to ∞) --> we used 101 
	 *         
	 *         For Number of Items Input Set We took 5 Different Samples
	 *         
	 *         From(-∞ to 0) --> our sample is -1 
	 *         We also took 0 since it is a boundary value 
	 *         From(0 to 3] --> our sample is 1
	 *         We also used 3 since it is a boundary value
	 *         From(3 to ∞) --> our sample is 4
	 *         
	 *         For DeliveryDay Input Set We took 4 Different Samples
	 *         
	 *         Because of It is an Enum type we have to test this three values as
	 *       
	 *         DeliveryDay.NEXT_DAY
	 *         DeliveryDay.IN_TWO_DAYS
	 *         DeliveryDay.IN_A_WEEK
	 *         
	 *         In addition to those we also test with an Invalid Date value 
	 *         as null
	 * 
	 * 
	 * 
	 */


	
	@Test
	public void testNegativePurchaseAmountNegativeNumOfItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,-1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountNegativeNumOfItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS, shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountNegativeNumOfItemsAWeek() {
		
		Shipment shipment = new Shipment(-1,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountNegativeNumOfItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,-1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(-1,0,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(-1,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(-1,0,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountZeroItemInvalidDate() {
		
		Shipment shipment = new Shipment(-1,0,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountFewItemsAweek() {
		
		Shipment shipment = new Shipment(-1,1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,3,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(-1,3,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,3,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	@Test
	public void testNegativePurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(-1,4,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testNegativePurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(-1,4,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountNegativeNumOfItemsNextDay() {
		
		Shipment shipment = new Shipment(0,-1,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountNegativeNumOfItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountNegativeNumOfItemsAWeek() {
		
		Shipment shipment = new Shipment(0,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	@Test
	public void testZeroPurchaseAmountNegativeNumOfItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,-1,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(0,0,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(0,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(0,0,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountZeroItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,0,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(0,1,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,1,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(0,3,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(0,3,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,3,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.NEXT_DAY);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(0,4,DeliveryDay.IN_A_WEEK);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testZeroPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(0,4,null);
		assertEquals(0,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountNegativeNumOfItemsNextDay() {
		
		Shipment shipment = new Shipment(1,-1,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountNegativeNumOfItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountNegativeNumOfItemsAWeek() {
		
		Shipment shipment = new Shipment(1,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
	}
	
	@Test
	public void testOneDollarPurchaseAmountNegativeNumOfItemInvalidDate() {
		
		Shipment shipment = new Shipment(1,-1,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
	}
	
	@Test
	public void testOneDollarPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(1,0,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(1,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(1,0,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountZeroItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,0,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(1,1,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(1,1,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,1,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(1,3,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(1,3,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,3,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(1,4,DeliveryDay.NEXT_DAY);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(1,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(1,4,DeliveryDay.IN_A_WEEK);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testOneDollarPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(1,4,null);
		assertEquals(1,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}

	@Test
	public void testHundredDollarsPurchaseAmountNegativeNumItemsNextDay() {
		
		Shipment shipment = new Shipment(100,-1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountNegativeNumItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountNegativeNumItemsAWeek() {
		
		Shipment shipment = new Shipment(100,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountNegativeNumItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,-1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(100,0,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(100,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(100,0,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountZeroItemInvalidDate() {
		
		Shipment shipment = new Shipment(100,0,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(100,1,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(100,1,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,1,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(100,3,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(100,3,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,3,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(100,4,DeliveryDay.NEXT_DAY);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(100,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(100,4,DeliveryDay.IN_A_WEEK);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testHundredDollarsPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(100,4,null);
		assertEquals(100,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountNegativeNumItemsNextDay() {
		
		Shipment shipment = new Shipment(101,-1,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountNegativeNumItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,-1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountNegativeNumItemsAWeek() {
		
		Shipment shipment = new Shipment(101,-1,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountNegativeNumItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,-1,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountZeroItemNextDay() {
		
		Shipment shipment = new Shipment(101,0,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountZeroItemTwoDays() {
		
		Shipment shipment = new Shipment(101,0,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountZeroItemAWeek() {
		
		Shipment shipment = new Shipment(101,0,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountZeroItemInvalidDate() {
		
		Shipment shipment = new Shipment(101,0,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(0,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountFewItemsNextDay() {
		
		Shipment shipment = new Shipment(101,1,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountFewItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,1,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountFewItemsAWeek() {
		
		Shipment shipment = new Shipment(101,1,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountFewItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,1,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(1,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountThreeItemsNextDay() {
		
		Shipment shipment = new Shipment(101,3,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountThreeItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,3,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountThreeItemsAWeek() {
		
		Shipment shipment = new Shipment(101,3,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountThreeItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,3,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(3,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountManyItemsNextDay() {
		
		Shipment shipment = new Shipment(101,4,DeliveryDay.NEXT_DAY);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.NEXT_DAY,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountManyItemsTwoDays() {
		
		Shipment shipment = new Shipment(101,4,DeliveryDay.IN_TWO_DAYS);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_TWO_DAYS,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountManyItemsAWeek() {
		
		Shipment shipment = new Shipment(101,4,DeliveryDay.IN_A_WEEK);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
	@Test
	public void testMoreThanHundredDollarsPurchaseAmountManyItemsInvalidDate() {
		
		Shipment shipment = new Shipment(101,4,null);
		assertEquals(101,shipment.getPurchaseAmount());
		assertEquals(4,shipment.getNumberOfItems());
		assertEquals(DeliveryDay.IN_A_WEEK,shipment.getDeliveryDay());
		
	}
	
}
