/* Introduction to Computer Science II */
/* Tutorial #2                         */

public class Tutorial2{

   /* returns a new array of length (end-start+1) consisting
      of the numbers start, start+1, start+2, ..., end

      precondition: end >= start
      Example:
      makeList(2,4) -> [2,3,4]
      makeList(-1,5) -> [-1,0,1,2,3,4,5]
      makeList(3,3) -> [3]
   */
   public static int[] makeList(int start, int end){
      return new int[]{};

   }
 
   /* takes an array of integers and returns an array of arrays
      of integers. Each integer in the input is replaced with an array
      of number (using the makeList method above) start from 0.
      All data values are non-negative.
      Example:
      arrayPlot( new int[]{1,3,5,0,3}) will return the array
       [ [0,1], [0,1,2,3], [0,1,2,3,4,5], [0], [0,1,2,3] ]
    */
   public static int[][] makePlot(int[] data){
      return new int[][]{};
   }


   /* takes an array of integers and returns an array of arrays
      of those integers except for zeros. 
      Each integer in the input is replaced with an array
      of numbers (using the makeList method above) starting from 0.
      All data values are non-negative.
      Example:
      arrayPlot( new int[]{0,0,1,3,5,0,3}) will return the array
       [ [0,1], [0,1,2,3], [0,1,2,3,4,5], [0,1,2,3] ]
    */
    public static int[][] makePlotWithoutZeros(int[] data){
      return new int[][]{};
   }


   public static boolean same(int[] a, int[] b){
      if(a.length != b.length){ return false;}
      for(int i=0; i<a.length; i+=1){
         if(a[i] != b[i]){
            return false;
         }
      }
      return true; // they are the same if we get to here!
   }
   public static boolean samesame(int[][] a, int[][] b){
      if(a.length != b.length){ return false;}
      for(int i=0; i<a.length; i+=1){
         if(!same(a[i], b[i])){
            return false;
         }
      }
      return true; // they are the same if we get to here!
   }

   public static void main(String[] args){
      int[] test1 = makeList(2,4); //  [2,3,4]
      int[] test2 = makeList(-1,5);       //  [-1,0,1,2,3,4,5]
      int[] test3 = makeList(3,3); // [3]

      System.out.println("--makeList--");
      if( same(test1, new int[]{2,3,4})){
         System.out.println("test1 is correct");
      }else{
         System.out.println("test1 failed");
         System.out.println("  expecting : " + java.util.Arrays.toString(new int[]{2,3,4}));
         System.out.println("  got       : " + java.util.Arrays.toString(test1));
      }

      if( same(test2, new int[]{-1,0,1,2,3,4,5})){
         System.out.println("test2 is correct");
      }else{
         System.out.println("test2 failed");
         System.out.println("  expecting : " + java.util.Arrays.toString(new int[]{-1,0,1,2,3,4,5}));
         System.out.println("  got       : " + java.util.Arrays.toString(test2));
      }
      if( same(test3, new int[]{3})){
         System.out.println("test3 is correct");
      }else{
         System.out.println("test3 failed");
         System.out.println("  expecting : " + java.util.Arrays.toString(new int[]{3}));
         System.out.println("  got       : " + java.util.Arrays.toString(test3));
      }

      System.out.println("--makePlot--");
      int[][] test4 = makePlot(new int[]{2,3,4}); // [ [0,1,2], [0,1,2,3], [0,1,2,3,4] ]
      if( samesame(test4, new int[][]{ {0,1,2}, {0,1,2,3}, {0,1,2,3,4}} ) ){
         System.out.println("test4 is correct");
      }else{
         System.out.println("test4 failed");
         System.out.println("  expecting : " + java.util.Arrays.deepToString(new int[][]{ {0,1,2}, {0,1,2,3}, {0,1,2,3,4}}));
         System.out.println("  got       : " + java.util.Arrays.deepToString(test4));
      }

      System.out.println("--makePlotWithoutZeros--");
      int[][] test5 = makePlotWithoutZeros(new int[]{2,0,4,0}); // [ [0,1,2], [0,1,2,3,4] ]
      if( samesame(test5, new int[][]{ {0,1,2}, {0,1,2,3,4}} ) ){
         System.out.println("test5 is correct");
      }else{
         System.out.println("test5 failed");
         System.out.println("  expecting : " + java.util.Arrays.deepToString(new int[][]{ {0,1,2},{0,1,2,3,4}}));
         System.out.println("  got       : " + java.util.Arrays.deepToString(test5));
      }

      int[][] test6 = makePlotWithoutZeros(new int[]{0,0,0,0,0,0,0}); // [ [0,1,2], [0,1,2,3,4] ]
      if( samesame(test6, new int[][]{} ) ){
         System.out.println("test6 is correct");
      }else{
         System.out.println("test6 failed");
         System.out.println("  expecting : " + java.util.Arrays.deepToString(new int[][]{} ));
         System.out.println("  got       : " + java.util.Arrays.deepToString(test5));
      }

   }


}