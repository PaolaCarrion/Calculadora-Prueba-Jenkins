package com.mycompany.ejcalculadora;

import com.mycompany.ejcalculadora.Entidad.Calculadora;

public class EjCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1=10;
        int num2=5;
        
        System.out.println("Suma: " + calculadora.sumar(num1, num2));
        System.out.println("Resta: " + calculadora.restar(num1, num2));
        System.out.println("Multiplicación: " + calculadora.multiplicar(num1, num2));

        try {
            System.out.println("División: " + calculadora.dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }S
    }

}
