public class doWhileLoop {
    public static void main(String[] args) {
        int sum =  0;
        int count = 0 ;
        do{
            count++;
            if((count%3 == 0) && (count%5 == 0)){
                System.out.print(count + " divisable by 5 and 3  and ");
                sum = sum + count ; 
                System.out.println("sum is " + sum + " ");
            }
            else{
                System.out.println(count + "is not divisable by 3 nor 5");
            }
        }while(count < 100);


    }

// public static void name() {
    
// }
}
