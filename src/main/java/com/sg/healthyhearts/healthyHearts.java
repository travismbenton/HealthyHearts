/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.healthyhearts;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author travi
 */
public class healthyHearts {
    public static void main(String[] args) {
        //-- Declare Variables --
        int age;
        float maxHRate, targetHR1, targetHR2;                
        //DecimalFormat format = new DecimalFormat("0.#");
        
        //-- Scanner Section --
        Scanner sc = new Scanner(System.in);
  
        //-- User Experience --
        System.out.print("What is your age? ");
        age = sc.nextInt();
        
        //-- End Scanner Section --
        
        //-- Calculations --
        maxHRate = 220 - age;
        targetHR1 = maxHRate * .50f;
        targetHR2 = maxHRate * .85f;
        int a = (int) Math.ceil(targetHR1);
        int b = (int) Math.ceil(targetHR2);
        
        
        // -- Final Printout --
        //System.out.println("Here are the calculations for the age: "+ age);
        System.out.println("Your maximum heart rate should be "+ maxHRate +" beats per minute");
        System.out.println("Your target HR Zone is "+ a +" - "+ b +" "
                + "beats per minute");
        
    }
}
