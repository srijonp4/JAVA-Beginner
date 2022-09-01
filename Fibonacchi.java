public class Fibonacchi {

    public static void main(String args[])  
    {    
     
        int i , n=8; //TODO

        System.out.println("no of items :");
        int t1 =0 , t2 =1;
        int next = t1 + t2;
        for(i=1; i<=n;i++){
            System.out.println(t1);
            t1 = t2 ;
            t2 = next ;
            next = t1 + t2;
        }
    
} 
}
