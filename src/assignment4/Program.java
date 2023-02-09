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
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ';' || str.charAt(i) == ','||str.charAt(i) == ' '){
                num ++;
            }
        }
        
        int[] indexes = new int[num];
        
        num = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ';' || str.charAt(i) == ','||str.charAt(i) == ' '){
                indexes[num] = i;
                num++;
            }
        }
        
        String []strs = new String[num+1]; 
        
        if (num!=0){
        strs[0] = str.substring(0,indexes[0]);
        }else{
            strs[0] = str;
        }
        
        
        for (int i = 0; i < indexes.length-1; i++) {
            strs[i+1] = str.substring(indexes[i]+1,indexes[i+1]);
        }
        
        if (num != 0){
        strs[num] = str.substring(indexes[num-1]+1,str.length());
        }
        int underscoreNum = 0;
        int gmailNum = 0;
        
        for (int i = 0; i < strs.length; i++) {
            if (Methods.contains(strs[i], "_")){
                underscoreNum++;
            }
            if (Methods.contains(strs[i], "@gmail.com")){
                gmailNum++;
            }
        }
        
        System.out.println("in the entered list " + underscoreNum + " entries containd an underscore and " + gmailNum + " entries were assosiated with gmail");
        
        
    }
    
}
