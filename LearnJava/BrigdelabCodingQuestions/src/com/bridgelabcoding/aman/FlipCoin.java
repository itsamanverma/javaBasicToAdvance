package com.bridgelabcoding.aman;
public class FlipCoin
{
public static void main(String[] args)
  {
    int loopCount = 1;
    double result;
    while(loopCount<15)
      {
       result = Math.random();
       if(result <= .5)
       System.out.println("Thelt is heads.");
       else
       System.out.println("Thelt is tails.");
       loopCount = loopCount+1;
}

}
}
