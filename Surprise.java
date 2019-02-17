import java.util.*;
public class Surprise implements Item{

    //fiels
    private MiniGame game;
    private int x, y;

    //constructor
    public Surprise(int x, int y, Game game)
    {
	this.game = new MiniGame(game);
	this.x=x;
	this.y=y;
    }

    //getters Setters
    public void setGame(MiniGame game)
    {
	this.game = game;
    }

    public MiniGame getGame()
    {
	return this.game;
    }

    public void setX(int x)
    {
	this.x = x;
    }
    
    public int getX()
    {
	return this.x;
    }

    public void setY(int y)
    {
	this.x = x;
    }

    public int getY()
    {
	return this.x;
    }

    //methods

    public boolean start(List<Item> k)
    {
	return game.call(k);
    }
    public String getName()
    {
	return "";
    }
}
