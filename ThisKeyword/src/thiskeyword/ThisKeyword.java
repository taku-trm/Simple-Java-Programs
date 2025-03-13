/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thiskeyword;

/**
 *
 * @author SP_WN
 */
public class ThisKeyword {

    private String name;
    
    public ThisKeyword(String name){
        System.out.println("Age");
        this.name = name;
    }
    
    public static void main(String[] args) {
        new Me();
    } 
}

class Me extends ThisKeyword{
    public Me(){
        System.out.println("Me");
    }
}