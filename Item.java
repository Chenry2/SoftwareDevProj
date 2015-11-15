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
	
}
