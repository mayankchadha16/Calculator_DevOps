import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("+--------------------------------+");
        System.out.println("| Welcome to the Calculator!     |");
        System.out.println("+--------------------------------+");
        System.out.println("| Please select an Option Below: |");
        System.out.println("| 1. Square root function        |");
        System.out.println("| 2. Factorial function          |");
        System.out.println("| 3. Natural logarithm (base e)  |");
        System.out.println("| 4. Power function              |");
        System.out.println("+--------------------------------+");


        System.out.println();
        System.out.print("Your Choice: ");
        Integer option = in.nextInt();
        System.out.println();


        if (option == 1) {
            System.out.println("+------------------------------------------------+");
            System.out.println("| Square root function Selected                  |");
            System.out.println("+------------------------------------------------+");

            System.out.print("| Please enter a number: ");
            Integer x = in.nextInt();
            
            System.out.println("| Square root of the number " + x + " is: " + Math.round(squareRootCalc(x) * Math.pow(10, 3))/ Math.pow(10, 3));
            System.out.println("+------------------------------------------------+");
            System.out.println();
        }


        else if (option == 2) {
            System.out.println("+------------------------------------------------+");
            System.out.println("| Factorial function Selected                    |");
            System.out.println("+------------------------------------------------+");

            System.out.print("| Please enter a number: ");
            Integer x = in.nextInt();

            System.out.println("| Factorial root of the number " + x + " is: " + factorialCalc(x));
            System.out.println("+------------------------------------------------+");
            System.out.println();
        }


        else if (option == 3) {
            System.out.println("+------------------------------------------------------------+");
            System.out.println("| Natural logarithm (base e) Selected                        |");
            System.out.println("+------------------------------------------------------------+");

            System.out.print("| Please enter a number: ");
            Integer x = in.nextInt();

            System.out.println("| Natural logarithm (base e) of the number " + x + " is: " + naturalLogCalc(x));
            System.out.println("+------------------------------------------------------------+");
            System.out.println();
        }


        else if (option == 4) {
            System.out.println("+------------------------------------------------+");
            System.out.println("| Power function function Selected               |");
            System.out.println("+------------------------------------------------+");

            System.out.print("| Please enter the base: ");
            Integer b = in.nextInt();

            System.out.print("| Please enter the power: ");
            Integer p = in.nextInt();

            System.out.println("| " + b + " to the power " + p + " is: " + powerCalc(b, p));
            System.out.println("+------------------------------------------------+");
            System.out.println();
        } 


        else {
            System.out.println("+------------------------------------------------+");
            System.out.println("|Invalid Option Selected.                        |");
            System.out.println("|Exiting........                                 |");
            System.out.println("+------------------------------------------------+");
            System.out.println();
        }

        in.close();
    }

    public static Double squareRootCalc(Integer x) {
        return Math.sqrt(x);
    }

    public static Integer factorialCalc(Integer x) {
        return 2;
    }

    public static Double naturalLogCalc(Integer x) {
        return 3.0;
    }

    public static Integer powerCalc(Integer b, Integer p) {
        return 4;
    }
}