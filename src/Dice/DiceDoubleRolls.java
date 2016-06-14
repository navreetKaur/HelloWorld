package Dice;
import java.util.Random;


public class DiceDoubleRolls {
	public static void main( String[] args )
    {
        int dienumber1,dienumber2;
        Random rnd = new Random();
        
        dienumber1 =  1 + rnd.nextInt(6);
        dienumber2 =  1 + rnd.nextInt(6);
        
        System.out.println("User rolls: " + dienumber1 + " & " + dienumber2);
        if (dienumber1 == dienumber2) {
        	System.out.println("Move " + (dienumber1 + dienumber2) +" roll again getting...");
        	dienumber1 =  1 + rnd.nextInt(6);
            dienumber2 =  1 + rnd.nextInt(6);
            
            System.out.println("User rolls: " + dienumber1 + " & " + dienumber2);
            if (dienumber1 == dienumber2) {
            	System.out.println("Move " + (dienumber1 + dienumber2) +" roll again getting...");
            	dienumber1 =  1 + rnd.nextInt(6);
                dienumber2 =  1 + rnd.nextInt(6);
                
                System.out.println("User rolls: " + dienumber1 + " & " + dienumber2);
                if (dienumber1 == dienumber2) {
                	System.out.println("You go to jail!");
                }
            } else {
            	System.out.println("Move " + (dienumber1 + dienumber2) +" Spaces and stop");
            }
        } else {
        	System.out.println("Move " + (dienumber1 + dienumber2) +" Spaces and stop");
        }
    }

}
