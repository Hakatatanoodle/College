

package com.mycompany.mavenproject3;

import javax.swing.JOptionPane;


public class Mavenproject3 {

    public static void main(String[] args) {
        float wt,ht,bmi;
        wt = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight (in kg) : "));
        ht = Float.parseFloat(JOptionPane.showInputDialog("Enter your height (in meters)"));
        bmi = wt / (ht*ht);
        JOptionPane.showMessageDialog(null,"BMI : "+bmi);
        if(bmi<18.5)
        {
            JOptionPane.showMessageDialog(null, "You are serverly underweight bro,eat some food!");
        }
        else if(bmi >18.5 && bmi < 24.9)
        {
            JOptionPane.showMessageDialog(null, "You are normal weight bro,good job!");
        }
        else if(bmi >24.9 && bmi < 29.9)
        {
            JOptionPane.showMessageDialog(null, "You are fat and over weight , go run !");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You fat obese bitch  !");
        }

    }                                                   
}
