// //If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

// // If we have to perform only one operation, having same name of the methods increases the readability of the program.

// // Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

// // So, we perform method overloading to figure out the program quickly.
// // java method overloading
// // Advantage of method overloading

// // Method overloading increases the readability of the program.
// // Different ways to overload the method

// // There are two ways to overload the method in java

// //    1. By changing number of arguments


// // class Adder{  
// //     static int add(int a,int b){return a+b;}  
// //     static int add(int a,int b,int c){return a+b+c;}  
// //     }  
// //     class TestOverloading1{  
// //     public static void main(String[] args){  
// //     System.out.println(Adder.add(11,11));  
// //     System.out.println(Adder.add(11,11,11));  
// //     }}


// // output: 

// // 22
// // 33


// //    2. By changing the data type

// // class Adder{  
// //     static int add(int a, int b){return a+b;}  
// //     static double add(double a, double b){return a+b;}  
// //     }  
// //     class TestOverloading2{  
// //     public static void main(String[] args){  
// //     System.out.println(Adder.add(11,11));  
// //     System.out.println(Adder.add(12.3,12.6));  
// //     }}

// // output:
// // 22
// // 24.9
// /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------println is the best example of methode overloading---------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
public class methodeOverloading {
    public static void main(String[] args) {
       System.out.println(calculateScore(40));
        System.out.println(calculateScore("Srijon", 90));
        System.out.println(calculateScore());

        System.out.println("----------------------------------------------------------------");
        System.out.println(calcFeetAndInchesToCentiemeters(1 , 10));
        System.out.println("----------------------------------------------------------------");
        System.out.println(calcFeetAndInchesToCentimeters(10));

    }   
    
   public static int calculateScore(int score) {
    return score * 1000;
   } 
   public static int calculateScore(String name , int score){
    System.out.println(name);
    return score ;
    //same methode name but different parameters

   }
   public static int calculateScore()
   {

    System.out.println("hello");
    //same methode name but no parameters
    return 0 ;
   }

//    public static void calculateScore(){
//     System.out.println("but only changing the data type doesnot works the overall structure has the be different structure means either arguments/parameters , name or return values. ");
//    }

public static double calcFeetAndInchesToCentiemeters(double feet, double inches){
    if(feet>=0 && inches>=0 && inches<=12){
        double feetToCentimeters = 12d*2.54d*feet;
        double inchesToCentimeters = 2.54d*inches;
        double totalCentimeters = feetToCentimeters+inchesToCentimeters ;
        return totalCentimeters;
    }
    return -1;
}
public static double calcFeetAndInchesToCentimeters(double inches){
    if(inches >=0 ){
        double inchesToCentimeters = 2.54d*inches; 
        return inchesToCentimeters; 
    }
    return -1;

}
// public static double calcFeetAndInchesToCentemeters(double inches){

// }

}
