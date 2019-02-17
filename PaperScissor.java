import java.util.*;

public class PaperScissor extends Plus
{
    private List<Integer> list;
    Scanner enter = new Scanner(System.in);
    public String choice;
    Random ran = new Random();
    public int random;

    public PaperScissor(Key keyCondition, Key keyReward)
    {
	super(keyCondition, keyReward);
	this.list = new ArrayList<Integer>();
    }

    public void addNumber()
    {
	list.add(1);
	list.add(2);
	list.add(3);
    }
	
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

    public Key reward()
    {
	return getKeyReward();
    }

    public boolean play(List<Item> k)
    {
	
	if(canPlay(k) == true)
	    {
		System.out.println("Welcome to Papper Scissor Rock");
		System.out.println("1-Rock 2-Paper 3-Scissors");
		for(int i = 0; i<3; i++)
		    {
			this.addNumber();
			int random = 0 + ran.nextInt(2 - 0 + 1);
			int comp = list.get(random);
			choice = enter.nextLine();
			
			if(this.choice.matches("[1-3]"))
			    {       
				if(comp == 3 && Integer.parseInt(choice) == 2)
				    {
					System.out.println("Win");
				    }
				if(comp == 3 && Integer.parseInt(choice) == 1)
				    {
					System.out.println("Lose");
					return false;
				    }
				if(comp == 2 && Integer.parseInt(choice) == 1)
				    {
					System.out.println("Win");
				    }
				if(comp == 2 && Integer.parseInt(choice) == 1)
				    {
					System.out.println("Win");
				    }
				if(comp == 2 && Integer.parseInt(choice) == 3)
				    {
				    System.out.println("Lose");
				    return false;
				    }
				if(comp == 1 && Integer.parseInt(choice) == 3)
				    {
					System.out.println("Win");
				    }
				if(comp == 1 && Integer.parseInt(choice) == 2)
				    {
				    System.out.println("Lose");
				    return false;
				    }
				if(comp == Integer.parseInt(choice))
				    {
					System.out.println("Ohh the same, try again");
				    }
       			    }
			else{
			    System.out.println("rentre un chiffre entre 1 et 3 bg");
			}
			return false;
		    }
		
		
	    }
	return false;
    }
        
}
