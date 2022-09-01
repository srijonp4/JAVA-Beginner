import java.util.*;
public class minAndMaxNumber {
  public static void main(String[] args) {
      
      Scanner reader = new Scanner(System.in);
      
      int min = 0 ; 
      int max = 0 ;
      boolean first = true ;

      while(true){
        System.out.println("Enter ");
        boolean hasNextInt = reader.hasNextInt();
        if(hasNextInt){

            int Number = reader.nextInt();
            if(first){
                first = false;
                min = Number ;
                max = Number ;

            }

            if ( Number > max){
                max = Number ;

            }
            if(Number < min ){
                Number = min ;
            }

        }else{
            System.out.println("invalid");
            break;
        }
        // reader.nextInt();
    }

    System.out.println("min no is : " + min +"\nMax number is : " + max);
  }  
}
