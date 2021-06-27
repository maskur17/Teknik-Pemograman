import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) { 
        String keepGoing = "y";            
        Scanner scan = new   Scanner(System.in);        
        while (keepGoing.equals("y"  ) || keepGoing.equals("Y")) {             
            System.out.print("Enter an integer: "); 
            try{                
                int val = scan.nextInt();                
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));             
            } catch (IllegalArgumentException e){                 
                System.out.println(e);             
            } catch (InputMismatchException e){                  
                System.out.println("Only integer ok!");             
            }            
            System.out.print("Another factorial? (y/n) ");             
            keepGoing = scan.next();
        }
    }
}
