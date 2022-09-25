package com.Aman.game;

public class Gun extends Weapon {
	@Override
	public void use() {
		System.out.println("shoot the gun");
	}
   //Sub -class specific method
	public void loadButton() {
		System.out.println("Load the Gun");
	}
}
