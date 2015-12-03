
public class Encounter {

	public String enemyName;
	public int enemyHP;
	public int enemyATK;
	public int enemyDEF;
	public int enemySPD;
	public String riddle;
	public String answer;
	public String hint;
	//private Item rewardItem; to be used in conjunction with Item class
	
	public Encounter(String enemyName, int enemyHP, int enemyATK, int enemyDEF, int enemySPD, String riddle,
			String answer, String hint) {
		super();
		this.enemyName = enemyName;
		this.enemyHP = enemyHP;
		this.enemyATK = enemyATK;
		this.enemyDEF = enemyDEF;
		this.enemySPD = enemySPD;
		this.riddle = riddle;
		this.answer = answer;
		this.hint = hint;
	}
	
	//substituted player attack points with actual int value
	//substituted player health points with actual int value
	public void attack()
	{
		System.out.println("Player attacks with sword!");
		this.enemyHP -= (30 - this.enemyDEF);
		System.out.println(enemyName + " receives " + (30 - this.enemyDEF) + " damage.");
		System.out.println(enemyName + " attacks!");
		//Player.healthpoints -= (Encounter.enemyATK - Player.defensePoints);
		System.out.println("Player" + " receives " + (this.enemyATK - 10)  + " damage.");		
	}

	//substituted player speed with actual int value
	//substituted player health points with actual int value
	//room relocation to be implemented
	public void run()
	{
		System.out.println("Player attempts to flee!");
		if (40 > this.enemySPD)
		{
			//Player.moveto(prevRoom)
			System.out.println("Player has escaped to previous room");
		}
		else{
		System.out.println("Flee attempt has failed!");
		System.out.println(enemyName + " attacks!");
		//Player.healthpoints -= (Encounter.enemyATK - Player.defensePoints);
		System.out.println("Player" + " receives " + (this.enemyATK - 10)  + " damage.");		
		}
	}
	
	public void askRiddle()
	{
		System.out.println(riddle);
	}
	
	public boolean answerRiddle(String n)
	{
		if (n.equals(answer))
		return true;
		else {
		return false;
		}
	}
	
	public void getHint()
	{
		System.out.println(hint);
	}
	
	//to be fully implemented in conjunction with item class
	//public void reward()
	//{
	//	if(Encounter.enemyHP <= 0)
	//	{ }
			
	//}
}
