/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paper2022;

/**
 *
 * @author SP_WN
 */
public class Paper2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String s = null;
            int len = s.length();
            System.out.println(len);
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
        
        try{
            int a = 23;
            float sum = 5 / 0;
        }catch(ArithmeticException e){
            System.out.println("No no no no");
        }
        
        try{
            Paper2022.age(-1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }
        
        static void age(int age){
            if (age < 1){
                throw new IllegalArgumentException("Age cannot be negative or 0");
            }
        }
}
