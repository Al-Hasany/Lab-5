

package com.mycompany.controlflowlab;
import java.util.Scanner;


public class ControlFlowLab {

    public static void main(String[] args) {
       
      
        // Excercise 1
        System.out.print("Please enter an integer: ");
        Scanner in2 = new Scanner(System.in);
        int inputInt;
        inputInt = in2.nextInt();
        if (inputInt < 10 && inputInt > 0) System.out.println("This is a single digit positive integer");
        if (inputInt >= 10) System.out.println("This is a multi-digit positive integer");
        if (inputInt < 0 && (inputInt % 5 == 0)) System.out.println("This is a negative integer that is divisable by five");
        else if (inputInt < 0) System.out.println("This is a negative integer that is not divisable by five");
        if (inputInt == 0) System.out.println("This integer is zero");
      
        // Excercise 2
        Scanner in3 = new Scanner(System.in);
        System.out.print("Enter an integer for the day of the week: ");
        int day;
        day = in3.nextInt();
        
        switch(day){
            case 1: System.out.println("Monday:\tWeekday"); break;
            case 2: System.out.println("Teusday:\tWeekday"); break;
            case 3: System.out.println("Wednesday:\tWeekday"); break;
            case 4: System.out.println("Thursday:\tWeekday"); break;
            case 5: System.out.println("Firday:\tWeekday"); break;
            case 6: System.out.println("Saturday\tWeekend day"); break;
            case 7: System.out.println("Sunday\tWeekend day"); break;
            default: System.out.println("Invalid day!"); break;
        }
        
        
       
    }
}
