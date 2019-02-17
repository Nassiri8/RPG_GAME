import java.util.*;
public class Ennemi extends People{

    //fields
    private String name;
    private Stats stats;

    //constructor
    public Ennemi(int x, int y)
    {
	super(x, y);
	this.name = "Booba";
	this.stats = new Stats(1, 0, 2);
    }

    //setter getter
    public void setName(String name)
    {
	this.name = name;
    }

    public String getName()
    {
	return this.name;
    }

    public void setStats(Stats stats)
    {
	this.stats = stats;
    }

    public Stats getStats()
    {
	return this.stats;
    }

    //methods
    public void death(boolean raison)
    {
	if(raison != false)
	    this.stats.setHeal(0);
    }
    
}
