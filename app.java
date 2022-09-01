// class HelloWorld {
//     public static void main(String[] args) {

//         System.out.println("hello World this is my first java program ");
//     }
// }
import java.util.Scanner;

class helloClasssname {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

class numberChecker {
    public static void main(String[] args) {

        try (Scanner numberReader = new Scanner(System.in)) {
            System.out.println("Please enter a number to check");
            int number = numberReader.nextInt();
            if (number % 2 == 0)
                System.out.println(number + " is a even number");

            else if (number % 2 == 1)
                System.out.println(number + " is a odd number ");

        }

    }
}
