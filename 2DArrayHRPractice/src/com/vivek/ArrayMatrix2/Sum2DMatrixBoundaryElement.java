package com.vivek.ArrayMatrix2;
import java.util.Scanner;
//Java Program to print the sum of boundary elements of a matrix
public class Sum2DMatrixBoundaryElement {
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in); 
    	int m, n, sum = 0, row1 = 0, col_n = 0, diag = 0;
        System.out.print("\n Enter number of rows/columns in matrix :-  ");
        m = sc.nextInt();
        n = sc.nextInt();
        int i, j;
        int[][] mat = new int[m][n];
        System.out.print("\n Input the matrix elements \n");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        System.out.print("\n Boundary Matrix \n");
        
        for(i = 0; i < m; i++){
        for(j = 0; j < n; j++){
        if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
          System.out.print(mat[i][j] + " ");
          sum = sum + mat[i][j];
          
          }else
                    System.out.print(" ");
        }
            System.out.print("\n");
        }
        System.out.print("\n Sum of boundary is " + sum);
    }}

/*Algorithm to print the sum of boundary elements of a matrix
Input the order of the matrix.
Input the matrix elements.
Print all the boundary elements of the matrix.
Find the sum of the boundary elements.
Print sum.*/