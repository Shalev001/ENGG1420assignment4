/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

/**
 *
 * @author shale
 */
public class Methods {
    
    /**
     * a method to summirise a string
     * 
     * @param str the string to be summirised
     * @return returns the summirised string
     */
    public static String strsum(String str){
        
        // creating a temparary string in order to not change the original input
        String temp = new String();
        int num;
        
        for (int i = 0; i < str.length(); i++){//for every charecter in the string
            num = 1;
            while ((i+1) < str.length() && str.charAt(i) == str.charAt(i+1)){ // while the current and next charecters match, loop
                num++;// incramenting number to keep track of how many times the letter repeats
                i++;// incramenting index to insure that duplacate letters are not printed multiple times
            }
            
            temp += ""+str.charAt(i);//concatinate current charecter to temp
            if (num != 1){//if the charecter repeats, print how many times it does so
                 temp += num;
            }
        }
        return temp; //returns the temperary string
    }
    
    /**
     * a function to check if a string is contained within another string
     * 
     * @param str1 the main string
     * @param str2 the sting that is being checked for (should be smaller
     * @return if str1 contains str2
     */
    public static boolean contains(String str1,String str2){
        
        boolean tracker;
        
        for (int i = 0; i < str1.length() - str2.length()+1; i++){// for every charecter in the string that may be the first charecter in str2
            tracker = true;
            for (int j = 0; j < str2.length();j++){//runs through the charecters in str1 starting at [i] and checks if the all of the charecters match
                if (str1.charAt(i+j) != str2.charAt(j)){// if a single charecter does not match, set tracker to false
                    tracker = false;
                }
            }
            if (tracker){// if all characters match, return true
                return true;
            }
        }
        return false;//else return false
    }
}
