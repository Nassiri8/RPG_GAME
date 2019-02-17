import java.util.*;
public class Key implements Item{

    //fields
    private String name;
    private int x, y;

    //getterSetter
    public Key(String name)
    {
	this.name = name;
    }

    public String getName()
    {
	return this.name;
    }

    public int getX()
    {
	return this.x;
    }

    public void setX(int x)
    {
	this.x =x;
    }

    public int getY()
    {
	return this.y;
    }

    public void setY(int y)
    {
	this.y = y;
    }

    //constructor

    public Key(String name,int x, int y)
    {
	this.name = name;
	this.x = x;
	this.y = y;
    }

    //Methods
    public void put(Player player)
    {
	
    }

    public void tidy(Player player)
    {
	
    }
}
