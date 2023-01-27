public class Verbose{
   static boolean verbose = false;

   public static int foo(int a, int b){
      int z=0;
      if(verbose){ System.out.println("foo(" + a + "," + b + ")"); }
      if(verbose){ System.out.println("a=" + a + " , b=" + b + " , z=" + z); }
      while(a<b){
         z += a+b;
         a += 2*a;
         b += b/2;
         if(verbose){ System.out.println("a=" + a + " , b=" + b + " , z=" + z);}

      }
      if(verbose){ System.out.println("a=" + a + " , b=" + b + " , z=" + z);}
      
      return z;


   }


   public static void main(String[] args){
      if(args.length > 0){
         if(args[0].toLowerCase().charAt(0) == 'v'){
            verbose = true;
         }
      }
      foo(5,49);
     
      /*
      int size = 2000000
      StringBuilder s = new StringBuilder("");
      for(int i=0; i<size; i+=1){
         s.append("qqqq");
      }
      */

   }
}