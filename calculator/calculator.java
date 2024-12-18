package calculator;

import java.util.*;

public class calculator {
   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println( "Number x:");
    int x = input.nextInt();

    System.out.println( "Operation (+ - * / % ^):");
    int Operation = input.nextInt();

    System.out.println( "Number y:");
    int y = input.nextInt();

    int result;

    switch (Operation) {
        case '+':result = x + y ;
            
            break;

        case '-':result = x - y ;
            
            break;
        
         case '*':result = x * y ;
            
            break;
        
        case '/':result = x / y ;
            
            break;
        
        case '%':result = x % y ;
            
            break;
           
        case '^':result = x ^ y ;
            
            break;
        
        default: System.out.println(Operation);
        return;
    }
      System.out.println(x +" " +Operation +" "+ y +"+result");

   } 
}
