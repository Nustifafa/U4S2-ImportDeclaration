package partA.example; //package with classes for basic GUI elements and graphics

import java.util.Scanner; //to use the Scanner class to read a keyboard input, the qualified name for the scanner class is java.util.Scanner, defined in the java.util package
//you can avoid the fully qualified class name by using the import statement
//package is java.util, class is Scanner, this is importing a single class
public class Example01_ExplicitImport { //beginning of class definition
    public static void main(String[] args) { //domain
        Scanner sc = new Scanner(System.in); //using an input of something
        System.out.println("Hello user, please enter a number."); //output of something
        int numEntered = sc.nextInt(); //user must input a number
        System.out.println("You entered " + numEntered); //outputs what the user inputted and a string of text
    } //end method main
} //end class Example01_ExplicitImport
