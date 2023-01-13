import java.util.*;

public class Factorial {
    public static void main (String args[]) {
        ask();
    }
    public Factorial (int input) {

    }

    public static void ask() {
        Scanner numAsk = new Scanner(System.in);

        System.out.println("");
        System.out.println("What do you want? (input number)");
        int userInput = Integer.parseInt(numAsk.nextLine().trim());

        if (userInput != 0) {

            Factorial obj = new Factorial(userInput);
//            obj.factorialMulti(userInput);

            System.out.println("-----------------------");
            System.out.println("-----------------------");
            System.out.println();

            obj.fibonacciMulti(userInput);

            System.out.println("-----------------------");
            System.out.println("-----------------------");
            System.out.println();

            obj.loopFib(userInput);



            ask();
        }

        else {
            System.out.println("0");

            ask();
        }

    }

    public int factorialMulti(int input) {

        int result = 0;

        if (input > 0) {
            result = input * factorialMulti(input - 1);
        }
        else {
            result = 1;
        }

        System.out.println("Factorializing numbers from 1 to " + input);
        System.out.println("Factorial: " + result);
        System.out.println();
        return result;

    }

    public int fibonacciMulti(int input) {
        System.out.println("Fibonacci'ing numbers at index " + input);

        int result = 0;

        if (input == 1) {
            result = 1;
        }
        else if (input > 1) {
            result = fibonacciMulti(input - 1) + fibonacciMulti(input - 2);
        }
        else {
            result = 0;
        }


        System.out.println("Fibbing: " + result);
        System.out.println();

        return result;

    }

    public int loopFib(int input) {
        int tempOne = 0;
        int tempTwo = 1;
        int result = 0;

        for (int i = 0; i <= input; i++) {
            if (i == 0) {
                result = tempOne;
                System.out.println("Fibbin' : " + tempOne);

            } else if (i == 1) {
                result = tempTwo;
                System.out.println("Fibbin' : " + tempTwo);
            } else {
                tempTwo = tempOne;
                tempOne = result;

                result = tempOne + tempTwo;


                System.out.println("Fibbin' : " + result);
            }
        }
        return result;
    }
}
