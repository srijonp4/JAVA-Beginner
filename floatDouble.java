public class floatDouble {
    public static void main (String[] args){
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("the minimum value of float is :- " + minFloat +" and maximum value of float is :- " + maxFloat);


        //double type.....
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("the minimum value of float is :- " + minDouble +" and maximum value of float is :- " + maxDouble);


        int intValue = 5 ;
        // Default excepted type is double so we will get error if we dont use type casting do whenever declaring float number so we have to type cast it to float===> eg : float exampleNumber =(float) 565406F ;
        // we have to use a "F" and it is also good practice to use "D" whenever declaring Double.
        float floatValue = (float) 5.25F ;///

        double doubleValue = 5.252D ;
        System.out.println("float Number Example :" + floatValue);
        System.out.println("double NUmber Example :" + doubleValue);

        //pound to KiloConversion......
        double noOfPoundToBeConverted = 3d;
        double noOfKiloGramsConverted = 0.45359237d*noOfPoundToBeConverted;
        System.out.println(noOfKiloGramsConverted + "kg");
        ////.......................

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        ///we can also use underscore to represent a value but its useless cus the "_" will be ignored.
        //there is another class called BigDEcimal by which many complex calculations(basially floating point).
        System.out.println(pi);
        System.out.println(anotherNumber);


        




    }
}
