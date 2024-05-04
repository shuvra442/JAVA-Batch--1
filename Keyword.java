/**
 * keyword:
 * its a reserved word 
 * already define in the compiler 
 */

public class Keyword {

  public static void main(String[] args) {
    int $a=10; // --> int keyword
    int _a=4; // its not possible beacse  its a case sensitive
    System.out.println($a);
    System.out.println(_a); // --> error because it is
  }
  
}
