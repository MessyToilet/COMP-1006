/* Introduction to Computer Science II */
/* Tutorial #1                         */

import java.util.Scanner; // used for keyboard input

public class PrintQs{

 /* the main method is the "program"              */
 /* this is what is executed when we run the code */
 public static void main(String[] args){
  
  /* System.in is the standard input stream; the keyboard */
  Scanner keyboard = new Scanner(System.in);
  
  String input = null;
  int    size  = 0;

  System.out.print("enter a number (integer) : ");
  if( keyboard.hasNextInt() == true){
    // the next input was an integer so proceed
    size = keyboard.nextInt();
  }else{
    // input was not an integer so store it in a string variable
    input = keyboard.next();
    System.out.println("you entered  \"" + input + "\", which is not an integer. Try again.");
    return; // exit program
  }

  System.out.println("you entered the number " + size + " (yea!)");
  
  //
  // proceed to draw the images as requested in the tutorial now...
  //
  
  
 }
 
}