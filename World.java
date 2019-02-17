import java.util.*;
public class World
{
    //var
    private Map map;
    // private Server server;
    // private Client client;
    
    //constructor
    public World(int x, int y)
    {
	this.map = new Map(x, y);
	//this.server = new Server();
	//this.client = new Client();
    }

    //setter getter
    public void setMap(Map map)
    {
	this.map = map;
    }

    public Map getMap()
    {
	return this.map;
    }


    // method to start
    public void start()
    {
	boolean play = true;
	
	System.out.println("\033[H\033[2J");
	map.printStatPlayer();
	map.drawMap();
	while(map.ennemiVie() > 0 && play == true && map.playerVie() > 0)
	 {
	     map.move();
	     play = map.moveEnnemi();
	     System.out.println("\033[H\033[2J");
	     map.drawMap();
	     map.printStatPlayer();
	     System.out.println("Booba life: " + map.ennemiVie());
	 }
	if(map.ennemiVie() == 0)
	    {
		System.out.println("YOU WIN, tu as vaincu Booba le DUC");
		play = false;
	    }
	if(map.playerVie() == 0 || play == false)
	    {
		System.out.println("GAME OVER");
	    }
	
    }

    public void startServer()
    {
	//server.start();
    }
    public void startClient()
    {
	//client.start();
    }

}
