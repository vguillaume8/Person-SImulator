package Person;

import java.util.HashMap;
import java.util.Map;

public class Item {
	//private static String[] itemList = {"Bed", "TV", "Couch", "Fridge", "Oven"};
	//private static int[] itemAmount = {4000, 700, 800, 1000, 1200};
	static Map<Integer, String> itemList = new HashMap<Integer, String>();
	static Map<Integer, Integer> itemAmount = new HashMap<Integer, Integer>();
	private String name;
	
	public Item(String aname) {
		name = aname;
		itemList.put(0, "Bed");
		itemList.put(1, "TV");
		itemList.put(2, "Couch");
		itemList.put(3, "Fridge");
		itemList.put(4, "Oven");
		itemAmount.put(0, 4000);
		itemAmount.put(1, 700);
		itemAmount.put(2, 800);
		itemAmount.put(3, 1000);
		itemAmount.put(4, 1200);
	
		
	}
	
	public static String printItemName(int order) {
		printAmount(order);
		return itemList.get(order);
	}
	
	public static int printAmount(int order) {
		return itemAmount.get(order);
	}
	
	public static Map<Integer, String> getListOfItems() {
		return itemList;
	}
	
	public static int getItemInd(String itemName) {
		for(int i = 0; i < itemList.size(); i++) {
			if(itemList.get(i) == itemName) {
				return i;
			}
		}
		return 0;
		
		
	}
	
	public static int getItemAmount(int amountInd) {
		return itemAmount.get(amountInd);
	}
	

}
