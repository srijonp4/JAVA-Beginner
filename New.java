public class New {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max:- " + max +" min:" + min);// 



        long myLongValue =  9223372036854775807L;//BUG:always put "L" after declaring long

        byte myMinBYTEValue = Byte.MIN_VALUE;
        byte myMaxBYTEValue = Byte.MAX_VALUE;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinBYTEValue);
        System.out.println(myMaxBYTEValue);
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);
        System.out.println(myLongValue);

// TODOtype Conversion in java 
//default integer used by java is a int 
//default decimal no used by java is a float
//in java if we do arithmetic operation of some integer other than int it will cinvert it typr to int that is why we will get errors.
//eg.
        // [byte byteDivide = (myMaxBYTEValue/2);]
        //it will give error
        byte byteDivide = (byte)(myMaxBYTEValue/2);///typecasting by (byte in parenthesis)
        System.out.println(byteDivide);
        //same with short 
        short shortMultiplication = (short) (myMaxShortValue/2);
        System.out.println(shortMultiplication);
        int intSubstraction = (546546546-50000000);
        System.out.println(intSubstraction);
        long total = (50000L+10L*(shortMultiplication+byteDivide+intSubstraction));
        System.out.println(total);
    }
    
}
