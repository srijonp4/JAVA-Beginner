public interface factorial {
    public static void main(String[] args) {
        int i,fact=1;  
        int number=4;   //TODO
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial is :" +fact);   
    }
}
