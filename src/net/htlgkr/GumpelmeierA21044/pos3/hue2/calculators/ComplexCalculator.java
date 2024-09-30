package net.htlgkr.GumpelmeierA21044.pos3.hue2.calculators;

import net.htlgkr.GumpelmeierA21044.pos3.hue2.AbstractCalculator;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.Number;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.interfaces.CalculationOperation;

public class ComplexCalculator extends AbstractCalculator {

    public ComplexCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, substract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return new Number(a.getA() + b.getA(), a.getB() + b.getB());
    }

    @Override
    public Number substract(Number a, Number b) {
        return new Number(a.getA() - b.getA(), a.getB() - b.getB());
    }

    @Override
    public Number multiply(Number a, Number b) {
        double realPart = a.getA() * b.getA() - a.getB() * b.getB();
        double imaginaryPart = a.getA() * b.getB() + a.getB() * b.getA();
        return new Number(realPart, imaginaryPart);
    }

    @Override
    public Number divide(Number a, Number b) {
        double denominator = b.getA() * b.getA() + b.getB() * b.getB();
        double realPart = (a.getA() * b.getA() + a.getB() * b.getB()) / denominator;
        double imaginaryPart = (a.getB() * b.getA() - a.getA() * b.getB()) / denominator;
        return new Number(realPart, imaginaryPart);
    }
}
