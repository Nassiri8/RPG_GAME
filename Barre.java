public class Barre extends Weapon{

    //fields
    private int damagePoints;
    private int x, y;

    //getter setters
    public void setDamagePoint(int damagePoints)
    {
	this.damagePoints = damagePoints;
    }

    public int getDamagePoint()
    {
	return this.damagePoints;
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
    public Barre(String name, int x, int y, int damagePoints)
    {
	super(name);
	this.x=x;
	this.y=y;
	this.damagePoints = damagePoints;
    }
    
    public String getName()
    {
	return "contrat";
    }
    
}
