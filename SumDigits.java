import java.util.*;
import java.util.Scanner;


public class SumDigits {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number :-  ");

        int userInputNumber =  reader.nextInt();

        int mainSum =  sumDigits(userInputNumber);

     System.out.println("The Sum of the digits is "+mainSum );   
    }
    public static int  sumDigits(int number) {

        if ((number <  0 ) /*&& (number < 10  ) */ ){
            System.out.println("INVALID \n Please enter a positive number ");
            return -1;
        }  else if (number < 10){
                System.out.println(" INVALID \nPlease enter number which is more than 1 digit long");
            return  -1;
        } else{
            int sum = 0 ,  m ;
            // System.out.println(n);
            while(number > 0 ){
                m = number % 10 ;
                // System.out.println(m);
                sum = sum + m ;
                number = number/10 ;
                // number++;
                // System.out.println(sum);
                
            //  number++;  
                
            }
            
            return sum ; 


        }  
    }

}
