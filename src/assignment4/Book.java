/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

/**
 *
 * @author shale
 */
public class Book {
    String title;
    String author;
    int pages;
    int year;
    float price;
    
    public Book(String title,String author,int pages,int year,float price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }
    public Book(String title){
        this.title = title;
    }
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    
    public String getTitleInTitleCase(){
        String temp = new String();
        if(title.charAt(0) >= 97 && title.charAt(0) <= 122){
            temp += ""+(char)(title.charAt(0)-32);
        }else{
            temp += ""+(char)(title.charAt(0));
        }
        for (int i = 1; i < title.length(); i++){
            if (title.charAt(i-1) == ' ' && title.charAt(i) != ' '){
                if(title.charAt(i) >= 97 && title.charAt(i) <= 122){
                    temp += ""+(char)(title.charAt(i)-32);
                }else{
                    temp += ""+(char)(title.charAt(i));
                }
                
            }else if (title.charAt(i) != ' '){
                if(title.charAt(i) >= 65 && title.charAt(i) <= 90){
                    temp += ""+(char)(title.charAt(i)+32);
                }else{
                    temp += ""+(char)(title.charAt(i));
                }
            }else{
                System.out.println("hi");
                temp += ""+(char)title.charAt(i);
            }
        }
        return temp;
    }
    
    public boolean contains(String str){
        
        boolean tracker;
        
        for (int i = 0; i < title.length() - str.length(); i++){
            tracker = true;
            for (int j = 0; j < str.length();j++){
                if (title.charAt(i+j) != str.charAt(j)){
                    tracker = false;
                }
            }
            if (tracker){
                return true;
            }
        }
        return false;
    }
    
    public void printAuthors(){
        String temp = new String();
        
        for (int i = 0; i < author.length(); i++){
            if (author.charAt(i) != ','){
                temp += ""+(char)author.charAt(i);
            }else{
                temp += '\n';
            }
        }
        
        System.out.println(temp);
    }
}
