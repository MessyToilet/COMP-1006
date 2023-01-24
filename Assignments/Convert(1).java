public class Convert{

 
   public static double convert(String temperature, char scale){
      // converts a temperature (value/scale) to a new scale
      return -1234567.9;
   }


   public static void main(String[] args){
      System.out.println("Testing Convert.convert");
      String in = "10.0C";
      char scale = 'F';
      double expect = 50.0;
      double out = Convert.convert(in, scale);
      System.out.println("convert(\"" + in + "\",\'" + scale + "\')");
      System.out.println("...expect : " + expect);
      System.out.println("...actual : " + out);
      
      in = "10.0C";
      scale = 'C';
      expect = 10.0;
      out = Convert.convert(in, scale);
      System.out.println("convert(\"" + in + "\",\'" + scale + "\')");
      System.out.println("...expect : " + expect);
      System.out.println("...actual : " + out);
      
   }
}