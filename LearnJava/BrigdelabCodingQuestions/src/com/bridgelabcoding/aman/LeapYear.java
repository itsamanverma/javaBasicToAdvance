package com.bridgelabcoding.aman;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		int year, n;
		String str;
		Utility u = new Utility();
		
		System.out.print("Enter the Year: ");
		str = u.inputString();
		year = Integer.parseInt(str);
		n = str.length();
		if (n != 4) 
		{
			System.out.println("enter year as 4 digit number");
			return;
		}
		else 
		{
			if (year % 400 == 0 && year % 100 == 0)
				System.out.println("year " + year + " is a leap year");
			else if (year % 100 != 0 && year % 4 == 0)
				System.out.println("year " + year + " is a leap year");
			else
				System.out.println("year " + year + " is not a leap year");
		}

	}

}
