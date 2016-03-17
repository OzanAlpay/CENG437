package iyte.edu.year2016.ceng437.hw01;

public class Shipment {

	private int purchaseAmount;
	private int numberOfItems;
	private DeliveryDay deliveryDay;

	public Shipment(int purchaseAmount, 
					int numberOfItems, 
					DeliveryDay deliveryDay) {
		
		setPurchaseAmount(purchaseAmount);
		setNumberOfItems(numberOfItems);
		setDeliveryDay(deliveryDay);
	}

	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(int purchaseAmount) {
		if(purchaseAmount < 0) {
			purchaseAmount = 100;
		}
		this.purchaseAmount = purchaseAmount;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		if(numberOfItems < 0) {
			numberOfItems = 3; 
		}
		this.numberOfItems = numberOfItems;
	}

	public DeliveryDay getDeliveryDay() {
		return deliveryDay;
	}

	public void setDeliveryDay(DeliveryDay deliveryDay) {
		if(deliveryDay == null) {
			deliveryDay = DeliveryDay.IN_A_WEEK;
		}
		this.deliveryDay = deliveryDay;
	}

	@Override
	public String toString() {
		return "Shipment [purchaseAmount=" + purchaseAmount
				+ ", numberOfItems=" + numberOfItems 
				+ ", deliveryDay=" + deliveryDay + "]";
	}
	
}
