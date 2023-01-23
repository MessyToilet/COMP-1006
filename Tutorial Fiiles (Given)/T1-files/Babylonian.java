/* Introduction to Computer Science II */
/* Tutorial 1                          */

// if we want to get user input at any time later
import java.util.Scanner;

public class Babylonian{

  //
  // access    non-access  return  method    (input paramaters with types)
  // modifier  modifier    type    name                   (if any)
  //   
     public    static      double  babylonian(double N, double epsilon){
        // body of method in a block of code wrapped in curly braces { }
        double sqrt = -1.0;
        
        //
        // insert your code here
        //
        
        // this method returns something that is NOT void and so  
        // it must have a return statement (it could have more than one)
        return sqrt;

    }

    public static void main(String[] args){
        double n = 87143.233;
        double epsilon = 0.01;
        double math_sqrt = Math.sqrt(n);
        double babylonian_sqrt = babylonian(n,epsilon);
 
        System.out.println("Babylonian Square Root Computation");
        System.out.println("            n = " + n);
        System.out.println(" Math.sqrt(n) = " + math_sqrt);
        System.out.println("babylonian(n) = " + babylonian_sqrt);

        double difference = Math.abs(math_sqrt-babylonian_sqrt);
        System.out.println(" |difference| = " + Math.abs(math_sqrt-babylonian_sqrt));
        if(difference > 0.0001){
            System.out.println("Yikes, that is not very close to the actual value.");
            System.out.println("You might want to look at your implementation a bit more carefully.");    
        }else if(difference < 0.000001){
            System.out.println("Nice! And now you know how to compute a square root!");
            System.out.println("If you are looking for more fun, try implementing the Bakhshali method.");
                
        }

      
    }

}