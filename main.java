package com.mycompany.controlflowlab;
import java.util.Scanner;


public class ControlFlowLab {

    public static void main(String[] args) {
        // Step 1
        int age;
        // Step 2
        Scanner in = new Scanner(System.in);
        
        age = in.nextInt();
        if (age >= 18){
            if (age < 30) System.out.println("You are a young adult.");
            else System.out.println("You are an adult");
        } else System.out.println("You are under 18 years old.");
        // Step 3
        boolean isSunny = true;
        boolean isRainy = false;
        boolean isWarm = false;
        
        if (isRainy && !(isWarm)){
            System.out.println("It is cold and rainy.");
        } else if (isWarm && isSunny){
            System.out.println("It is warm and sunny");
        } else {
            System.out.println("The weather conditions are as expected");
        }
        
        
        // Step 4
        char grade = 'F';
        switch(grade){
            case 'a':
            case 'A': System.out.println("Excellent!"); break;
            case 'b':
            case 'B': System.out.println("Good!"); break;
            case 'c':
            case 'C': System.out.println("Average"); break;
            case 'd':
            case 'D': System.out.println("Below Average"); break;
            case 'f':
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid Grade!"); break;
        }

       
    }
}
