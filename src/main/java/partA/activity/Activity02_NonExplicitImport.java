package partA.activity;


public class Activity02_NonExplicitImport {
    public static void main( String args[] ) {
        System.out.println("Let's play some craps! Throw the dice!"); //output of something

        // Generate a random number between 1 and 6 (inclusive) for the dice roll
        int number = (int) (Math.random() * 6) + 1;

        System.out.println("You rolled a: " + number);
    }
}


//Math.random() generates a double between 0 and 1. To get a number between 1 and 6, multiply it by 6
// (resulting in a range from 0 to 5) and then add 1 to shift the range to 1 through 6.
//Integer Casting: Since Math.random() returns a double, we cast it to int to get the integer value for the dice roll.