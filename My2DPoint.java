/* this comment added 2019-11-27 from room 137
*/

 class My2DPoint {  
  double x;
  double  y;
  
  static String s = "My2DPoint created";
  
  public static void main(String[] args) { 
    System.out.println(" public static void main was called");
  }
  
// constructor 
   My2DPoint () {
     this(3.0,5.0);
  }
  
   My2DPoint (double x, double y) {
    counter++;
    this.x = x; this.y = y; 
    System.out.println(" My2DPoint class called");
  }
  
   double xReflect () {
    counter++;
    x = -x; 
    System.out.println(" x value reflected (My2DPoint) .. ");
    return x;
  }

   double xReflect (String a) {
    counter++;
    x = -x; 
    System.out.println(" x value reflected (string a) (My2DPoint) .. ");
    return x;
  }
   
  public void xPlusy () {
    x = x+y; 
    System.out.println(" xplusY  (My2DPoint) .. ");
  }
  static int counter;  // same value for all insrances of My2DPoint
}