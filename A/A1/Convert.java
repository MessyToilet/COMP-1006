public class Convert{
   public static double convert(String temperature, char scale){
      // converts a temperature (value/scale) to a new scale
      double working_num = Double.parseDouble(temperature.replace("C", ""));
      if (temperature.charAt(temperature.length()-1) == scale) {
         return(working_num);
      }
      if (scale == 'F') {
         return((working_num * 9.0 / 5.0) + 32.0);
      }
      else {
         return((working_num - 32.0) * (5.0 / 9.0));
      } 
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