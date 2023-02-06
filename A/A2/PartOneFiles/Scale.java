/** The Scale class provides class attributes (constants) to be 
 *  used for temperature scales. This is used to ensure 
 *  that no spelling mistakes can happen when dealing 
 *  with the scale names. 
 */

public class Scale{
    public static final String CELSIUS = new String("CELSIUS");
    public static final String FAHRENHEIT = new String("FAHRENHEIT");
    public static final String KELVIN = new String("KELVIN");
    public static final String NONE = new String("NONE");

    // do not use the Q string!
    // it is here to simply have "some" scale provided
    // in the Temperature.java skeleton code so that it compile
    // without using any of the above strings
    public static final String Q = new String("Q");

    // this private constructor prevents the creation
    // of Scale objects. There is no use for a Scale object. 
    private Scale(){}
}
