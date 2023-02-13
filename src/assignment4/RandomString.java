/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

import java.util.Random;

/**
 *
 * @author shale
 */
public class RandomString {
    
    /**
     * returns a string containing random characters of a given length
     * 
     * @param n the length of the randome string
     * @return a random string of length n
     */
    public static String nextString(int n){
        Random rand = new Random();
        int num;
        String str = new String();
        
        if (n > 0){
        num = rand.nextInt(50);// setting the first charecter so that it cannot be a number
        if (num <=25){// manipulating the values to match the appropriate ascii codes
            num += 65;
        }else if (num <=50){
            num += 97;
        }
        str += ""+(char)num;// concatonating the random ascii charecter to the new string
        for (int i = 1; i < n; i++){// setting the rest of the charecters so that it can be a number
            num = rand.nextInt(60);
            if (num <=25){// manipulating the values to match the appropriate ascii codes
                num += 65;
            }else if (num <=50){
                num += 97;
            }else{
                num += 48;
            }
            str += ""+(char)num;// concatonating the random ascii charecter to the new string
        }
        
        }
        return str;//returning the string with
    }
}
