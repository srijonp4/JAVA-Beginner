import java.util.*;

public class StringParsing {
    public static void main(String[] args) {
        
            Scanner readerString = new Scanner(System.in);
            System.out.println("enter your number as a string  : ");

            String numberAsString  = readerString.next();

            readerString.close(); 

            System.out.println(  numberAsString + 1);//concatination is performed here because the variable datatype is  a string .

            System.out.println("Number as string is   " 
            + numberAsString);

            double number =  Double.parseDouble(numberAsString);//conververting the string into number...
            System.out.println(number + 1)
            ;
        
    }
}
