import java.util.*;
public class ScannerInput {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        // Scanner ageReader =  new Scanner(System.in);
        // System.out.println("Enter your birthdate");
        // int age =  ageReader.nextInt();
        // ageReader.close(); this type doesnot work
        
        
        
        
        System.out.println("Enter your birthdate");
        boolean hasNextInt = reader.hasNextInt();
        
        if(hasNextInt){
            int age = 2022 - (reader.nextInt());
            reader.nextLine() ;
            System.out.println("Please enter your Name");
            String Name = reader.nextLine();
            
            System.out.println("your name is " + Name + "  you are " + age +  "years old ");
            
        }else{
            System.out.println("invalid Input");
        }


        reader.close();



    }
}
