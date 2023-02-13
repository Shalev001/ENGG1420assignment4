/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shale
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //demonstrating functionality of methods
        System.out.println("q1:");
        String str = "aabtttt"; 
        System.out.println(Methods.strsum(str));
        
        System.out.println("q2:");
        System.out.println(RandomString.nextString(5));
        
        System.out.println("q3 and q4:");
        Book book = new Book("hello there","me,you,I");
        
        System.out.println(book.getTitleInTitleCase());
        
        System.out.println(book.contains("the"));
        
        System.out.println(book.contains("hi"));
        
        book.printAuthors();
        
        
        System.out.println("q5:");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("please enter a list of emails separated by semicolons, commas, or spaces:");
        
        str = scan.nextLine();
        
        int num = 0;
        
        for (int i = 0; i < str.length(); i++) {// running through a loop tocount how many separators are in the entered string
            if (str.charAt(i) == ';' || str.charAt(i) == ','||str.charAt(i) == ' '){
                num ++;
            }
        }
        
        int[] indexes = new int[num];// creating an array to store the indexes of the separators
        
        num = 0;
        
        for (int i = 0; i < str.length(); i++) {// running through the loop again and setting the indexes of the array accordingly
            if (str.charAt(i) == ';' || str.charAt(i) == ','||str.charAt(i) == ' '){
                indexes[num] = i;
                num++;
            }
        }
        
        String []strs = new String[num+1]; 
        
        if (num!=0){// setting the first substring
        strs[0] = str.substring(0,indexes[0]);
        }else{
            strs[0] = str;// if therer is only one entry, the first index is set to the string
        }
        
        
        for (int i = 0; i < indexes.length-1; i++) {// going through and assigning the separated entries into diffrent indexes
            strs[i+1] = str.substring(indexes[i]+1,indexes[i+1]);
        }
        
        if (num != 0){//if there is more than one entry, this sets the last substring
        strs[num] = str.substring(indexes[num-1]+1,str.length());
        }
        //declairing variables to count the occurences of '_' and "@gmail.com"
        int underscoreNum = 0;
        int gmailNum = 0;
        
        for (int i = 0; i < strs.length; i++) {//using the contains method to check if each entry contains '_' or "@gmail.com"
            if (Methods.contains(strs[i], "_")){
                underscoreNum++;
            }
            if (Methods.contains(strs[i], "@gmail.com")){
                gmailNum++;
            }
        }
        
        //printing out the result
        System.out.println("in the entered list " + underscoreNum + " entries containd an underscore and " + gmailNum + " entries were assosiated with gmail");
        
        
    }
    
}
