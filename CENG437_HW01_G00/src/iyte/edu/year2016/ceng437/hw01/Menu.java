package iyte.edu.year2016.ceng437.hw01;

import java.util.Scanner;

public class Menu {

	private Scanner scanner = null;
	
	public Menu() {
		 scanner = new Scanner(System.in);
	}
	
	public int readPurchaseAmount() {
		int purchaseAmount = -1;
		do { 
			System.out.print("Enter Purchase Amount(must be positive): ");
			purchaseAmount = scanner.nextInt();
		} while(purchaseAmount < 0);
		return purchaseAmount;
	}
	
	public int readNumberOfItems() {
		int numberOfItems = -1;
		do { 
			System.out.print("Enter Number Of Items(must be positive): ");
			numberOfItems = scanner.nextInt();
		} while(numberOfItems < 0);
		return numberOfItems;
	}
	
	public DeliveryDay readDeliveryDay() {
		DeliveryDay deliveryDay;
		int selection = -1;
		do {
			System.out.println("Enter Delivery Day Options [1-3]:");
			System.out.println("1) Next Day");
			System.out.println("2) In 2 Days");
			System.out.println("3) In a Week");
			selection = scanner.nextInt();
		} while(selection < 1 || selection > 3);
		
		switch(selection) {
		case 1:
			deliveryDay = DeliveryDay.NEXT_DAY;
			break;
		case 2: 
			deliveryDay = DeliveryDay.IN_TWO_DAYS;
			break;
		case 3:
			deliveryDay = DeliveryDay.IN_A_WEEK;
			break;
		default:
			deliveryDay = DeliveryDay.IN_A_WEEK;
			break;
		}
		
		return deliveryDay;
	}
	
	public void closeMenu() { 
		scanner.close();
		scanner = null;
	}
}
