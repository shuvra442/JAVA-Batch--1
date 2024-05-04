
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class InputAndOutput {

  /**
   * To take input from user JAVA two class
   * 1. BufferReader --> It is used to read the data entered by a user in keyboard one line at a time.
   *                     The buffered reader reads the data character wise not word or line.
   * 
   * 2. Scanner --> It is used to read the data entered by a user in keyboard one line at a time.
   *                     The scanner  reads the data  word or line.
   * @param args
   */
  public static void main(String[] args) {
    // To take input form 
    // 1. Using BufferReader
    // BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    // System.out.println("Enter your name:");
    // String name =reader.readLine();  
    // System.out.println("Hello "+name);

    /**
     * BufferedReader --> is class to take user input  and store it into string variable.
     * reader --> it's a object
     * = --> operator 
     * new --> its keyword.its some memory in a stack to store user data.
     * 
     * BufferedReader --> its class
     * 
     * new --> memory allocate
     * 
     * InputStreamReader  --> convert byte stream to charachter stream.
     */

    // 2. Using Scanner Class
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your Name : ");
    String name =scanner.nextLine(); // its taks String as a input 

    System.out.println("Enter the number ::");
    int n=scanner.nextInt(); // its taks int as a input 

    System.out.println("enter any decimal data");
    double nn=scanner.nextDouble();
    

    System.out.print(name);
    System.out.println(n);
    System.out.println(nn);
  }
}
