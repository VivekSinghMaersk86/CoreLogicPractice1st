package com.vivek.MatrixArray;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//Java Code to sort 2D Matrix according to any Column

public class Sort2DMatrixbycolumnNo {
	// Function to sort by column 
    public static void sortbyColumn(int arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        });  // End of function call sort(). 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int matrix[][] = { { 39, 27, 11, 42 }, 
                           { 10, 93, 91, 90 }, 
                           { 54, 78, 56, 89 }, 
                           { 24, 64, 20, 65 } }; 
        // Sort this matrix by 3rd Column 
        System.out.println("Please Enter required Column no for 2D Matrix Sorting:- ");
        Scanner scan=new Scanner(System.in);
        int col = scan.nextInt(); 
        sortbyColumn(matrix, col - 1); 
  
        // Display the sorted Matrix 
        System.out.println("sorted 2D Matrix according to given Column:- ");
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) 
                System.out.print(matrix[i][j] + " "); 
            System.out.println(); 
        } 
    } 
}