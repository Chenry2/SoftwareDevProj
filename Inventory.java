/*
 * @author Carlan Henry
 */


public class Inventory {
	
	public static Item inv[] = new Item[10];
	
	public static void addItem(Item item){
		for (int i = 0; i < inv.length; i++) {
			if(inv[i] == null) {
				inv[i] = item;
				System.out.println("You have added " + item.toString() + " to the inventory.");
				return;
			}
		}
		System.out.println("You have no space in your inventory, please remove an item.");
		
	}
	
	
	
	public static void removeItem(Item item) {
		
		Item[] newItems = new Item[inv.length-1];
		
		for (int i = 0; i < inv.length; i++){
			if((inv[i].getName() == item.getName())){
				inv[i] = newItems[i];
				System.out.println("You have removed " + item.toString() + " from the inventory");
				return;
			}
		}
		System.out.println("No such item in inventory.");
	} 
	
	
	
	public static void printInv() {
		for (Item it : inv) {
			if(it != null) {
			System.out.print(it.toString() + " | ");	
		}
	}
	
}
}


