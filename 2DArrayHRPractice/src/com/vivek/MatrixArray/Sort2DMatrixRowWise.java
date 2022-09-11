package com.vivek.MatrixArray;

import java.util.Arrays;

public class Sort2DMatrixRowWise {
	static int sortRowWise(int m[][]) 
    { 
        // One by one sort individual rows. 
        for (int i = 0; i < m.length; i++) 
            Arrays.sort(m[i]); 
  
        // printing the sorted matrix 
        System.out.println("Row wise sorting using java API:- ");
        for (int i = 0; i < m.length; i++) { 
            for (int j = 0; j < m[i].length; j++) 
                System.out.print(m[i][j] + " "); 
            System.out.println(); 
        } 
  
        return 0; 
    } 
  
    // driver code 
    public static void main(String args[]) 
    { 
        int m[][] = { { 9, 8, 7, 1 }, 
                      { 7, 3, 0, 2 }, 
                      { 9, 5, 3, 2 }, 
                      { 6, 3, 1, 2 } }; 
  
        sortRowWise(m); 
    } 
}
