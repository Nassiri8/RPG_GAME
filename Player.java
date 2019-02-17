import java.util.*;

public class Player extends People
{
    //fields
    private String name; 
    private List<Item> bag;
    private Stats stats;
    private Weapon weapon;
    private int points;
   
    //constructor
    public Player(int x, int y)
    {
	super(x, y);
	this.bag = new ArrayList<Item>();
	this.name = "Kaaris Le Dozo ";
	this.stats = new Stats(2, 2, 1);
	this.points = 0;
    }

    //getters setters
    public String getName()
    {
	return this.name;
    }
      
    public Weapon getWeapon()
    {
	return this.weapon;
    }

    public void setWeapon(Weapon weapon)
    {
	this.weapon = weapon;
    }

    public List<Item> getBag()
    {
	return this.bag;
    }

    public void setBag(List<Item> bag)
    {
	this.bag = bag;
    }

    public Stats getStats()
    {
	return this.stats;
    }

    public void setStats(Stats stats)
    {
	this.stats = stats;
    }

    public void addPoints(int points)
    {
	this.points += points;
    }

    public void setPoints(int points)
    {
	this.points = points;
    }

    public int getPoints()
    {
	return this.points;
    }

    //methods
    public void addItem(Item item)
    {
	bag.add(item);
    }

    public boolean useWeapon(List<Item> bag)
    {
	for(int i= 0; i<bag.size(); i++)
	    {
		if(bag.get(i).getName() == "contrat")
		    {
			return true;
		    }
	    }
	return false;
    }
    
}
