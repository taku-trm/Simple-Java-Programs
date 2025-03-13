/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author SP_WN
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        swap(5,6);
    }
     
    static void swap(int a, int b){
        int first = a;
        int second = b;
        int intermediate;
        intermediate = first;
        first = second;
        second = intermediate;
        
        System.out.println("first value was: "+ a + " and second value was: "+ b );
        System.out.println("new first value: " + first + " new second value: " + second);
    }
}
