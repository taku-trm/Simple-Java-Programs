/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions;

/**
 *
 * @author SP_WN
 */

class A{
       void ageCheck(int age){
           try{
            if( age < 18){
                throw new ArithmeticException("Access denied");
            }
            else{
                System.out.println("Access granted");
            }
           }catch(ArithmeticException e){
               System.out.println(e.getMessage());
           }
    }
}
public class ExcepTions {

    public static void main(String[] args) {
        A objA = new A();
        objA.ageCheck(15);
    }
    
}
