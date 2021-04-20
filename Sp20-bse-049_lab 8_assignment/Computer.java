/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

/**
 *
 * @author farhan aheer
 */
public class Computer {
    protected int wordsize;
    protected int storagesize;
    protected int memorysize;
    protected int speed;

    public Computer() {
        this.wordsize = 30;
        this.storagesize = 250;
        this.memorysize = 500;
        this.speed = 30;
    }
    public void Display(){
        System.out.println("wordsize is " +wordsize+" bits" +" storagesize is " +storagesize+" megabytes"+" memorysize is "+memorysize+" megabytes"+" and speed is " +speed+" megahertz");
    }
    
    
}
class Laptop extends Computer {
    private int length;
    private int width;
    private int height;
     private int weight;

    public Laptop() {
        super();
        this.length = 4;
        this.width = 5;
        this.height = 7;
        this.weight = 3;
    }
    public void Display(){
        super.Display();
        System.out.println("Laptop having length "+length+"inches, width "+width+"inches, heigth "+height+"inches and weigth is " +weight+"KG's");
    }
     
}
