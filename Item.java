/*
 * @author Carlan Henry
 */
public class Item {

	private String name;
	private String itemDescription;
	private boolean consumable;
	private static boolean weapon;
	private static boolean armor;
	private static boolean keyItem;
	private static int itemAtk;
	private static int itemDef;
	private static int itemSpeed;
	private static int itemHP;
	
	

	public Item(String iName, boolean isConsumable, boolean isWeapon, boolean isArmor, boolean isKey, String description, int atk, int def, int speed, int hp) {
		
		name = iName;
		itemDescription = description;
		consumable = isConsumable;
		weapon = isWeapon;
		armor = isArmor;
		keyItem = isKey;
		itemAtk = atk;
		itemDef = def;
		itemSpeed = speed;
		itemHP = hp;
				
		
		
	}
	
	
	public static int getItemAtk() {
		return itemAtk;
	}


	public void setItemAtk(int itemAtk) {
		Item.itemAtk = itemAtk;
	}


	public static int getItemDef() {
		return itemDef;
	}


	public void setItemDef(int itemDef) {
		Item.itemDef = itemDef;
	}


	public int getItemSpeed() {
		return itemSpeed;
	}


	public void setItemSpeed(int itemSpeed) {
		Item.itemSpeed = itemSpeed;
	}


	public int getItemHP() {
		return itemHP;
	}


	public void setItemHP(int itemHP) {
		Item.itemHP = itemHP;
	}


	public String useItem(){
		
		if(Item.weapon == true){
			
			 return "You have inflicted " + Item.getItemAtk()+ " extra damage to your enemy!";
			
		} else if(Item.armor == true) {
			
				return "You have blocked " + Item.getItemDef() + " extra damage!";
				
			} else {
				
				return "You have healed for" + itemHP + "!";
			}
			
			
		}
	
	
	public String toString() {
		
		return  name + "[Consumable:" + consumable + "," + " Weapon:" + weapon + "," + " Armor:" + armor + "," + " Key:" + keyItem + ","
				+ " Description: " + itemDescription +"]";
		
	}
	
	Item thePrecious  = new Item("The Precious", true, false, false, true, "One Ring", 0, 0, 0, 0);
	
	Item riddlerCane  = new Item("Riddler's Cane", false, true, false, false, "?", 0, 0, 0, 0);
	
	Item stapler  = new Item("Stapler", false, true, false, false, "Watch your thumb!", 0, 0, 0, 0);
	
	Item lightSaber  = new Item("Light Saber", false, true, false, false, "Ooo Shiny!", 0, 0, 0, 0);
	
	Item axe  = new Item("Axe", false, true, false, false, "Chop! Chop!", 0, 0, 0, 0);
	
	Item tommyGun  = new Item("Tommy Gun", false, true, false, false, "My Little Friend", 0, 0, 0, 0);
	
	Item shanYuSword  = new Item("ShanYu's Sword", false, true, false, false, "A Sinister Blade", 0, 0, 0, 0);
	
	Item kungFu  = new Item("Kung Fu", false, true, false, false, "This will instantly kill Agent Smith", 0, 0, 0, 0);
	
	Item rubySlippers  = new Item("Ruby Slippers", false, false, true, false, "Going to see The Wizard", 0, 0, 0, 0);
	
	Item jonesHat  = new Item("Indiana Jones' Hat", false, false, true, false, "It belongs in a museum!", 0, 0, 0, 0);
	
	Item spaceSuit  = new Item("Space Suit", false, false, true, false, "Houston...", 0, 0, 0, 0);
	
	Item baneMask  = new Item("Bane's Mask", false, false, true, false, "No one cared who I was until I put on the mask.", 0, 0, 0, 0);
	
	Item mustache  = new Item("Mustache", false, false, true, false, "Increases your Spaniardism.", 0, 0, 0, 0);
	
	Item scotch  = new Item("Bottle of Scotch", true, false, false, false, "Why is the rum gone!?", 0, 0, 0, 0);
	
	Item beetles  = new Item("Beetles", true, false, false, false, "Might make good juice", 0, 0, 0, 0);
	
	Item phone  = new Item("Phone", true, false, false, false, "Ring Ring", 0, 0, 0, 0);
	
	Item gobstopper  = new Item("Everlasting GobStopper", true, false, false, false, "For children with very little pocket money.", 0, 0, 0, 0);
	
	Item chocolates  = new Item("Box of Chocolates", true, false, false, false, "Momma always said...", 0, 0, 0, 0);
	
	Item grenade  = new Item("Holy Hand Grenade", true, false, false, false, "Consult the Book of Armaments!", 999, 0, 0, 0);
	
	Item gourd  = new Item("Gourd", true, false, false, false, " Gaara may have lost this.", 0, 0, 0, 50);
	
	Item waffles  = new Item("Waffles", true, false, false, false, "Should invent a house where these are made.", 0, 0, 0, 0);
	
	Item fish  = new Item("Fish", true, false, false, false, "Ick.", 0, 0, 0, 0);
	
	Item humanMeat  = new Item("Human Meat", true, false, false, false, "Liver with a fine Chianti.", 0, 0, 0, 0);
	
	Item ticket  = new Item("Traffic Ticket", true, false, false, false, "In a rush?", 0, 0, 0, 0);
	
	Item laser  = new Item("Fake Laser", false, false, false, false, "Pew Pew", 0, 0, 0, 0);
	
	Item badge  = new Item("Boy Scout Badge", false, false, false, false, "Scout's Honor!", 0, 0, 0, 0);
	
	Item spoon  = new Item("Bent Spoon", false, false, false, false, "Strong mind!", 0, 0, 0, 0);
	
}
