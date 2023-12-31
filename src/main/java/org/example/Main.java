package org.example;

import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.lang.Math;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Start of Execution");
        Scanner in = new Scanner(System.in);

        displayMenu();
        Integer option = getOption(in);

        if (option == 1)
            squareRootCalc(in);
        else if (option == 2)
            factorialCalc(in);
        else if (option == 3)
            naturalLogCalc(in);
        else if (option == 4)
            powerCalc(in);
        else
            invalidPrompt();

        in.close();
    }

    public static Double squareRootHelper(Integer x) {
        if(x < 0) {
            logger.error("Invalid Input in SQROOT" + x);
            return Double.NaN;
        }
        logger.info("START OP: SQROOT");
        logger.info("Calculating square root for x = " + x);
        logger.info("END OP: SQROOT");
        return Math.round(Math.sqrt(x) * Math.pow(10, 3)) / Math.pow(10, 3);
    }

    public static void squareRootCalc(Scanner in) {
        System.out.println("+------------------------------------------------+");
        System.out.println("| Square root function Selected                  |");
        System.out.println("+------------------------------------------------+");

        int x = getUserInput(in);

        System.out.println("| Square root of the number " + x + " is: " + squareRootHelper(x));
        System.out.println("+------------------------------------------------+");
        System.out.println();
    }

    public static Integer factorialHelper(Integer n) {
        if(n < 0) {
            logger.error("Invalid Input in FACT" + n);
            return -1;
        }
        logger.info("START OP: FACT");
        logger.info("Calculating factorial of x = " + n);
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
        res *= i; 
        logger.info("END OP: FACT");
        return res; 
    }

    public static void factorialCalc(Scanner in) {
        System.out.println("+------------------------------------------------+");
        System.out.println("| Factorial function Selected                    |");
        System.out.println("+------------------------------------------------+");

        int x = getUserInput(in);

        System.out.println("| Factorial of the number " + x + " is: " + factorialHelper(x));
        System.out.println("+------------------------------------------------+");
        System.out.println();
    }

    public static Double naturalLogHelper(Integer x) {
        if(x <= 0) {
            logger.error("Invalid Input in LOG" + x);
            return Double.NaN;
        }
        logger.info("START OP: LOG");
        logger.info("Calculating natural logarithm (base e) for x = " + x);
        logger.info("END OP: LOG");
        return Math.round(Math.log(x) * Math.pow(10, 3)) / Math.pow(10, 3);
    }

    public static void naturalLogCalc(Scanner in) {
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| Natural logarithm (base e) Selected                        |");
        System.out.println("+------------------------------------------------------------+");

        int x = getUserInput(in);
        
        System.out.println("| Natural logarithm (base e) of the number " + x + " is: " + naturalLogHelper(x));
        System.out.println("+------------------------------------------------------------+");
        System.out.println();
    }

    public static Integer powerHelper(Integer b, Integer p) {
        logger.info("START OP: POWER");
        logger.info("Calculating power for base b = " + b + " and power p = " + p);
        logger.info("END OP: POWER");
        return (int) Math.pow(b, p);
    }

    public static void powerCalc(Scanner in) {
        System.out.println("+------------------------------------------------+");
        System.out.println("| Power function function Selected               |");
        System.out.println("+------------------------------------------------+");

        System.out.print("| Please enter the base: ");
        Integer b = in.nextInt();

        System.out.print("| Please enter the power: ");
        Integer p = in.nextInt();

        System.out.println("| " + b + " to the power " + p + " is: " + powerHelper(b, p));
        System.out.println("+------------------------------------------------+");
        System.out.println();
    }

    public static void displayMenu() {
        System.out.println("+--------------------------------+");
        System.out.println("| Welcome to the Calculator!     |");
        System.out.println("+--------------------------------+");
        System.out.println("| Please select an Option Below: |");
        System.out.println("| 1. Square root function        |");
        System.out.println("| 2. Factorial function          |");
        System.out.println("| 3. Natural logarithm (base e)  |");
        System.out.println("| 4. Power function              |");
        System.out.println("+--------------------------------+");
    }

    public static void invalidPrompt() {
        System.out.println("+------------------------------------------------+");
        System.out.println("|Invalid Option Selected.                        |");
        System.out.println("|Exiting........                                 |");
        System.out.println("+------------------------------------------------+");
        System.out.println();
    }

    public static Integer getOption(Scanner in) {
        System.out.println();
        System.out.print("Your Choice: ");
        Integer option = in.nextInt();
        System.out.println();

        return option;
    }

    public static Integer getUserInput(Scanner in) {
        System.out.print("| Please enter a number: ");

        return in.nextInt();
    }
}