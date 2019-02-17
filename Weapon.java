import java.util.*;
public abstract class Weapon implements Item{
    
    protected String name;
      
    public void setName(String name)
    {
	this.name = name;
    }

    public String getName()
    {
	return this.name;
    }

    public Weapon(String name)
    {
	this.name = name;
	
    }

  
}
