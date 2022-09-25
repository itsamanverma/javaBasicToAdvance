package com.matrix.aman;

public class InverseMatrix 
{
   public static void main(String[] args) 
   {
	 MatrixOperation mo= new MatrixOperation();
	 System.out.println("Read the  Matrix");
	 int a[][]=mo.readMat();
	 System.out.println("Enter the Elements of matrix");
	 mo.dispmat(a);
	 
	int inv[][]=mo.inverse(a);
	for(int i=0;i<inv.length;i++)
	{
		for(int j=0;j<inv[i].length;j++)
		{
			System.out.print(inv[i][j]+"  ");
		}
	}
	
	int nm[][]= mo.transpose(a);
	for(int i=0;i<nm.length;i++)
	{
		for(int j=0;j<nm[i].length;j++)
		{
			System.out.print(nm[i][j]+"  ");
		}
		System.out.println();
	}
   }
}
