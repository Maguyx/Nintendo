

package test;

import java.util.ArrayList;
import java.util.List;

import metier.Console;
import metier.Jeu;


public class Test {

	
	
	
	public static void main(String[] args) {
		
		List<Console> nintendo =new ArrayList<Console>();
		
		Console ps4 = new Console ("PS4",399.0,"2013-11-15");
		Console wii = new Console ("WII",249.0,"2006-12-08");
		Console xbox = new Console ("XBOX",479.99,"2002-03-15");
		Console pc = new Console ("PC",null,null);
		nintendo.add(ps4);
		nintendo.add(wii);
		
		Jeu ac= new Jeu("Assassin's Creed", nintendo);
		Jeu fifa=new Jeu("Fifa", nintendo);
		Jeu witcher= new Jeu("The Witcher", nintendo);
		Jeu horizon = new Jeu("Horizon Zero Dawn", nintendo);
		Jeu lol = new Jeu("League of Legends", nintendo);
		

	}

}
