/*
 * @author Carlan Henry
 */
		
public class itemInventoryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Test Case:
 		 *	Test Case 1:
 		 *	Add sword
 		 *	print inventory
 		 * 	Test Case2:
 		 *  No inventory space
		 */
		
		Inventory invent = new Inventory();
		invent.addItem("sword");
		invent.addItem("chestplate");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.addItem("sword");
		invent.printInventory();
		
		
		/*
		 *  Test Case:
 		 *	Test Case 1:
 		 *	Item is weapon
 		 *	Inflict damage
 		 * 	Test Case2:
 		 *  Item is armor
 		 *  Block damage
		 */
		
		Item sword = new Item("sword", false, true, false, false, "A Large and Heavy Sword");
		sword.setDamage(25);
		System.out.println(sword.toString());
		System.out.println(sword.useItem());
		
		Item chestplate = new Item("chestplate", false, false, true, false, "A sturdy piece of chest armor");
		chestplate.setDamage(30);
		System.out.println(chestplate.toString());
		System.out.println(chestplate.useItem());

	}

}
