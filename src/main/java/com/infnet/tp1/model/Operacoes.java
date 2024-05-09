package com.infnet.tp1.model;

public class Operacoes {
    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return num1 / num2;
    }

    public static double exponenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
