/*
 * @author Carlan Henry
 */
		
public class itemInventoryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Item stapler  = new Item("Stapler", false, true, false, false, "Watch your thumb!", 0, 0, 0, 0);
		Item ruler  = new Item("Ruler", false, true, false, false, "Metric!", 0, 0, 0, 0);
		Item sword  = new Item("MegaSword", false, true, false, false, "Metric!", 0, 0, 0, 0);
		
		Inventory.addItem(stapler);
		Inventory.addItem(ruler);
		Inventory.addItem(sword);
		Inventory.addItem(sword);
		Inventory.addItem(sword);
		Inventory.addItem(sword);
		Inventory.addItem(sword);
		Inventory.addItem(Item.gobstopper);
		
		
		//Inventory.removeItem(ruler);
		
		
		Inventory.printInv();
		

	}

}
