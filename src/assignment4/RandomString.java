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
    
    public static String nextString(int n){
        Random rand = new Random();
        int num;
        String str = new String();
        
        if (n > 0){
        num = rand.nextInt(50);
        if (num <=25){
            num += 65;
        }else if (num <=50){
            num += 97;
        }
        str += ""+(char)num;
        for (int i = 1; i < n; i++){
            num = rand.nextInt(60);
            if (num <=25){
                num += 65;
            }else if (num <=50){
                num += 97;
            }else{
                num += 48;
            }
            str += ""+(char)num;
        }
        
        }
        return str;
    }
}
