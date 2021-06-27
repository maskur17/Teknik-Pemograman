import java.util.Scanner;

public class CountLetters {     
    public static void main(String[] args) { 
        int[] counts = new int[26];         
        Scanner scan = new Scanner(System.in);

        // get word from user 
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // convert to   all upper case
        word = word.toUpperCase();        
        int i = 0; 

        // count frequency of   each letter in   string        
        try {             
            for (i = 0; i < word.length(); i++)                   
            counts[word.charAt(i) - 'A']++;        
        } catch (ArrayIndexOutOfBoundsException e) {             
            System.out.println("Not   A Letter");            
            if (word.charAt(i) == ' ') {                 
                System.out.println("Wrong in   character : space");           
             } else {                 
                 System.out.println("Wrong in   character : " + word.charAt(i));             
                }        
            }
            // print frequencies System.out.println();        
            for (i = 0; i < counts.length; i++)             
            if (counts[i] !=   0)                 
            System.out.println((char) (i + 'A')    + ":   " + counts[i]);           
            
            scan.close();     
        }
    }