package com.sorting.aman;
import java.util.Scanner;
import java.util.Stack;
public class EvaluateSuffixToPrefix 
{
  public static void main(String[] args) 
  {
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String st=sc.next();
	Stack<Double> stk = new Stack<Double>();
	for(int i=0;i<st.length();i++ )
	{
		char ch=st.charAt(i);
		if(ch>=65 && ch>=90 || ch>=97 && ch<=122)
		{
			System.out.println("Enter the Value of "+ch);
			double val=sc.nextDouble();
			stk.push(val);
		}
		else
		{
			switch(ch)
			{
			   case '+':
				   a=stk.pop();
				   b=stk.pop();
				   stk.push(b+a);
				   break;
			   case '-':
				   a=stk.pop();
				   b=stk.pop();
				   stk.push(b-a);
				   break;
			   case '*':
				   a=stk.pop();
				   b=stk.pop();
				   stk.push(b*a);
				   break;
			   case '/':
				   a=stk.pop();
				   b=stk.pop();
				   stk.push(b/a);
				   break;
			   case '%':
				   a=stk.pop();
				   b=stk.pop();
				   stk.push(b%a);
				   break;
			}
		}
	}
	      System.out.println("Evaluate vales:"+ stk.pop());
  }
}
    