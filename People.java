import java.util.*;
public abstract class People
{
    //var
    protected int x;
    protected int y;
    protected char[][] position;

    //getter setter
    public void setX(int x)
    {
	this.x =x;
    }

    public int getX()
    {
	return this.x;
    }

    public void setY(int y)
    {
	this.y =y;
    }

    public int getY()
    {
	return this.y;
    }

    public char[][] getPosition()
    {
	return this.position;
    }

    public void setPosition(char[][] position)
    {
	this.position = position;
    }

    //methods
    public void onRight()
    {
	if(y >= 20)
	    {
		y = 19;
	    }
	y++;
	    
    }

    public void onLeft()
    {
	if(y <= 0)
	    {
		this.y = 1;
	    }
	y--;
    }

    public void onBot()
    {
	if(x >= 20)
	    {
		this.x = 19;
	    }
	x++;
    }

    public void onTop()
    {
	if(x <= 0)
	    {
		this.x = 1;
	    }
	x--;
    }

    //constructor
    public People(int x, int y)
    {
	this.x = x;
	this.y = y;
	this.position = new char[x][y];
    }
}
