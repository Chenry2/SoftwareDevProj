/*
 * @author Carlan Henry
 */
public class Item {

    public String name;
    public String itemDescription;
    public boolean consumable;
    static boolean weapon;
    static boolean armor;
    public static boolean keyItem;
    public static int itemAtk;
    public static int itemDef;
    public static int itemSpeed;
    public static int itemHP;
    
  


	public Item(String name, boolean consumable, boolean weapon, boolean armor, boolean keyItem, String itemDescription, int itemAtk, int itemDef, int itemSpeed, int itemHP) {
        
    	
        this.name = name;
        this.itemDescription = itemDescription;
        this.consumable = consumable;
        this.weapon = weapon;
        this.armor = armor;
        this.keyItem = keyItem;
        this.itemAtk = itemAtk;
        this.itemDef = itemDef;
        this.itemSpeed = itemSpeed;
        this.itemHP = itemHP;
    }
    
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
    
    @Override
    public String toString() {
        
        return name;
    }
    
    
    
    static Item thePrecious  = new Item("The Precious", true, false, false, true, "One Ring", 0, 0, 0, 0);
    
    static Item riddlerCane  = new Item("Riddler's Cane", false, true, false, false, "?", 25, 0, 30, 0);
    
    static Item stapler  = new Item("Stapler", false, true, false, false, "Watch your thumb!", 5, 0, 7, 0);
    
    static Item lightSaber  = new Item("Light Saber", false, true, false, false, "Ooo Shiny!", 50, 0, 30, 0);
    
    static Item axe  = new Item("Axe", false, true, false, false, "Chop! Chop!", 20, 0, 25, 0);
    
    static Item tommyGun  = new Item("Tommy Gun", false, true, false, false, "My Little Friend", 100, 0, 95, 0);
    
    static Item shanYuSword  = new Item("ShanYu's Sword", false, true, false, false, "A Sinister Blade", 30, 0, 25, 0);
    
    static Item kungFu  = new Item("Kung Fu", false, true, false, false, "This will instantly kill Agent Smith", 70, 0, 85, 0);
    
    static Item rubySlippers  = new Item("Ruby Slippers", false, false, true, false, "Going to see The Wizard", 0, 10, 0, 25);
    
    static Item jonesHat  = new Item("Indiana Jones' Hat", false, false, true, false, "It belongs in a museum!", 0, 20, 0, 20);
    
    static Item spaceSuit  = new Item("Space Suit", false, false, true, false, "Houston...", 0, 50, 0, 85);
    
    static Item baneMask  = new Item("Bane's Mask", false, false, true, false, "No one cared who I was until I put on the mask.", 0, 30, 0, 50);
    
    static Item mustache  = new Item("Mustache", false, false, true, false, "Increases your Spaniardism.", 0, 15, 0, 65);
    
    static Item scotch  = new Item("Bottle of Scotch", true, false, false, false, "Why is the rum gone!?", 0, 0, 0, 0);
    
    static Item beetles  = new Item("Beetles", true, false, false, false, "Might make good juice", 0, 0, 0, 0);
    
    static Item phone  = new Item("Phone", true, false, false, false, "Ring Ring", 0, 0, 0, 0);
    
    static Item gobstopper  = new Item("Everlasting GobStopper", true, false, false, false, "For children with very little pocket money.", 0, 0, 0, 0);
    
    static Item chocolates  = new Item("Box of Chocolates", true, false, false, false, "Momma always said...", 0, 0, 0, 0);
    
    static Item grenade  = new Item("Holy Hand Grenade", true, false, false, false, "Consult the Book of Armaments!", 999, 0, 0, 0);
    
    static Item gourd  = new Item("Gourd", true, false, false, false, "Rafiki knows the way!", 0, 0, 0, 50);
    
    static Item waffles  = new Item("Waffles", true, false, false, false, "Should invent a house where these are made.", 0, 0, 0, 0);
    
    static Item fish  = new Item("Fish", true, false, false, false, "Ick.", 0, 0, 0, 0);
    
    static Item humanMeat  = new Item("Human Meat", true, false, false, false, "Liver with a fine Chianti.", 0, 0, 0, 0);
    
    static Item ticket  = new Item("Traffic Ticket", true, false, false, false, "In a rush?", 0, 0, 0, 0);
    
    static Item laser  = new Item("Fake Laser", false, false, false, false, "Pew Pew", 0, 0, 0, 0);
    
    static Item badge  = new Item("Boy Scout Badge", false, false, false, false, "Scout's Honor!", 0, 0, 0, 0);
   
    static Item spoon  = new Item("Bent Spoon", false, false, false, false, "Strong mind!", 0, 0, 0, 0);
}