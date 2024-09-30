package net.htlgkr.GumpelmeierA21044.pos3.hue2.calculators;

import net.htlgkr.GumpelmeierA21044.pos3.hue2.AbstractCalculator;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.Number;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.interfaces.CalculationOperation;

public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, substract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number substract(Number a, Number b) {
        return substract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        double crossProduct = a.getA() * b.getB() - a.getB() * b.getA();
        return new Number(0, crossProduct);
    }

    @Override
    public Number divide(Number a, Number b) {
        double scalarProduct = a.getA() * b.getA() + a.getB() * b.getB();
        return new Number(scalarProduct, 0);
    }
}
