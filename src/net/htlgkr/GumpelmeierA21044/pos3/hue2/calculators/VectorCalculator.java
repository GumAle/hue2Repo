package net.htlgkr.GumpelmeierA21044.pos3.hue2.calculators;

import net.htlgkr.GumpelmeierA21044.pos3.hue2.AbstractCalculation;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.Number;
import net.htlgkr.GumpelmeierA21044.pos3.hue2.interfaces.CalculationOperation;

public class VectorCalculator extends AbstractCalculation {

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
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }
}
