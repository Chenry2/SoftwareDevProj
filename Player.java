public class Player
{
	public static String playerName;
	public static int healthPoints = 200;
	public static int attackPoints = 10;
	public static int defensePoints = 10;
	public static int speedPoints = 10;
	public Item equWeapon;
	public Item armor1;
	public Item armor2;

	public Player(String name)
	{
    	super();
    	this.playerName = name;
    	this.healthPoints = 200;
    	this.attackPoints = 10;
    	this.defensePoints = 10;
    	this.speedPoints = 10;
    	this.equWeapon = null;
    	this.armor1 = null;
    	this.armor2 = null;
	}

	public static int getHealthPoints() {
    	return healthPoints;
	}
	public void setHealthPoints(int healthPoints)
	{
    	this.healthPoints = healthPoints;
	}

	public static int getAttackPoints() {
    	return attackPoints;
	}
	public void setAttackPoints(int attackPoints) {
    	this.attackPoints = attackPoints;
	}
	public static int getDefensePoints() {
    	return defensePoints;
	}
	public void setDefensePoints(int defensePoints) {
    	this.defensePoints = defensePoints;
	}
	public static int getSpeedPoints() {
    	return speedPoints;
	}
	public void setSpeedPoints(int speed) {
    	this.speedPoints = speed;
	}

	public static String getPlayername() {
    	return playerName;
	}
	public void setPlayername(String playerName) {
    	this.playerName = playerName;
	}

	public void equipweapon(Item w)
	{
    	if (this.equWeapon == null)
    	{
        	this.equWeapon =  w;
        	this.setAttackPoints(this.attackPoints + w.getItemAtk());
        	this.setSpeedPoints(this.speedPoints + w.getItemSpeed());
    	}
    	else
    	{
        	System.out.println("This slot is full. Please swap weapon with the new one");
    	}
	}

	public void equiparmor1(Item a)
	{
    	if (this.armor1 == null)
    	{
        	this.armor1 = a;
        	this.healthPoints = healthPoints + a.getItemHP();
        	this.defensePoints = defensePoints + a.getItemDef();
    	}
    	else
    	{
        	System.out.println("This slot is full. Please swap armor1 with the new one");
    	}
	}


	public void equiparmor2(Item b)
	{
    	if (this.armor1 == null)
    	{
        	this.armor2 = b;
        	this.healthPoints = healthPoints + b.getItemHP();
        	this.defensePoints = defensePoints + b.getItemDef();
    	}
    	else
    	{
        	System.out.println("This slot is full. Please swap armor2 with the new one");
    	}
	}    

	public void addItem(Item i)
	{
    	this.addItem(i);
	}

	public void swapWeapon(Item w)
	{
    	if (this.equWeapon != null && w.weapon == true) //must look later
    	{
        	this.attackPoints = this.attackPoints - this.equWeapon.getItemAtk();
        	this.speedPoints = this.getSpeedPoints() - this.equWeapon.getItemSpeed();
        	this.equWeapon = w;
        	this.setAttackPoints(this.attackPoints + this.equWeapon.getItemAtk());
        	this.setSpeedPoints(this.speedPoints + this.equWeapon.getItemSpeed());

    	}
    	else
    	{
        	System.out.println("There is no weapon equipped in this slot");
    	}

	}

	public void swapArmor1(Item i)
	{
   	 
    	if (this.armor1 != null && i.armor == true) //must look later
    	{
       	 
        	this.defensePoints = defensePoints - this.armor1.getItemDef();
        	this.healthPoints = healthPoints - this.armor1.getItemHP();
        	this.armor1 = i;
        	this.setDefensePoints(this.defensePoints + this.armor1.getItemDef());
        	this.setHealthPoints(this.healthPoints + this.armor1.getItemHP());
    	}
    	else
    	{
        	System.out.println("There is no armor equipped in this slot");
    	}

	}

	public void swapArmor2(Item i)
	{
    	if (this.armor2 != null && i.armor == true) //must look later
    	{
        	this.defensePoints = defensePoints - this.armor2.getItemDef();
        	this.healthPoints = healthPoints - this.armor2.getItemHP();
        	this.armor2 = i;
        	this.setDefensePoints(this.defensePoints + this.armor2.getItemDef());
        	this.setHealthPoints(this.healthPoints + this.armor2.getItemHP());
    	}
    	else
    	{
        	System.out.println("There is no armor equipped in this slot");
    	}

	}
}
