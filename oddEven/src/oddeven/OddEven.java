/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oddeven;

/**
 *
 * @author SP_WN
 */
import java.util.Scanner;

public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        
        if(num % 2 == 0){
            System.out.println("the number"+ num + "is even");
        }
        else{
            System.out.println("the number is odd");
        }
            
    }
    
}
