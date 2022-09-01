public class doWhile2 {
    public static void main(String[] args) {
     isEvenNumber(14);  
     isEvenNumber(15); 
    int number = 1 ;
    int evenNumbersFound =  0 ;
    int oddNumbersFound =  0 ;

     while( number <= 69){
         
        boolean even = isEvenNumber(number) ;

        if(even){
            System.out.println( number + " is even number");
            evenNumbersFound++;
        }else{
            System.out.println(number + " is odd number");
            oddNumbersFound++;
        }

        number++;
     }
     System.out.println(evenNumbersFound + " even Numbers Found");
     System.out.println(oddNumbersFound + " odd Numbers Found");

    }
    

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            // System.out.println(number + " is true (even)");
            return true ;
        }
        else{
            // System.out.println(number + " is false (Odd)");
            return false ;
        }
    }
}
