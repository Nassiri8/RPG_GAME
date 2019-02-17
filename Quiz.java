import java.util.*;
public class Quiz extends Plus{

    //fields
    private List<Question> list;
    Scanner enter = new Scanner(System.in);
    public String value;

    //constructor
    public Quiz( Key keyCondition, Key keyReward, List<Question> questions)
    {
	super(keyCondition, keyReward);
	this.list = questions;
    }

    //methods
    public Key reward()
    {
	return getKeyReward();
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

    public boolean play(List<Item> k)
    {
	if(canPlay(k))
	    {
		System.out.println("Welcome to the quiz");

		for(int i = 0; i < list.size(); i++)
		    {
			System.out.println(list.get(i).getQuestion());
			value = enter.nextLine();
      			if(list.get(i).getAnswer().equals(value))
			    {
				System.out.println("Correct");
				System.out.println("Win");
				
				
			    }else
			    {
			    System.out.println("Wrong");
			    return false;
			    }
		    }
		return true;
	    }else
	    {
	    System.out.println("Key required");
	    }
	    return false;
    }

}
