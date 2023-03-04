// name:      Jacob Chiu
// id:        101271070
// course:    COMP 1006
// semester:  2
//
// assignment:  2 
// comments:    ?

/** A <code>Temperature</code> object models temperature by storing its value (magnitude)
 * and scale. 
 */
public class Temperature{
  private String scale = Scale.CELSIUS;
  private Double temp  = 0.0;
/** Initializes a <code>Temperature</code> object with given value in Celsius
 *  If the initial temperature is less than absolute zero (-273.15C)
 *  then the temperature object will be initialized with -273.15C.
 * @param value is the initial temperature in Celsius.
 */
  public Temperature(double value){
    if (scale == Scale.CELSIUS && value <= -273.15)         { this.temp = -273.15;}
    else if (scale == Scale.FAHRENHEIT && value <= -459.67) {this.temp  = -459.67;}
    else if (scale == Scale.KELVIN && value <= 0)           {this.temp  = 0.0;}
    else                                                    {this.temp  = value;}
  }
/** Initializes a <code>Temperature</code> object with given 
 *  value using the specified scale
 * If the temperature is lower than absolute zero, in the given scale,
 * then set the temperature to absolute zero (in that scale).
 * If the scale is not one of the three specified in the Scale class, 
 * then create the object with value 0.0 and scale <code>Scale.NONE</code>
 * Example: <code>new Temperature(12.3, Scale.KELVIN)</code> will create 
 * a <code>Temperature</code> object with value 12.3 using the
 * Kelvin scale. 
 * 
 * @param value is the initial temperature
 * @param scale is the scale of initial temperature and must a constant
 *        defined in the Scale enum type.
 */
  public Temperature(double value, String scale){
    if (scale == Scale.CELSIUS) { 
      if (value <= -273.15)                   {this.temp = -273.15;}
      else                                    {this.temp = value;}
      this.scale = Scale.CELSIUS;
    }
    else if (scale == Scale.FAHRENHEIT) {
      if (value <= -459.67)                   {this.temp = -459.67;}
      else                                    {this.temp = value;}
      this.scale = Scale.FAHRENHEIT;
    }
    else if (scale == Scale.KELVIN) {
      if (value <= 0)                         {this.temp = 0.0;}
      else                                    {this.temp = value;}
      this.scale = Scale.KELVIN;
    }
    else {
      this.temp = 0.0;
      this.scale = Scale.NONE;
    }
  }
/** A simple getter for the scale of this object. 
 *  The output will always be one of the static attributes 
 *  from the <code>Scale</code> class.
 * @return the current scale of this object. 
 */
  public String getScale(){
    return this.scale;
  }
 /** A simple getter for the value of this object.
  * The value will correspond to the current scale. That is, if the current
  * scale is <code>Scale.CELSIUS</code>, then the value returned will be the 
  * value in Celsius. 
  * @return the temperature of the object using the current scale
  */
  public double getValue(){
    return this.temp;
  }


  /*A simple setter for the current scale of this object. 
  * Changes the current scale of this object. Subsequent calls to 
  * <code>getValue()</code> and <code>toString()</code> will output values 
  * in this new scale. If the provided scale is not one of the three specified in the 
  * <code>Scale</code> class, then set the to scale <code>Scale.NONE</code>
  * and leave the current value unchanged. 
  * Example: <code>Temperature t = new Temperature(0.0);</code> 
  * <code>t.setScale(Scale.FAHRENHEIT);</code>
  * A call to <code>t.getValue()</code> should now return <code>32.0</code>.      

  * @param scale is the new scale of the temperature and should be
  *        one of <code>Scale.CELSIUS</code>, <code>Scale.FAHRENHEIT</code>, or 
  *        <code>Scale.KELVIN</code>. If any other input is given then the the 
  *        behaviour of the method is described as above.
  */
  public void setScale(String scale){
    if (this.scale == Scale.FAHRENHEIT && scale == Scale.CELSIUS)           {this.scale = Scale.CELSIUS; this.temp = ((this.temp - 32) * 5) / 9;}
    else if (this.scale == Scale.FAHRENHEIT && scale == Scale.KELVIN)       {this.scale = Scale.KELVIN; this.temp = (((this.temp - 32) * 5) / 9) + 273.15;}

    else if (this.scale == Scale.CELSIUS && scale == Scale.FAHRENHEIT)      {this.scale = Scale.FAHRENHEIT; this.temp = ((this.temp * 9) / 5) + 32;}   
    else if (this.scale == Scale.CELSIUS && scale == Scale.KELVIN)          {this.scale = Scale.KELVIN;     this.temp += 273.15;}
    
    else if (this.scale == Scale.KELVIN && scale == Scale.CELSIUS)          {this.scale = Scale.CELSIUS;    this.temp -= 273.15;}
    else if (this.scale == Scale.KELVIN && scale == Scale.FAHRENHEIT)       {this.scale = Scale.FAHRENHEIT; this.temp -= 273.15;; this.temp = ((this.temp * 9) / 5) + 32;}
    
    else if (this.scale == scale) {}
    else {this.scale = Scale.NONE;}
  }                                                                                         
  /** A simple setter for value of this object. 
   * It is assumed that this value is in this object's current scale. 
   * For example, if the current scale is <code>Scale.KELVIN</code>, 
   * then <code>setValue(12.4)</code> sets current temperature to be 12.4K.
   * If the value specified is less than absolute zero, in the current scale, 
   * the object's temperature is set to absolute zero in the current scale. 
   * @param value is the new value of the temperature.
   */
  public void setValue(double value){
    if (scale == Scale.CELSIUS) { 
      if (value <= -273.15)                   {this.temp = -273.15;}
      else                                    {this.temp = value;}
    }
    else if (scale == Scale.FAHRENHEIT) {
      if (value <= -459.67)                   {this.temp = -459.67;}
      else                                    {this.temp = value;}
    }
    else if (scale == Scale.KELVIN) {
      if (value <= 0)                         {this.temp = 0.0;}
      else                                    {this.temp = value;}
    }
    else                                      {this.temp = 0.0;}                                         
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
    if (scale == Scale.CELSIUS) { 
      if (value <= -273.15)                   {this.temp = -273.15;}
      else                                    {this.temp = value;}
      this.scale = Scale.CELSIUS;
    }
    else if (scale == Scale.FAHRENHEIT) {
      if (value <= -459.67)                   {this.temp = -459.67;}
      else                                    {this.temp = value;}
      this.scale = Scale.FAHRENHEIT;
    }
    else if (scale == Scale.KELVIN) {
      if (value <= 0)                         {this.temp = 0.0;}
      else                                    {this.temp = value;}
      this.scale = Scale.KELVIN;
    }
    else {
      this.temp = 0.0;
      this.scale = Scale.NONE;
    }
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