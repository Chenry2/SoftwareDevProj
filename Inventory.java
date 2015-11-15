public class Inventory {
	
	private static String inventory[] = new String[10];
	
	public void addItem(String name){
		
		for(int i = 0; i < inventory.length; i++)
		{
			if(inventory[i] == null){
				inventory[i] = name;
				
				System.out.println(name + " added to inventory");
				return;
				
			}
		
		}
		
		System.out.println("Could not add item due to full inventory.");
		
	}
	
	
	public void removeItem(String name){
		for(int i = 0; i < inventory.length; i++){
			if(inventory[i].equals(name)){
				inventory[i] = null;
			} else {
				System.out.println("No such item in inventory.");
			}
		}
	}
	
	
	public void printInventory() {
		for(int i = 0; i < inventory.length; i++){
		if(inventory[i] != null){
			System.out.println(inventory[i]);
		}
	  }
	} 
}