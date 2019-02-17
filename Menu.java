import java.util.*;
public class Menu{

    public int choice;
    public String quit;
    String first = "Mode de jeu:";
    String second = "1- Arcade   2- Multijoueur";
    
     public void quit()
    {
	//	quit = enter.next();
	//if(quit == "q")
	//  {
	//	return;
	//  }
    }

    public void start()
    {
	System.out.println(first);
	System.out.println(second);
	choice = new java.util.Scanner(System.in).nextInt();
	
	if(choice == 1)
	    {
		System.out.println("Te voila dans l'arcade");
		System.out.println("Ta mission, SURVIVRE dans l'arène:");
	    }
	else if(choice == 2)
	    {
		System.out.println("Multi joueur en attente d'un allié");
	    }
	else
	    {
		System.out.println("Rentre le bon numéro bg !");
	    }
    }

}
