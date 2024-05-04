import java.util.Scanner;

/**
 * q:
 * 
 *  *
 *  **
 *  ***
 *  ****
 */

 class StartPattern{
    public static void main(String[] args) {
      // take  input
      Scanner sc=new Scanner(System.in);

      // take integer type of input 
      int n=sc.nextInt();

      /// star pattren
      for (int i=0; i<n; i++){
        for(int j=0; j<=i;j++){
          System.out.print("* ");
        }
        System.out.println();
      }
    }
 }