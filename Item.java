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
	private static int damage;
	private static int heal;
	
	

	public Item(String iName, boolean isConsumable, boolean isWeapon, boolean isArmor, boolean isKey, String description) {
		
		name = iName;
		itemDescription = description;
		consumable = isConsumable;
		weapon = isWeapon;
		armor = isArmor;
		keyItem = isKey;
		
	}
	
	public static int getDamage() {
		
		return damage;
		
	}
	
	public void setDamage(int setDamage){
		
		damage = setDamage;
		
	}
	
	public static int getHeal() {
		return heal;
	}

	public static void setHeal(int heal) {
		Item.heal = heal;
	}
	
	public String useItem(){
		
		if(Item.weapon == true){
			
			 return "You have inflicted " + Item.getDamage()+ " extra damage to your enemy!";
			
		} else if(Item.armor == true) {
			
				return "You have blocked " + Item.getDamage() + " extra damage!";
				
			} else {
				
				return "You have healed for" + heal + "!";
			}
			
			
		}
	
	
	public String toString() {
		
		return  name + "[Consumable:" + consumable + "," + " Weapon:" + weapon + "," + " Armor:" + armor + "," + " Key:" + keyItem + ","
				+ " Description: " + itemDescription +"]";
		
	}
	
	Item thePrecious  = new Item("The Precious", true, false, false, true, "");
	
	Item riddlerCane  = new Item("Riddler's Cane", false, true, false, false, "");
	
	Item stapler  = new Item("Stapler", false, true, false, false, "");
	
	Item lightSaber  = new Item("Light Saber", false, true, false, false, "");
	
	Item axe  = new Item("Axe", false, true, false, false, "");
	
	Item tommyGun  = new Item("Tommy Gun", false, true, false, false, "");
	
	Item shanYuSword  = new Item("ShanYu's Sword", false, true, false, false, "");
	
	Item kungFu  = new Item("Kung Fu", false, true, false, false, "This will instantly kill Agent Smith");
	
	Item rubySlippers  = new Item("Ruby Slippers", false, false, true, false, "");
	
	Item jonesHat  = new Item("Indiana Jones' Hat", false, false, true, false, "");
	
	Item spaceSuit  = new Item("Space Suit", false, false, true, false, "");
	
	Item mustache  = new Item("Mustache", false, false, true, false, "Increases your Spaniardism.");
	
	Item scotch  = new Item("Bottle of Scotch", true, false, false, false, "");
	
	Item gobstopper  = new Item("Everlasting GobStopper", true, false, false, false, "");
	
	Item waffles  = new Item("Waffles", true, false, false, false, "");
	
	Item fish  = new Item("Fish", true, false, false, false, "");
	
	Item humanMeat  = new Item("Human Meat", true, false, false, false, "Liver with a fine Chianti");
	
		
}
