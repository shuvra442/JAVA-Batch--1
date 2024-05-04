public class Operator {
  public static void main(String[] args) {
   // a+b // ---> a,b is operend  + opertor
   /**
    * 1. arithmethic op  --> +,-,*,/,%
      2. Unary op       --> ++,--
      3. assignment op  --> +=, -=, *=,/+
      4. relational op  --> ==, !=, > ,< ,>=, <=
      5. logical op     --> &&, ||
      6. ternary op
      7. bitwise op
      8. shift op
      9. instance op

    */

    // 1. arithmethic
    // int  a = 10,b=20;
    // System.out.println(a+b);
    // System.out.println(a-b);
    // System.out.println(a*b);
    // System.out.println(a/b);
    // System.out.println(a%b);

    // 2. unary 
    /**
     * a=10
     * 
     * ++ --    
     *  ++a  a++
     * System.out.println(++a) --> 11
     * System.out.println(a++) --> 10
     * System.out.println(a)   --> 11
     * System.out.println(--a) --> 9
     * System.out.println(a--) --> 10
     * System.out.println(a)   --> 9
     */
    // System.out.println("Unary "+ ++a);

    /**
     * 3. assignment op  --> +=, -=, *=,/+
     */
  
    //  int a=10;
    //  int b=50;
    //   a +=b;  // 10 + =10+50 => 60
    //   a -=b;
    //   a/=b;
    //   a*=b;

    /**
     * relational op  --> ==, !=, > ,< ,>=, <=
     */

    //  int a=11;
    //  int b=10;

    //  boolean c = a != b;  
    //  System.out.println(c);

    // logical op     --> &&, ||

    int a=10,b=20,c=40,d=50;
     if((a < b) && (c>d)){
       System.out.println("Yes i'm here...");
     }

     



  }
}
