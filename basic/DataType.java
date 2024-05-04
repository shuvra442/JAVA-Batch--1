public class DataType {
  public static void main(String[] args) {
    // ---> single line comment 
    /**
     * jbvshjjhv
     * sdjbvjvhf
     * sfkjvbdfjkv    -----> multi-line comment 
     * dfkjbvkdfv
     * dfkjvb
     *

     /**
      *  Datatype 

        1-> prem  ->bolean
        2-> non prep
      */

      /**
       * boolean 
       * true
       * false
       */
      boolean c= false;

      if (c==true) {
        System.out.println("yes c == true");
      } else{
        System.out.println( "no c is not true ");
      }

      /**
       * char
       */
      char d = 'A';  // 2 byte-->
      System.out.println("char : " + d + "This is char example");


      /**
       * byte
       * size -> -128 to 127
       */

       byte a=126;
       System.out.println(a);  // 126

       a++; // a-->127
       System.out.println(a);
       a++; // a--> -128
       System.out.println(a);
       a++; // -127
       System.out.println(a);
       float l=78234753847534859573987349573944579.6f; // --> 4 byte
       double k=838534875438563485638456358975839485739853498574.5;  // ---> 8 byte

  }
}
