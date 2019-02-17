import java.util.*;
public class Main{

    public static void main(String[] arg)
    {
     Menu menu = new Menu();
     World w = new World(20, 20);
     System.out.println("Bienvenue Dans OCTOGONE:");
    
     menu.start();
	 if(menu.choice == 1 )
	   {
	 	w.start();
	   }
	 else if(menu.choice == 2)
	     {
		 w.startServer();
		 w.startClient();
	     }
    }
}
