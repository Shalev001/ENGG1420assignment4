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
    
    /**
     * a constructor containing all parameters in the class
     * 
     * @param title
     * @param author
     * @param pages
     * @param year
     * @param price 
     */
    public Book(String title,String author,int pages,int year,float price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }
    
    /**
     * a constructor with the title parameter
     * 
     * @param title 
     */
    public Book(String title){
        this.title = title;
        author = "";
        pages = 0;
        year = 0;
        price = 0;
    }
    
    /**
     * a constructor with the title and author parameters
     * 
     * @param title
     * @param author 
     */
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    //setter and getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }
    
    /**
     * a method that returns the title in title case
     * 
     * @return retuns title in case
     */
    public String getTitleInTitleCase(){
        String temp = new String();
        
        if(title.charAt(0) >= 97 && title.charAt(0) <= 122){// if the first charecter is lower case, make it upper
            temp += ""+(char)(title.charAt(0)-32);// concatinate to temp
        }else{
            temp += ""+(char)(title.charAt(0));
        }
        
        for (int i = 1; i < title.length(); i++){//for every charecter after the first
            if (title.charAt(i-1) == ' ' && title.charAt(i) != ' '){//if the previos charecter was a space
                if(title.charAt(i) >= 97 && title.charAt(i) <= 122){//if the charecter is lower case, make it upper
                    temp += ""+(char)(title.charAt(i)-32);
                }else{
                    temp += ""+(char)(title.charAt(i));
                }
                
            }else if (title.charAt(i) != ' '){//if the previos charecter was not a space
                if(title.charAt(i) >= 65 && title.charAt(i) <= 90){// the charecter is upper case, make it lower
                    temp += ""+(char)(title.charAt(i)+32);
                }else{
                    temp += ""+(char)(title.charAt(i));
                }
            }else{
                temp += ""+(char)title.charAt(i);
            }
        }
        return temp;// return the sting in title case
    }
    
    /**
     * a method to check if a string is contained within the title
     * (same code as the one in the methods class but using the title parameter as Str1)
     * 
     * @param str a string to check if it is contained within the title
     * @return if the string is contained in the title
     */
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
    
    /**
     * a method to print the authors of the book in separate lines
     */
    public void printAuthors(){
        String temp = new String();
        
        for (int i = 0; i < author.length(); i++){// for every charecter
            if (author.charAt(i) != ','){//if the charecter is not a comma, concatinate it into temp
                temp += ""+(char)author.charAt(i);
            }else{// else, concatinate a new line to temp
                temp += '\n';
            }
        }
        
        System.out.println(temp);// print temp
    }
}
