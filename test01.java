public class test01 {
    public static void main (String[] args){
    double variable1 = 20d ;
    double variable2 = 80d;
    double variable3 = (variable1 + variable2)*100d ;
    double variable4 = variable3 % 40d ;
    System.out.println(variable4);

    boolean variable5 = (variable4 == 0)? true : false ;
    System.out.println(variable5);

    if(!variable5){
        System.out.println("got some remainder");

    }

    }
    
}
