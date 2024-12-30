package partA.activity;

import java.util.Scanner;

public class Activity01_ExplicitImport {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //must use sc when referring to string name
    System.out.println("Hello user, please enter your first name!"); //output of something
    String name= sc.next(); //user must input words, therefore used string
    System.out.println("Using the scanner, I was able to store your name. I see your name is " + name + "."); //outputs what the user inputted and a string of text
}
}


//when import statement is not present, the result is that the program cannot find the symbol class Scanner