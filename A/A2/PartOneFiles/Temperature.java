// name:
// id:
// course:
// semester:
//
// assignment: 
// comments:

/** A <code>Temperature</code> object models temperature by storing its value (magnitude)
 * and scale. 
 */
public class Temperature{



/** Initializes a <code>Temperature</code> object with given value in Celsius
 *  <p>
 *  If the initial temperature is less than absolute zero (-273.15C)
 *  then the temperature object will be initialized with -273.15C.
 *
 * @param value is the initial temperature in Celsius.
 */
  public Temperature(double value){
  }


/** Initializes a <code>Temperature</code> object with given 
 *  value using the specified scale
 * <p>
 * If the temperature is lower than absolute zero, in the given scale,
 * then set the temperature to absolute zero (in that scale).
 * <p>
 * If the scale is not one of the three specified in the Scale class, 
 * then create the object with value 0.0 and scale <code>Scale.NONE</code>
 * <p>
 * Example: <code>new Temperature(12.3, Scale.KELVIN)</code> will create 
 * a <code>Temperature</code> object with value 12.3 using the
 * Kelvin scale. 
 * 
 * @param value is the initial temperature
 * @param scale is the scale of initial temperature and must a constant
 *        defined in the Scale enum type.
 */
  public Temperature(double value, String scale){
  }





/** A simple getter for the scale of this object. 
 *  <p> 
 *  The output will always be one of the static attributes 
 *  from the <code>Scale</code> class.
 *
 * @return the current scale of this object. 
 */
  public String getScale(){
    return Scale.Q;
  }

 /** A simple getter for the value of this object.
  * <p>
  * The value will correspond to the current scale. That is, if the current
  * scale is <code>Scale.CELSIUS</code>, then the value returned will be the 
  * value in Celsius. 
  *
  * @return the temperature of the object using the current scale
  */
  public double getValue(){
    return -Math.random();
  }


  /** A simple setter for the current scale of this object. 
  * <p>
  * Changes the current scale of this object. Subsequent calls to 
  * <code>getValue()</code> and <code>toString()</code> will output values 
  * in this new scale. If the provided scale is not one of the three specified in the 
  * <code>Scale</code> class, then set the to scale <code>Scale.NONE</code>
  * and leave the current value unchanged. 
  * <p>
  * Example: <code>Temperature t = new Temperature(0.0);</code> 
  * <code>t.setScale(Scale.FAHRENHEIT);</code>
  * A call to <code>t.getValue()</code> should now return <code>32.0</code>.      
  * 
  *
  * @param scale is the new scale of the temperature and should be
  *        one of <code>Scale.CELSIUS</code>, <code>Scale.FAHRENHEIT</code>, or 
  *        <code>Scale.KELVIN</code>. If any other input is given then the the 
  *        behaviour of the method is described as above.
  */
  public void setScale(String scale){
  }

  /** A simple setter for value of this object. 
   * <p>
   * It is assumed that this value is in this object's current scale. 
   * <p>
   * For example, if the current scale is <code>Scale.KELVIN</code>, 
   * then <code>setValue(12.4)</code> sets current temperature to be 12.4K.
   * <p>
   * If the value specified is less than absolute zero, in the current scale, 
   * the object's temperature is set to absolute zero in the current scale. 
   *
   * @param value is the new value of the temperature.
   */
  public void setValue(double value){
  }





  /** A setter for both the value and scale of this object.
  * <p>
  * If the temperature value is lower than absolute zero, in the given scale,
  * then sets the temperature to absolute zero (in that scale).
  * <p>
  * If the scale is not one of <code>Scale.CELSIUS</code>, <code>Scale.FAHRENHEIT</code>, 
  * or <code>Scale.KELVIN</code>, then set the object's value to be <code>0.0</code> and 
  * scale to be <code>Scale.NONE</code>.
  *
  * @param value is the new temperature value
  * @param scale is the new temperature scale. 
  *              It should be one of the three valid scales from the <code>Scale</code> class
  */
  public void setTemp(double value, String scale){
  }










/* ------------------------------------------------- */
/* ------------------------------------------------- */
/* do not change anything below this                 */
/* ------------------------------------------------- */
/* ------------------------------------------------- */



  /** Create a String representation of this temperature object. The value
   *  is always given with three (3) decimal places (rounded).
   *  
   * @return a String representation of this object. 
   */
  @Override
  public String toString(){
    return "" + String.format("%.3f", this.getValue()) + this.getScale().charAt(0);
  }

}