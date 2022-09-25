package com.Aman.Eatable;

public class Cheif {
    void participate() {
    	Spin s = new Spin();
    	Eatable e = s.spinTheSpin();//up-casting
    	if(e!=null)
    		e.prepare();
    }
    public static void main(String[] args) {
		Cheif c = new Cheif();
		   c.participate();
	}
}
