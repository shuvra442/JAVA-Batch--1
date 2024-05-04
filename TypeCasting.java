
/**
 * byte->1 char-> 2 int -> 4 float->4 double->8
 */

public class TypeCasting {
  public static void main(String[] args) {
    /**
     * implicit typecasting
     */
    int a=10;
    double b=a;  // b= a=10 -->10

    /**
     * explicit typecasting
     */

     float c=108974598674596745896758964576489.0f;
     int d=(int)c;
     System.out.println(d);

     int e=207;
     byte f=(byte)e;
     System.out.println(f);
    
  }
}
