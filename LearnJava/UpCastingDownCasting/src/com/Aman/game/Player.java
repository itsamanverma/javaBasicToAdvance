package com.Aman.game;

public class Player {
	void play() {
		Game gm = new Game();
	    Weapon wpn = gm.pressButton();
	  if(wpn instanceof Gun)
	  {
		  Gun g = (Gun)wpn;//down-casting
		  g.loadButton();
	  }else if (wpn instanceof Knife) {
		  Knife k = (Knife)wpn;
		  k.sharpen();
	  }
	  wpn.use();
	}
	public static void main(String[] args) {
		Player p = new Player();
		p.play();
	}

}
