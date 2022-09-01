public class secondsAndMinutes {

    public static void main(String[] args) {
       System.out.println(getDuration(133)); 
       System.out.println(getDuration(133, 0));
    }
    

    public static String  getDuration(int minutes, int seconds) {

        if(minutes >= 0 && seconds>= 0 && seconds<= 59)
        {
            int hours = minutes / 60 ;
            int minutesRemaining = minutes % 60 ; 
            return hours +"h " +minutesRemaining +"m " + seconds + "s ";
        }
        else{
            System.out.println("Invalid Value");
            return "Invalid Value";
        }        
    }

    public static String getDuration(int seconds ){
        if (seconds >= 0) {

            int minutes = seconds / 60 ;
            int secondsRemaining = seconds %60 ;
            return minutes + "m" + secondsRemaining + "s" ;
            
        } else {
            System.out.println("invalid value"); 
            return "Invalid Value" ;           
        }

    }
}

///using Methode overloading..