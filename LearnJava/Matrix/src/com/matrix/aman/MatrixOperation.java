package com.matrix.aman;

import java.util.Scanner;

public class MatrixOperation 
{
	int[][] readMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row And  Column");
		int rows =sc.nextInt();
		int cols =sc.nextInt();
		int mat[][]= new int[rows][cols];
		System.out.println("Enter "+rows*cols+" elements rows views");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	public void dispmat(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public int[][] transpose(int[][] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a[i].length;j++)
			{
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		return a;
	}
	public int[][] inverse(int[][] a) 
	{
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=0;j<a[i].length;j++)
		   {
			   a[0][0]=(a[1][1]*a[2][2]-a[1][2]*a[2][1]);//inverse matrix  1st elements row1.
			   
			   a[0][1]=-1*(a[1][0]*a[2][2]-a[2][0]*a[1][2]);// second element 2nd elements of row1.
			   
			   a[0][2]=(a[1][0]*a[2][1]-a[2][0]*a[1][1]);//third element of row1
			   
			   a[1][0]=-1*(a[0][1]*a[2][2]-a[2][1]*a[0][2]);//1st elements of row2
			   
			   a[1][1]=(a[0][0]*a[2][2]-a[2][0]*a[0][2]);//2nd element row2
			   
			   a[1][2]=-1*(a[0][0]*a[2][1]-a[2][0]*a[0][1]);//3th element of row2
			   
			   a[2][0]=(a[0][1]*a[1][2]-a[1][1]*a[0][2]);//1th element of row3
			   
			   a[2][1]=-1*(a[0][0]*a[1][2]-a[1][0]*a[0][2]);//2nd element of row3
			   
			   a[2][2]= a[2][2]*(a[0][0]*a[1][1]-a[1][0]*a[0][1]);//3rd element of row3
		   }
	   }
	return a;
		
	}
}
