package com.array.aman;
//write the java program to display the no of occurance 
public class A15 
{
   public static void main(String[] args)
   {
	   int ar[]= {23,45,23,56,78,56,56,23,17,19};
	   
          //ar[]= {23,45,23,23,56,78,56,56,23,17,19};//
	     //ar[]= {23,45,23,56,78,56,56,23,17,19};
	   
	   for(int i=0;i<ar.length;i++) 
	   {
		int count=1;
		for(int j=i+1;j<ar.length;j++)
		{
		  if(ar[i]==ar[j])
		  {
			  count++;
			  ar=ardeleteArr(ar,j);
			  j--;
		  }
		}
	   }
   }
   static int[] ardeleteArr(int a[], int in)
   {
	   
   }
}
