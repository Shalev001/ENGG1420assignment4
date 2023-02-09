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
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public void setRadius(int n){
        radius = n;
    }
    
    public void add(Circle circ){
        radius += circ.getRadius();
    }
    
    public void addAll(Circle[] circs){
        for (int i = 0; i < circs.length; i++) {
            radius += circs[i].getRadius();
        }
    }
    
    public Circle[] decompose(){
        Circle temp = new Circle(radius); 
        int num = 0;
        int i = 1;
        while (temp.getRadius() != 1){
            i++;
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
        while (temp.getRadius() != 1){
            i++;
            if (temp.getRadius() % i == 0){
                temp.setRadius(temp.getRadius()/i);
                circs[num] = new Circle(i);
                num++;
                i = 1;
            }
        }
        return circs;
    }
    
    public static void main(String[] args) {
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
