
/*
 * A class to model Canadian currency (money) as dollars and cents
 */
 
public class Money{

  /* attributes */ 
  public int dollars = -1;
  public int cents = -1;

  
  public Money(){ 
		// create an object with zero dollars and cents.
    
  }
  
  public Money(int c){
		// create an object with c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
   
  }
  
  public Money(int d, int c){
		// create an object with d dollars and c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
   
  }


  public Money(int[] coins){
	  // input array have 6 elements and corresponds to 
		// {#toonies, #loonies, #quarters, #dimes, #nickels, #pennies}
    // {$2, $2, $0.25, $0.10, $0.05, $0.01}		
		// create an object with total money passed in array 
		// (adjusting internal dollars and cents so that 0<=cents<=99)
  }
  
  /* incomplete implementation */
  public Money add(int d, int c){
    return this;
  }

  /* incomplete implementation */
  public boolean remove(int d, int c){
    return Math.random() < 0.5;
  }

  /* incomplete implementation */
  public boolean transferFrom(int d, int c, Money otherMoney){
    return Math.random() < 0.5;
  }

  /* complete implementation */
  public boolean transferTo(int d, int c, Money otherMoney){
    return otherMoney.transferFrom(d,c,this);
  }



  public static void main(String[] args){
    // some basic testing 
    Money m1 = new Money();
    Money m2 = new Money(1,217);
    Money m3 = new Money(123);
    System.out.println("m1: " + m1.toString());
    System.out.println("m2: " + m2.toString());
    System.out.println("m3: " + m3.toString());
    
    
    System.out.print("checking m1:");
    if( m1.dollars == 0 && m1.cents == 0){
        System.out.println("passed");
    }else{
        System.out.println("failed");
        System.out.println("--- expected dollars = 0, cents = 0");
        System.out.println("---   actual dollars = " + m1.dollars + ", cents = "+ m1.cents);
        
    }

    System.out.print("checking m2:");
    if( m2.dollars == 3 && m2.cents == 17){
        System.out.println("passed");
    }else{
        System.out.println("failed");
        System.out.println("--- expected dollars = 3, cents = 17");
        System.out.println("---   actual dollars = " + m2.dollars + ", cents = "+ m2.cents);
        
    }

    System.out.print("checking m3:");
    if( m3.dollars == 1 && m3.cents == 23){
        System.out.println("passed");
    }else{
        System.out.println("failed");
        System.out.println("--- expected dollars = 1, cents = 23");
        System.out.println("---   actual dollars = " + m3.dollars + ", cents = "+ m3.cents);
        
    }

    

    /*
    // Question 2 testing
    Money m = new Money(1,13);
    m.add(2,102);
    m.remove(0,89);
    m.add(1,98);
    m.remove(12,5);
    m.add(17,8);
    m.remove(2,95);
    m.add(2,22);
    m.remove(0,744);
    
    System.out.println("m: " + m.toString());
    System.out.println("(is this the expected value for m?");

    Money mm1 = new Money(112);
    Money mm2 = new Money(231);
    System.out.println("--------------------------------");
    System.out.println("before transfer");
    System.out.println("mm1: " + mm1.toString());
    System.out.println("mm2: " + mm2.toString());
    mm1.transferFrom(0,50,mm2);
    System.out.println("after transferFrom");
    System.out.println("mm1: " + mm1.toString());
    System.out.println("mm2: " + mm2.toString());
    mm1.transferTo(0,50,mm2);
    System.out.println("after transferTo (should be back to original)");
    System.out.println("mm1: " + mm1.toString());
    System.out.println("mm2: " + mm2.toString());
    
    */  

    

  }




  /** 
   * Returns a String representation of the value of the current object. 
   * 
   * @return The value of the current object is returned as the <code>String</code>"$D.cc"
   * where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
   * method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
   * with leading zeros if needed).
   **/
  public String toString(){
    return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }
  
}