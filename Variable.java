public class Variable {

  // 2. instance variable
  public int b=10;

    // instance variable  default value is 0 

  // 1. local variable 
  void display(int i, int j) {
   int  sum = i + j;
   System.out.println(b);
  }

  // 3. static variable 
  static int c=20;   // static variable



  public static void main(String[] args) {
    int x = 10;
    System.out.println(x); // --> x=10

    x=200;
    System.out.println(x); // Output: 200
/**
 * java 2 typs of memory 
 * stack memory
 * heap memory
 * 
 * x --> stack memory
 * 200 ---> heap memory
 * 
 */

    // x=2000;
    // System.out.println(x);

    /**
     * int --> datatype
     * x ----> variable name
     * 10 ---> value
     */


     /**
      * three types of variable in java
      1. local  variables
      2. instance/member variables (non-
      3. static variable
      */

      
      
  }

}
