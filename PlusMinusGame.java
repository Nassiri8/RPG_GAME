import java.util.*;
public class PlusMinusGame extends Plus{

    //fields
    Scanner enter = new Scanner(System.in);
    public String findValue;
    public String input;

    //constructor
    public PlusMinusGame( Key keyCondition, Key keyReward)
    {
      	super(keyCondition, keyReward);
	this.input = "69";
	
    }

    //getters setters
    public Key reward()
    {
	return getKeyReward();
    }

    //methods
    public boolean canPlay(List<Item> k)
    {
	for(int i =0; i<k.size(); i++)
	    {
		if(k.get(i).getName() == getKeyCondition().getName())
		    {
			return true;
		    }
	    }
	return false;
    }


    public boolean play(List<Item> k)
    {
	
	if(canPlay(k))
	    {
		System.out.println("Welcome to the PlusMinus game!");
		
      		for(int comp = 0; comp < 10; comp++ )
		    {
			this.findValue = enter.nextLine();
			if(this.findValue.matches("[0-9]+"))
			    {
				if(Integer.parseInt(input) > Integer.parseInt(this.findValue))
				    System.out.println("Greater");
				else if(Integer.parseInt(input) < Integer.parseInt(this.findValue))
				    System.out.println("Lower");
				else if( Integer.parseInt(input) == Integer.parseInt(this.findValue))
				    {
					System.out.println("Win");
					return true;
				    }
			    }
		    }  
			    System.out.println("Lose");

			  
		    
	    }
	return false;
	}
	
    
    
}
