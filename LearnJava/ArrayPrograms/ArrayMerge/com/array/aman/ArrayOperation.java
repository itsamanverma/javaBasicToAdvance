package com.array.aman;

import java.util.Scanner;
public class ArrayOperation
{

	int[] readArray() 
	{
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the Size of the Array..");
	      int n = sc.nextInt();
	      int arr[]=new int[n];
	      System.out.println("Enter"+n+" Integer Values.");
	      for(int i=0;i<arr.length;i++)
	      {
	    	  arr[i]=sc.nextInt();
	      }		
	      return arr;
	}

    void dispArray(int[] arr) 
          {
		    for(int i=0;i<arr.length;i++)
		    	{
		    	  System.out.print(arr[i]+" ");
		    	}
		    System.out.println();
	      }

    int[] merge(int[] x, int[] y) 
        {
		  int z[]=new int[x.length+y.length];
		  for(int i=0;i<x.length||i<y.length;i++)
		  {
			  if(i<x.length)
			  {
				  z[i]=x[i];
			  }
			  if(i<y.length)
			  {
				  z[x.length+i]=y[i];
			  }
		  }
		return z;
      }
  
    boolean isPrime(int n)//Check the number is prime or not(A7) 
     {
	   int i=2;
	   while(i<=n/2)
	   {
		   if(n%i==0)
		    return false;
		    i++;
	   }
	   return true;
     }
	public int countPrintNumber(int[] a)// count the prime number in the array..(A7) 
	{
	    	int count=0;
	       for(int i=0;i<a.length;i++)
	           {
	    	   if(isPrime(a[i]))
	    		   count++;
	    	   }
	       return count;
	}
	
	void replaceBy10No(int a[])//A8
	{
		if(a.length%2==0)
		{
			for(int i=0;i<a.length;i++)
			{
				a[i]=0;
			}
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				a[i]=1;
			}
		}
	}
	
  void replaceByOneOrZeroNo(int a[])
 {
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=a.length%2;
	 }
 }

public void doubleValue(int[] a) 
{
    for(int i=0;i<a.length;i++)
    {
    	a[i]=2*a[i];
    System.out.print(a[i]+" ");
    }
}




public int countSpecifiedElement(int[] arr, int element) 
{
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]==element)
    	{
    		count++;
    	}
    	 
    }
     System.out.println("No of the specified element.");
    return count;
}

public int[] reverse(int[] a) 
{
 for(int i=0;i<=a.length/2;i++)
 {
	 if(i<=a.length/2-1)
		 System.out.println("a["+i+"]:"+a[i]);
	 System.out.println("i="+i);
	 System.out.println("length-1 is"+(a.length-1));
	 int t=a[i];
	 a[i] = a[a.length-i];
	 a[a.length-i]=t;
 }
 
// for(int i=0;i<a.length;i++)
// {
//  System.out.println(a[i]);
// }
 return a;
}

public int[] zigZag(int[] a, int[] b) 
{
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && i<b.length)
		{
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(i<b.length)
		{
			c[k++]=b[j++];
		}
		System.out.println("k:"+k);
//	    	System.out.print(c[k]+" ");
//	    	k++;
		return c;
	   }

public void nThBiggest(int[] a, int n) 
{
	for(int i=0;i<a.length;i++)
	{
		int count =0; 
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>a[i])
				count++;
			if(count==n-1)
				System.out.println(a[i]+" ");
		}
	}
	
	
}


}

 

 
 
 
    


