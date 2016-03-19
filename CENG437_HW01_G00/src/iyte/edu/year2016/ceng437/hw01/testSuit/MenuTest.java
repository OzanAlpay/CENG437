package iyte.edu.year2016.ceng437.hw01.testSuit;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.concurrent.SynchronousQueue;

import org.junit.Test;

import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Menu;
public class MenuTest {
	
	Menu menu = new Menu();
		
	/*@Test
	public void testReadPurchaseAmountNegativeDollarValue() {
		
		System.out.println("Enter An Amount Which Equal to -1");
		assertEquals(0,menu.readPurchaseAmount());
		
		
	}*/
	
	@Test
	public void testReadPurchaseAmountZeroDollarValue() {
		
		System.out.println("Test Name : testReadPurchaseAmountZeroDollarValue");
		System.out.println("Enter An Amount Which is Equal to 0");
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
	
	/*@Test
	public void testReadNumItemsNegativeNumItemsValue() {
		
		System.out.println("Enter An Amount Which Equal to -1");
		assertEquals(0,menu.readNumberOfItems());
		
	}*/
	
	@Test
	public void testReadNumItemsZeroItemValue() {
		
		System.out.println("Test Name : testReadNumItemsZeroItemValue");
		System.out.println("Enter An Amount Which Equal to 0");
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
	
	/*@Test
	public void testReadDeliveryDayInvalidValue() {
		
		System.out.println("Enter something else than integer");
		DeliveryDay deliveryDay = null;
		try {
		    deliveryDay = menu.readDeliveryDay();
		} catch(InputMismatchException e) {
			
		}
		assertEquals(DeliveryDay.IN_A_WEEK,deliveryDay);
	}*/

}
