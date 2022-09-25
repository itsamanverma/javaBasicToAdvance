package com.collection.aman;

public class Player 
{
  public int jersyNumber;
  public String playerName;
  
  public Player(int jersyNumber,String playerName)
  {
	  this.jersyNumber=jersyNumber;//up
	  this.playerName=playerName;
  }
  @Override
  public int hashCode()
  {
  return this.jersyNumber;
  }
  @Override
  public boolean equals(Object obj)
  {
	  boolean res=false;
	  if(obj instanceof Player)
	  {
		  Player anp =(Player)obj;//Down Casting
		  if(this.jersyNumber==anp.jersyNumber)
		  {
			  res=true;
		  }else
			  res = false;
	  }
	  return res;
  }
  
  @Override
  public String toString()
  {
	  return this.playerName+"   "+this.jersyNumber;
  }
}
