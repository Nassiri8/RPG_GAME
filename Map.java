import java.util.*;

public class Map implements EventListener
{
    // fields
    public int nbLig;
    public int nbCol;
    public char[][] carte;
    private Player player;
    private Ennemi monster;
    private Key k1;
    private Barre contrat;
    private Surprise surprise;
    private Surprise surprise1;
    private Surprise surprise2;
    Scanner enter = new Scanner(System.in);
    Random ran = new Random();
    public String touch;
    public int random;
    public boolean keyTake;
    public boolean useGame;
    public boolean contratTake;
    public boolean attack;
    public boolean useGame1;
    public boolean useGame2;

    // Construtor
    public Map(int x, int y)
    {
	this.attack = true;
	List<Question> list = new ArrayList<Question>();
	Question questions1 = new Question("1+2+3+4+5+6+7+8+9-3", "42");
	Question questions2 = new Question("1+2-3+4+5", "9");
	this.contrat = new Barre("contrat", 5, 18, 2);
	list.add(questions1);
	list.add(questions2);
	this.keyTake = false;
	this.useGame = false;
	this.useGame1 = false;
	this.useGame2 = false;
	this.contratTake = false;
	this.random = 2 + ran.nextInt(19 - 2 + 1);
	this.surprise1 = new Surprise(4, 7, new Quiz(new Key("Key1", 0,0), new Key("key2", 0,0), list));
	this.player = new Player(8, 1);
	this.monster = new Ennemi(19, 19);
	this.k1 = new Key("Key1", 1, 3);
	this.surprise = new Surprise(1, 5, new PlusMinusGame(new Key("Key1", 0,0), new Key("key2", 0,0)));
	this.surprise2 = new Surprise(9, 12, new PaperScissor(new Key("Key1", 0,0), new Key("key2", 0,0)));
	this.nbLig = x;
	this.nbCol = y;
	carte = new char[nbLig][nbCol];
	for(int i =0; i < nbLig; i++)
	    {
		for(int j=0; j<nbCol; j++ )
		    {
			carte[i][j] = '.'; 
		    }
	    }
    }

    // setter getter
    public void setPlayer(Player player)
    {
	this.player = player;
    }

    public Player getPlayer()
    {
	return this.player;
    }

    public void setK1(Key k1)
    {
	this.k1 = k1;
    }

    public Key getK1()
    {
	return this.k1;
    }

    // methods    
    public void drawMap()
    {
	System.out.println();
	for(int i = 0; i < nbLig; i++)
	    {
		for(int j = 0; j< nbCol; j++)
		{
		    if(i == player.getX() && j == player.getY())
			{
			    System.out.print("  K");
			}
		    else if(i == monster.getX() && j == monster.getY())
			{
			    System.out.print("  B");
			}
		    else if(i == k1.getX() && j == k1.getY() && !keyTake)
			{
			    System.out.print("  *");
			}
		    else if(i == surprise.getX() && j == surprise.getY() && !useGame)
			{
			    System.out.print("  ?");
			}
		    else if(i == surprise1.getX() && j == surprise1.getY() && !useGame1)
			{
			    System.out.print("  ?");
			}
		    else if(i == surprise2.getX() && j == surprise2.getY() && !useGame2)
			{
			    System.out.print("  ?");
			}
		    else if(i == contrat.getX() && j == contrat.getY() && !contratTake)
			{
			    System.out.print("  c");
			}
		    else
			System.out.print("  " + carte[i][j]);
		 }
		System.out.println("|");
	    }
	System.out.println();
    }

    public void move()
    {
	
	this.touch = enter.next();
	switch (touch)
	    {
	    case "d":
		System.out.println("droit");
		player.onRight();
		break;
	    case "a":
		System.out.println("gauche");
		player.onLeft();
		break;
	    case "w":
		System.out.println("haut");
		player.onTop();
		break;
	    case "s":
		System.out.println("bas");
		player.onBot();
		break;
	    case "p":
		System.out.println("attrape");
		this.put();
		break;
	    case "o":
		System.out.println("attaque");
		this.attack();
		break;
	    default:
		System.out.println("Unknown key pressed");
		break;
	    }
	    
    }

    public boolean moveEnnemi()
    {
	if(player.getY() != monster.getY() || player.getX() != monster.getX())
	    {
		if(player.getY() < monster.getY())
		    {
			monster.onLeft();
		    }
		else if(player.getY() > monster.getY())
		    {
			monster.onRight();
		    }
		else if(player.getX() < monster.getX())
		    {
			monster.onTop();
		    }
		else if(player.getX() > monster.getX())
		    {
			monster.onBot();
		    }
		return true;
	    }
	if(player.getY() == monster.getY() || player.getX() == monster.getX())
	    {
		player.getStats().setHeal(0);
		return false;
	    }
	
	return false;
    }

    public void printStatPlayer()
    {
	System.out.println("Nom: " + player.getName() + "Life: " + player.getStats().getHeal() + " Attaque: " + player.getStats().getAttack() + " Points :" + player.getPoints());
    }

    public void put()
    {
	if(player.getX() == k1.getX() && player.getY() == k1.getY() && !keyTake)
	    {
		player.addItem(k1);
		keyTake = true;
		player.addPoints(25);
	    }else if(player.getX() == surprise.getX() && player.getY() == surprise.getY() && !useGame)
	    {
		boolean hasWin = surprise.start(player.getBag());
		if (hasWin)
		    player.addPoints(50);
		useGame = true;
	    }
	else if(player.getX() == surprise1.getX() && player.getY() == surprise1.getY() && !useGame1)
	    {
		boolean hasWin =surprise1.start(player.getBag());
		if (hasWin)
		    {
		    player.addPoints(50);
      		    }
		useGame1 = true;
	    }
	else if(player.getX() == surprise2.getX() && player.getY() == surprise2.getY() && !useGame2)
		{
		   boolean hasWin = surprise2.start(player.getBag());
		   if(hasWin)
		       player.addPoints(50);
		    useGame2 = true;
		}
	    else if(player.getX() == contrat.getX() && player.getY() == contrat.getY() && !contratTake)
		{
		    player.addItem(contrat);
		    player.addPoints(100);
		    contratTake = true; 
		}
    }

    public void attack()
    {
	if (
	    (player.getX() == monster.getX() +1 && player.getY() == monster.getY() +1) ||
	    (player.getX() == monster.getX() -1 && player.getY() == monster.getY() -1) ||
	    (player.getX() == monster.getX() +1 && player.getY() == monster.getY()) ||
	     (player.getX() == monster.getX()  && player.getY() == monster.getY() +1) ||
	     (player.getX() == monster.getX()  && player.getY() == monster.getY() -1) ||
	     (player.getX() == monster.getX() -1 && player.getY() == monster.getY())
	     )
	    {
       		if(player.useWeapon(player.getBag()))
		    {
			System.out.println("Win");
			monster.getStats().setHeal(0);
		    }
	    }
    }

    public int ennemiVie()
    {
	return monster.getStats().getHeal();
    }

    public int playerVie()
    {
	return player.getStats().getHeal();
    }    
}
