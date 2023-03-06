/** A Box has a label, a location and a size.  */
public abstract class Box implements Comparable<Box>{
   String   label;
   String   location;
   int      size;

   /** Simple constructor to initialize a Box object.
    * 
    * @param label is the Box's label
    * @param location is the Box's location
    * @param size is the Box's size
    */
   public Box(String label, String location, int size){
      this.label = label;
      this.location = location;
      this.size = size;
   }
   /** Simple getter for this box's label
    * 
    * @return the label of this box
    */
   public String getLabel(){ return this.label;}

   /** Simple getter for this box's size
    * 
    * @return the size of this box
    */
   public int    getSize(){ return this.size;}

   /** Simple getter for this box's location
    * 
    * @return the location of this box
    */
   public String getLocation(){ return this.location;}


   @Override
   public String toString(){
      return "(" + this.location + "," + this.label + "," + size + ")";
   }

}