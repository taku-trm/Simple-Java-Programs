/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author SP_WN
 */
interface Communicate{
    public void talk();
    public void emote();
}

class Navigate{
    public void walk(){
        System.out.println("I can walk around");
    }
}
        
public class Inheritance extends Navigate implements Communicate{

    /**
     * @param args the command line arguments
     */
    @Override
    public void talk(){
        System.out.println("I can talk");
    }
    @Override
    public void emote(){
        System.out.println("I am nodding my head to show i agree");
    }
        
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        
        obj.talk();
        obj.emote();
        obj.walk();
    }
    
}
