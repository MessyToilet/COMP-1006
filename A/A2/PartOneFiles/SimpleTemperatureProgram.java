public class SimpleTemperatureProgram{

   public static void main(String[] args){
      Temperature t = new Temperature(10.1);
      System.out.println(t.getScale());     // displays "CELSIUS"
      System.out.println(t.toString());     // displays "10.1C"
      t.setScale(Scale.FAHRENHEIT);         // change scale
      System.out.println(t.toString());     // displays "50.18F"  (notice it converted the value!)
      System.out.println(t.getScale());     // displays "FAHRENHEIT"
      t = new Temperature(12.25, "KELVIN"); // scale input is not from Scale!
      System.out.println(t.getScale());     // displays "NONE"
      System.out.println(t.toString());     // displays "0.0N"
   }

}