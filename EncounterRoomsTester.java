import java.util.Scanner;

public class EncounterRoomsTester extends Encounter
{
    
	public static void main(String[] args) 
	{
		Encounter terminator = new Encounter("The Terminato",100 ,10, 10, 10 ,"What is my name?" ,"The Terminator" ,"It's already been said");
		Encounter jackiechan = new Encounter("Jackie Chan",100 ,10, 10, 50 ,"What is my name?" ,"Jackie Chan" ,"It's already been said");
		
		System.out.println("1.attack");
		System.out.println("2.run");
		System.out.println("3.ask riddle");
		System.out.println("4.answer riddle");
		System.out.println("5.get hint");
		
		Scanner input = new Scanner(System.in);     
        System.out.println("The Terminator has been encountered");
        
        String userInput = input.nextLine();
        
        if (userInput.equals("attack"))
        {
            terminator.attack();
        } 
        else if (userInput.equals("run"))
        {
            terminator.run();
        } 
        else if (userInput.equals("ask riddle"))
        {
            terminator.askRiddle();
        } 
        else if (userInput.equals("answer riddle"))
        {
            System.out.println("What is your answer");
            String n = input.nextLine();
        	terminator.answerRiddle( n );
        } 
        else if (userInput.equals("get hint"))
        {
            terminator.getHint();
        } 
        else
        {
        	System.out.println("Invalid choice....please choose from the above options");
        }
        
System.out.println("Jackie Chan has been encountered");
        
        String userInput2 = input.nextLine();
        
        if (userInput2.equals("attack"))
        {
            jackiechan.attack();
        } 
        else if (userInput2.equals("run"))
        {
            jackiechan.run();
        } 
        else if (userInput2.equals("ask riddle"))
        {
            jackiechan.askRiddle();
        } 
        else if (userInput2.equals("answer riddle"))
        {
            System.out.println("What is your answer");
            String n = input.nextLine();
        	jackiechan.answerRiddle( n );
        } 
        else if (userInput2.equals("get hint"))
        {
            jackiechan.getHint();
        } 
        else
        {
        	System.out.println("Invalid choice....please choose from the above options");
        }
        
	}
}
