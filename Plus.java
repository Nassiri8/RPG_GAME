import java.util.*;
public abstract class Plus implements Game{

    //fields
  
    private Key keyCondition, keyReward;
  

    //getter setter
    public Key getKeyCondition()
    {
	return this.keyCondition;
    }

    public Key getKeyReward()
    {
	return this.keyReward;
    }

    /* public int getX()
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
	}*/

    //constructor
    public Plus( Key keyCondition, Key keyReward )
    {
	//this.x = x;
	//this.y = y;
	this.keyCondition = keyCondition;
	this.keyReward = keyReward;
    }

    public abstract boolean play(List<Item> k);
    public abstract boolean canPlay(List<Item> k);
    public abstract Key reward();
}
