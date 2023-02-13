/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author shale
 */
public class Circle {
    
    private int radius;
    
    /**
     * constructor containing the radius attribute
     * @param radius 
     */
    public Circle(int radius){
        this.radius = radius;
    }
    // setter ang getter for radius
    public int getRadius(){
        return radius;
    }
    
    public void setRadius(int n){
        radius = n;
    }
    
    /**
     * a method to add the radius of a circle to the current one
     * 
     * @param circ the circle with the radius to be added
     */
    public void add(Circle circ){
        radius += circ.getRadius();
    }
    
    /**
     * a method to add the radieye of all the circles in an array
     * 
     * @param circs an array containing circles with radieye to add
     */
    public void addAll(Circle[] circs){
        for (int i = 0; i < circs.length; i++) {// for every element in the array add the radius
            radius += circs[i].getRadius();
        }
    }
    
    /**
     * a method to decompose a circle
     * 
     * @return returns an array containing the decomposed elements of the circle
     */
    public Circle[] decompose(){
        Circle temp = new Circle(radius); 
        int num = 0;
        int i = 1;
        while (temp.getRadius() != 1){// an initial loop to count how many elements the array of circles needs
            i++;// incrament i until it the original raduis is divisible by i
            if (temp.getRadius() % i == 0){
                temp.setRadius(temp.getRadius()/i);
                num++;
                i = 1;
            }
        }
        temp.setRadius(radius);
        Circle[] circs = new Circle[num];
        num = 0;
        i = 1;
        while (temp.getRadius() != 1){// same loop as before but this time entering the values into the circs array
            i++;
            if (temp.getRadius() % i == 0){
                temp.setRadius(temp.getRadius()/i);
                circs[num] = new Circle(i);
                num++;// this time num keeps track of the current index
                i = 1;
            }
        }
        return circs;// return the populated array
    }
    
    public static void main(String[] args) {// main contianing the operations asked for in the assignment(not run by default, must right click and press run file)
        Circle[] circs = new Circle[100];
        
        for (int i = 0; i < circs.length; i++) {
            circs[i] = new Circle(i);
        }
        
        Random rand = new Random();
        
        Circle C = new Circle(rand.nextInt(10,1000));
        
        C.addAll(circs);
        
        C = new Circle(120);
        
        circs = C.decompose();
        
        for (int i = 0; i < circs.length; i++) {
            System.out.print(circs[i].getRadius() + " ");
        }
        System.out.println("");
    }
}
