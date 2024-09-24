package net.htlgkr.GumpelmeierA21044.pos3.hue2;

import net.htlgkr.GumpelmeierA21044.pos3.hue2.interfaces.CalculationOperation;

public abstract class AbstractCalculation {
    protected CalculationOperation add;
    protected CalculationOperation substract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculation(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.substract = substract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number a, Number b);
    public abstract Number substract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public abstract Number divide(Number a, Number b);
}
