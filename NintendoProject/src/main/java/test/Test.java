

package test;

import java.util.ArrayList;
import java.util.List;

import metier.Console;
import metier.Jeu;


public class Test {

	
	
	
	public static void main(String[] args) {
		
		List<Console> nintendo =new ArrayList<Console>();
		
		Console ps4 = new Console ("PS4");
		Console wii = new Console ("WII");
		Console xbox = new Console ("XBOX");
		Console pc = new Console ("PC");
		nintendo.add(ps4);
		nintendo.add(wii);
		
		Jeu ac= new Jeu("Assassin's Creed", nintendo);
		Jeu fifa=new Jeu("Fifa", nintendo);
		Jeu witcher= new Jeu("The Witcher", nintendo);
		Jeu horizon = new Jeu("Horizon Zero Dawn", nintendo);
		Jeu lol = new Jeu("League of Legends", nintendo);
		

	}

}
