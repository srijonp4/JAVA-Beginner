public class Methodes {

    public static void main(String[] args) {
       
        
        calculateScore(true, 800, 5 , 100);
        //using the methode.

        calculateScore(true,10000, 8, 200);
        //using the methode.

        double printTotal = name(8, 5, 3);

        System.out.println(printTotal);

        checkNumber(277);
        checkNumber(-65465465);

        long kilometersToMiles =speedConverter(45);

        System.out.println(kilometersToMiles);

    }



    //declaring  a methode  calculateScore...
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

    //    boolean gameOver = true ;
    //    int score = 800 ;
    //    int levelCompleted = 5 ;
    //    int bonus = 100;
       if (gameOver){
        int finalScore = score+ (levelCompleted*bonus);
        finalScore += 1000 ;
        System.out.println("your final score was "+ finalScore);
       } 
        
    }
    
    public static double name (double num1,double num2, double num3 ){
        if(num1 > num2 && num2 > num3){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        double total = num1 - num2 - num3 ;
        return total ;
    }
    return -1 ;

    }


    public static void checkNumber(int number ){

        if(number > 0){
            System.out.println("+ve");
            
        }else if(number < 0){
            System.out.println("-ve");
        }
        else {
            System.out.println("is equal to 0");
        }


    }


    public static long speedConverter(double kilometersPerHour){
        if (kilometersPerHour > 0){

            long milesPerHour = Math.round(kilometersPerHour/1.609d);

            return milesPerHour;

        }
        return -1 ;
        ////13 no video 4.

    }


}

