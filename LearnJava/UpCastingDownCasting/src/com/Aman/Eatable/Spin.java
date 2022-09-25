package com.Aman.Eatable;
import java.util.Random;

public class Spin {
	
	Eatable spinTheSpin() {
		/* 0-----> Paneer
		 * 1||3----->null
		 * 2--->Corn
		 * 4--->Rice
		 * 5--->Chicken
		 * */
		java.util.Random r = new Random();
		int rn = r.nextInt(5);
		if(rn==0)
			return new Paneer();
		else if(rn==1||rn==3)
	        return null;
		else if(rn==2)
			return new Corn();
		else if(rn==4)
			return new Rice();
		else
			return new Chicken();
		
	}
}
