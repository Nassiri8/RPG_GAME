import java.util.*;

public class Stats{

    //fields
    private int attack;
    private int defence;
    private int heal;

    //getters setters
    public int getHeal()
    {
	return this.heal;
    }

    public void setHeal(int heal)
    {
	this.heal = heal;
    }

    public int getAttack()
    {
	return this.attack;
    }

    public void setAttack(int attack)
    {
	this.attack = attack;
    }

    public int getDefence()
    {
	return this.defence;
    }

    public void setDefence(int defence)
    {
	this.defence = defence;
    }
    
    //constructor
    public Stats(int a, int b, int c)
    {
	this.attack = a;
	this.defence = b;
	this.heal = c;
    }

    //methods
    public void increaseAttack(int attack)
    {
	this.attack += attack;
    }

    public void increaseDefence(int defence)
    {
	this.defence += defence;
    }

    public void decreaseAttack(int attack)
    {
	this.attack -= attack;
	if(attack < 0)
	    this.attack = 0;
    }

    public void decreaseDefence(int defence)
    {
	this.defence -= defence;
	if(defence < 0)
	    this.defence = 0;
    }
}
