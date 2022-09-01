public class controlFlowStatement {
    public static void main(String[] args) {
     int value = 1 ;  
     ///if , else , elseif
    if(value == 1){
        System.out.println("value : 1");
    }else if(value == 2){
        System.out.println("value : 2");
    }else{
        System.out.println("value : 3");
    }

    ///Switch
    char switchvalue = 'b';
    switch(switchvalue){
        case 'a':
        System.out.println("value : a");
        break;
        case 'b' :
        System.out.println("value : b");
        break;
        default :
        System.out.println("default");
        break;
    }
    ///for
    for (int j = 0; j < 10; j++) {
        System.out.println("i am for loop no " + j );
    }

    int k = 1 ;
    while(k <= 10 ){
        System.out.println("while loop no " + k);
        k++;
    }
    
    for(int z = 1 ; z <= 1000 ; z++)

    if (z % 3 == 0 && z %5 == 0){
        z = z + z ;
        System.out.println(z);
    }
    else{
        System.out.println("not divisable by 3 or 5 ");
    }

   }
   
}
