/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isprime;

/**
 *
 * @author SP_WN
 */
import java.util.Scanner;
public class IsPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter test value");
        int testValue = input.nextInt();
        
        if ( testValue <= 1){
            System.out.println("number is not prime");
        }
        else{
            for( int i = 2; i< testValue; i++){
                if(testValue% i == 0){
                    System.out.println("number is not prime");
                    
                }else {
                    System.out.println("number is prime");
                    
                }
            }
        }
        
    }
    
}
