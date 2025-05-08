package com.main;

public class CalculadoraCientifica extends Calculadora {

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    

    public double sqrt(double x) {
        if (x < 0) throw new ArithmeticException("Square root of negative number");
        return Math.sqrt(x);
    }

    public double sin(double x) {
        return Math.sin(Math.toRadians(x));
    }

    public double cos(double x) {
        return Math.cos(Math.toRadians(x));
    }

    public double redondear(double valor, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(valor * factor) / factor;
    }

    public double tan(double x) {
        double cos = Math.cos(Math.toRadians(x));
        if (Math.abs(cos) < 1e-10) throw new ArithmeticException("Tangente indefinida");
        return Math.tan(Math.toRadians(x));
    }

    public double log(double x) {
        if (x <= 0) throw new ArithmeticException("Logarithm domain error");
        return Math.log10(x);
    }

    public double ln(double x) {
        if (x <= 0) throw new ArithmeticException("Natural logarithm domain error");
        return Math.log(x);
    }
}
