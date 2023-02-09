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
    
    
    public static String strsum(String str){
        String temp = new String();
        int num;
        
        for (int i = 0; i < str.length(); i++){
            num = 1;
            while ((i+1) < str.length() && str.charAt(i) == str.charAt(i+1)){
                num++;
                i++;
            }
            temp += ""+str.charAt(i);
            if (num != 1){
                 temp += num;
            }
        }
        return temp; 
    }
    
    public static boolean contains(String str1,String str2){
        
        boolean tracker;
        
        for (int i = 0; i < str1.length() - str2.length()+1; i++){
            tracker = true;
            for (int j = 0; j < str2.length();j++){
                if (str1.charAt(i+j) != str2.charAt(j)){
                    tracker = false;
                }
            }
            if (tracker){
                return true;
            }
        }
        return false;
    }
}
