import java.util.*;
public class MiniGame{

    //Fields
    public Game jeu1;
   

    //constructor
    public MiniGame(Game jeu1)
    {
	this.jeu1 = jeu1;
    }

    //methods
    public boolean call(List<Item> k)
    {
	boolean yeah = jeu1.play(k);
	return yeah;
    }
}
