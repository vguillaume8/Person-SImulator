package Person;

public class Item {
	private static String[] itemList = {"Bed", "TV", "Couch", "Fridge", "Oven"};
	private static int[] itemAmount = {4000, 700, 800, 1000, 1200, 1250};
	private String name;
	
	public Item(String aname) {
		name = aname;
	
		
	}
	
	public static String printItemName(int order) {
		printAmount(order);
		return itemList[order];
	}
	
	public static int printAmount(int order) {
		return itemAmount[order];
	}
	
	public static String[] getListOfItems() {
		return itemList;
	}
	
	public static int getItemInd(String itemName) {
		for(int i = 0; i < itemList.length; i++) {
			if(itemList[i] == itemName) {
				return i;
			}
		}
		return 0;
		
		
	}
	
	public static int[] getItemAmount() {
		return itemAmount;
	}
	

}
