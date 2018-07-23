package Person;



public class House {
	private int size;
	private Item[] listOfItems = new Item[size * 2];
	int itemCounter = 0;

	
	
	public House(int size) {
		Bills.addBill("Mortage", size * 1000);
		Bills.addBill("Utilities", size * 200);
		Bills.addBill("Property Tax", size * 350);
		
		
	}
	
	public void addItem(Item item) {
		listOfItems[itemCounter] = item;
		itemCounter++;
		
	}
	
	public int getHouseSpace() {
		return listOfItems.length;
	}

}
