/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demonstration;

/**
 *
 * @author SP_WN
 */
class A{
    public static int[] reverse(int[] list){ 
	int[] result = new int[list.length]; 
	for(int i =0, j = result.length -1; i < list.length; i++, j--){ 
	result[j]= list[i]; 
	} 
return result;
 }

}
public class Demonstration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        A objA = new A();
        int[] reversedList = objA.reverse(list);
        
        for(int i = 0; i< reversedList.length; i++){
            System.out.print(reversedList[i] + ", ");
        }
    }
    
}
