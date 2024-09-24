package net.htlgkr.GumpelmeierA21044.pos3.hue2;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AbstractCalculation calculator = null;

    public static void main(String[] args) {

    }

    private static void showCalculatorMenue () {
        System.out.println("Choose calculator: \n" +
                "           1 -- Relational calculator\n" +
                "           2 -- Vector calculator\n" +
                "           3 -- Complex calculator\n" +
                "           4 -- Exit programm");
    }

    private static void showOperationMenue () {
        System.out.println("Choose calculator: \n" +
                "           1 -- add\n" +
                "           2 -- substract\n" +
                "           3 -- multiply\n" +
                "           4 -- divide\n" +
                "           5 -- enter numbers again");
    }

    private static void displayResult(Number result) {
        System.out.println("Solution:\n" +
                "          a = " + result.getA() + "\n" +
                "          b = " + result.getB());
    }

    private static Number numberInput() {
        System.out.print("Enter number ");
        double a = scanner.nextDouble();
        System.out.print("Enter number ");
        double b = scanner.nextDouble();
        return new Number(a, b);
    }
}