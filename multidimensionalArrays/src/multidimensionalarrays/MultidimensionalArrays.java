/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

/**
 *
 * @author SP_WN
 */
import java.util.Scanner;

public class MultidimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][3];
        
        for(int row = 0; row < nums.length; row++){
            for( int column = 0; column < nums[row].length; column++){
                System.out.println("enter value" + (column + 1) + " of row" + (row + 1));
                nums[row][column] = input.nextInt();
            }
        }
        
         for(int row = 0; row < nums.length; row++){
            for( int column = 0; column < nums[row].length; column++){
                System.out.print(nums[row][column]);
            }
            System.out.println();
        }
    }
    
}
