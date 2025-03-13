/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author SP_WN
 */
class A{
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7,};
        A objA = new A();
        objA.printArray(nums);
        
        /*int[] ages = {28, 22, 27, 20, 30, 40, 19, 59, 11};
        
        int[] result = Arrays.reverseArray(ages);
        
        for( int i : result){
            System.out.println(i);
        }*/
        /*double sum = 0, avg;
        int length = ages.length;
        
        for(int age : ages){
            sum += age;
        }
        
        avg = sum / length;
        
        System.out.println("The sum of ages is: " + sum);
        System.out.println("The average of ages is " + avg);
        */
        
       
    }
    
    public static int[] reverseArray(int[] ages){
        int[] agesReversed = new int[ages.length];
        
        for(int i = 0; i < ages.length; i++){
           agesReversed[i] = ages[ages.length - 1 - i];
    
       }
       return agesReversed;
    }
    
}
