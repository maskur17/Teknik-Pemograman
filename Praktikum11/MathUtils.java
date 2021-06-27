public class MathUtils {
    // Returns the factorial of the argument given 
    public static int factorial(int n) {         
        if(n < 0 ){              
            throw new IllegalArgumentException("wrong input your number negatif!");         
        }        
        if(n >=   17){             
            throw new IllegalArgumentException("too bigger!");         
        }        
        int fac = 1;         
        for (int i = n; i > 0; i-- )             
            fac *= i;         
        return fac;     
    }
}
