
package com.Aman.game;
import java.util.Random;
/**
 * @author Aman
 *
 */
public class Game {
	String gameName = "Pubg";
	 
 Weapon pressButton() {
		Random r = new Random();
		int rn = r.nextInt(3);
		 
		if(rn==0)
			return new Gun();
		else if(rn==1)
			return new Bmob();
		else 
			return new Knife();
		
	}

}
