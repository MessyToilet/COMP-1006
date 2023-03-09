public class SpecificBox extends Box{
   /* ------------------------------------------------------------
       Please NOTE the ordering of the input parameters
    -------------------------------------------------------------*/
   public SpecificBox(String label, String location, int size){
      // add code here
         super(label, location, size);
         this.label     = label;
         this.location  = location;
         this.size      = size;
      }

   @Override
   public int compareTo(Box box1){
      // System.out.println("");
      // System.out.println("size     : " + this.size + "\t" + box1.size);
      // System.out.println("location : " + this.location + "\t" + box1.location);
      // System.out.println("label    : " + this.label + "\t" + box1.label);
      int loc = this.location.compareTo(box1.location);
      if (loc != 0){
         System.out.println("returning at loc " + loc);
         return loc / Math.abs(loc);
      }
      
      int lab = Integer.compare(this.label.length(), box1.label.length());
      if (lab != 0){
         // System.out.println("returning at lab " + lab);
         return (lab / Math.abs(lab)) * 2;
      }
      
      int siz = Integer.compare(box1.size, this.size);
      if (siz != 0){
         // System.out.println("returning at siz");
         return (siz / Math.abs(siz)) * 3;
      }
      else {
         return 0;
      }
   }
}