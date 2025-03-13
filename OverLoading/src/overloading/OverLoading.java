/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

import static java.lang.Integer.parseInt;

/**
 *
 * @author SP_WN
 */
public class OverLoading {

   
    public static void main(String[] args) {
       int a = 2, b = 3;
       float a1 = 0.2f,  b1 = 0.3f;
       
       String abc = "123";
       int Abc = parseInt(abc);
       System.out.println(Abc);
       
       int resultInt = add(a, b);
       float resultFloat = add(a1, b1);
       
       System.out.println("Int addition: " + resultInt);
       System.out.println("Float addition: " + resultFloat);
    }
    
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    static float add(float a, float b){
        float sum = a + b;
        return sum;
    }
}
