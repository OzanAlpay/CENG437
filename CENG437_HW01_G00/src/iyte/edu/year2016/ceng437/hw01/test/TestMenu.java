package iyte.edu.year2016.ceng437.hw01.test;

import iyte.edu.year2016.ceng437.hw01.DeliveryDay;
import iyte.edu.year2016.ceng437.hw01.Menu;

/**
 * Simple Test class for Menu
 */
public class TestMenu {

	public static void main(String[] args) {

		Menu menu = new Menu();
		
		int readPurchaseAmount = menu.readPurchaseAmount();
		System.out.println("readPurchaseAmount: " + readPurchaseAmount);
		int readNumberOfItems = menu.readNumberOfItems();
		System.out.println("readNumberOfItems: " + readNumberOfItems);
		DeliveryDay readDeliveryDay = menu.readDeliveryDay();
		System.out.println("readDeliveryDay: " + readDeliveryDay);
		
		menu.closeMenu();
	}
}
