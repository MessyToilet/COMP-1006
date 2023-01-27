public class PartTwo{

   public static int numberOfDivisors(int n){
      // returns the number of positive divisors of n 

      // change this code...
      return 0;
   }

   public static boolean isPrime(int n){
      // return true if n is prime
      // return false is n is not prime

      // change this code....
      if(n % 2 == 0){
         return true;
      }
      return false;
   }

   public static void main(String[] args){
      int n = 30;
      int expect = 8; 
      int actual = numberOfDivisors(n);
      System.out.println("testing numberOfDivisors(" + n + ") : " + (expect == actual));   


      n = 7;
      boolean want = true;  
      System.out.println("testing isPrime(" + n + ") : " + (want == isPrime(n)));   
      n = 8;
      want= false; 
      System.out.println("testing isPrime(" + n + ") : " + (want == isPrime(n)));   
      

   }
}