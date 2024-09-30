package net.htlgkr.GumpelmeierA21044.pos3.hue2;

import net.htlgkr.GumpelmeierA21044.pos3.hue2.calculators.ComplexCalculator;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.calculators.RationalCalculator;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.calculators.VectorCalculator;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.interfaces.CalculationOperation;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AbstractCalculator calculator = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculationOperation add = (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB());
        CalculationOperation subtract = (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB());
        CalculationOperation multiply = (x, y) -> new Number(x.getA() * y.getA(), x.getB() * y.getB());
        CalculationOperation divide = (x, y) -> new Number(x.getA() / y.getA(), x.getB() / y.getB());

        while (true) {
            System.out.println("Choose calculator:");
            System.out.println("1 = Rational calculator");
            System.out.println("2 = Vector calculator");
            System.out.println("3 = Complex calculator");
            System.out.println("4 = Exit program");
            int calculatorChoice = scanner.nextInt();

            if (calculatorChoice == 4) {
                break;
            }

            System.out.println("Enter number x a:");
            double xA = scanner.nextDouble();
            System.out.println("Enter number x b:");
            double xB = scanner.nextDouble();

            System.out.println("Enter number y a:");
            double yA = scanner.nextDouble();
            System.out.println("Enter number y b:");
            double yB = scanner.nextDouble();

            Number x = new Number(xA, xB);
            Number y = new Number(yA, yB);

            System.out.println("Choose operation:");
            System.out.println("1 = add");
            System.out.println("2 = subtract");
            System.out.println("3 = multiply");
            System.out.println("4 = divide");

            int operationChoice = scanner.nextInt();

            AbstractCalculator calculator = null;

            if (calculatorChoice == 1) {
                calculator = new RationalCalculator(add, subtract, multiply, divide);
            } else if (calculatorChoice == 2) {
                calculator = new VectorCalculator(add, subtract, multiply, divide);
            } else if (calculatorChoice == 3) {
                calculator = new ComplexCalculator(add, subtract, multiply, divide);
            }

            Number result = null;
            switch (operationChoice) {
                case 1:
                    result = calculator.add(x, y);
                    break;
                case 2:
                    result = calculator.substract(x, y);
                    break;
                case 3:
                    result = calculator.multiply(x, y);
                    break;
                case 4:
                    result = calculator.divide(x, y);
                    break;
            }

            System.out.println("=========================");
            System.out.println("Solution:");
            System.out.println("a = " + result.getA());
            System.out.println("b = " + result.getB());
            System.out.println("=========================");
        }
    }
}
