package com.bridgelabcoding.aman;
import java.util.Scanner;
import java.util.Stack;
public class BalancedString 
{
public static void main(String[] args) 

  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the String to check the it balanced or not:");
	 String st=sc.next();//{}{}{}
	 Stack<Character> stk= new Stack<Character>();
	 for(int i=0;i<st.length();i++)
	 {
		 char ch=st.charAt(i);
		 if(ch=='['||ch=='{'||ch=='(')
		 {
			 stk.push(ch);
		 }
		 else
		 {
			 if(stk.isEmpty())
			 {
				 System.out.println("String is not Balanced..!");
				 return;
			 }
		 char c=stk.pop();
		 switch(ch)
		 {
		 case '}': if(c!='{')
				      {
					    System.out.println("String is Not Balanced..!");
					    return;
				      }
				      break;
		 case ']': if(c!='[')
				      {
					    System.out.println("String is Not Balanced..!");
					    return;
				      }
				      break;
		 case ')': if(c!='(')
				      {
					    System.out.println("String is Not Balanced..!");
					    return;
				      }
		}
	 }
   }
	 if(stk.isEmpty())
		 System.out.println("String is Balanced..!");
	 else
		 System.out.println("String is Not Balanced");
  }
}

