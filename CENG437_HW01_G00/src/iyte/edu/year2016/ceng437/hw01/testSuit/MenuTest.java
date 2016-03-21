package iyte.edu.year2016.ceng437.hw01.testSuit;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.InputMismatchException;


import org.junit.Test;

import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Menu;
public class MenuTest {
	
	Menu menu = new Menu();
	
	/*
	 *   
	 *  I tested the Menu as 
	 *  Read Zero Dollar , Positive Dollars
	 *  Read Zero Number Of Items , Positive Number Of Items
	 *  Read 1,2,3 and Invalid Input as DeliveryDay
	 *  
	 *  I also tested Invalid Input because in the setter of DeliveryDay there is
	 *  a condition for null value and because of it , in my opinion it is not a negative test
	 *  
	 *  I commented some of extra testCases which in my first iteration i thought that i need them
	 *  to be sure about my samples created correctly, however after talking with you i understood that
	 *  only testing positive values is enough.
	 *  
	 *  I cannot tested negative values since there is a while loop and i couldn't bypass it
	 *  
	 * 
	 * 
	 * 
	 */
	@Test
	public void testReadPurchaseAmountZeroDollarValue() {
		
		System.out.println("Test Name : testReadPurchaseAmountZeroDollarValue");
		System.out.println("Enter An Amount Which is Equal to 0");
		assertEquals(0,menu.readPurchaseAmount());
		
	}
	@Test
	public void testReadPurchaseAmountPositiveDollarValue() {
		
		System.out.println("Test Name : testReadPurchaseAmountPositiveValue");
		System.out.println("Enter an Amount Which is > 0");
		assertTrue(menu.readPurchaseAmount()>0);
	}
	
	@Test
	public void testReadNumItemsZeroItemValue() {
		
		System.out.println("Test Name : testReadNumItemsZeroItemValue");
		System.out.println("Enter An Amount Which Equal to 0");
		assertEquals(0,menu.readNumberOfItems());
		
	}
	
	@Test
	public void testReadNumItemsPositiveItemValue() {
		
		System.out.println("Test Name : testReadNumItemsPositiveItemValue");
		System.out.println("Enter An Amount Which is > 0");
		assertTrue(menu.readNumberOfItems()>0);
		
	}
	
	@Test
	public void testReadDeliveryDayNextDayValue() {
		
		System.out.println("Test Name : testReadDeliveryDayNextDayValue");
		System.out.println("Enter A Value as : 1");
		assertEquals(DeliveryDay.NEXT_DAY,menu.readDeliveryDay());
		
	}
	
	@Test
	public void testReadDeliveryDayTwoDaysValue() {
		
		System.out.println("Test Name : testReadDeliveryDayTwoDaysValue");
		System.out.println("Enter A Value as : 2");
		assertEquals(DeliveryDay.IN_TWO_DAYS,menu.readDeliveryDay());
		
	}
	
	@Test
	public void testReadDeliveryDayAWeekValue() {
		
		System.out.println("Test Name : testReadDeliveryDayAWeekValue");
		System.out.println("Enter A Value as : 3");
		assertEquals(DeliveryDay.IN_A_WEEK,menu.readDeliveryDay());
	}
	
	@Test
	public void testReadDeliveryDayInvalidValue() {
		
		System.out.println("Enter something else than integer");
		DeliveryDay deliveryDay = null;
		try {
		    deliveryDay = menu.readDeliveryDay();
		} catch(InputMismatchException e) {
			
		}
		assertEquals(DeliveryDay.IN_A_WEEK,deliveryDay);
	}

		
	/*@Test
	public void testReadPurchaseAmountNegativeDollarValue() {
		
		System.out.println("Enter An Amount Which Equal to -1");
		assertEquals(0,menu.readPurchaseAmount());
		
		
	}
	
	
	
	
	@Test
	public void testReadPurchaseAmountOneDollarValue() {
		
		System.out.println("Test Name : testReadPurchaseAmountOneDollarValue");
		System.out.println("Enter An Amount Which is Equal to 1");
		assertEquals(1,menu.readPurchaseAmount());
		
	}
	
	@Test
	public void testReadPurchaseAmountHundredDollarsValue() {
		
		System.out.println("Test Name : testReadPurchaseAmountHundredDollarsValue");
		System.out.println("Enter An Amount Which Equal to 100");
		assertEquals(100,menu.readPurchaseAmount());
		
	}
	
	@Test
	public void testReadPurchaseAmountMoreThanHundredDollarsValue() {
		
		System.out.println("Test Name : testReadPurchaseAmountMoreThanHundredDollarsValue");
		System.out.println("Enter An Amount Which Equal to 101");
		assertEquals(101,menu.readPurchaseAmount());
		
	}
	
	@Test
	public void testReadNumItemsNegativeNumItemsValue() {
		
		System.out.println("Enter An Amount Which Equal to -1");
		assertEquals(0,menu.readNumberOfItems());
		
	}
	
	
	
	@Test
	public void testReadNumItemsOneItemValue() {
		
		System.out.println("Test Name : testReadNumItemsOneItemValue");
		System.out.println("Enter An Amount Which Equal to 1");
		assertEquals(1,menu.readNumberOfItems());
		
	}
	
	@Test
	public void testReadNumItemsThreeItemsValue() {
		
		System.out.println("Test Name : testReadNumItemsThreeItemsValue");
		System.out.println("Enter An Amount Which Equal to 3");
		assertEquals(3,menu.readNumberOfItems());
		
	}
	
	@Test
	public void testReadNumItemsMoreThanThreeItemsValue() {
		
		System.out.println("Test Name : testReadNumItemsMoreThanThreeItemsValue");
		System.out.println("Enter An Amount Which Equal to 4");
		assertEquals(4,menu.readNumberOfItems());
		
	}
	
	*/

}
