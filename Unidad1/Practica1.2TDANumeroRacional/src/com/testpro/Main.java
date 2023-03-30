package com.testpro;

public class Main {
    public static void main(String[] args) {
        Racional racional = new Racional(8,4);
        System.out.println("racional 1");
        racional.mostrar();
        racional.simplificar();
        System.out.println("racional 1 simplificado");
        racional.mostrar();

        System.out.println("=================");
        Racional r2 = new Racional(1,2);
        System.out.println("Racional 2");
        r2.mostrar();
        r2.simplificar();
        System.out.println("Racional 2 simplificado");
        r2.mostrar();

        Racional suma = racional.Suma(racional, r2);
        System.out.println("Suma de racionales");
        suma.mostrar();
        suma.simplificar();
        System.out.println("Racional suma simplificado");
        suma.mostrar();

        System.out.println("Resultado suma - racional 2 y simplificado");
        suma = racional.Resta(suma,r2);
        suma.simplificar();
        suma.mostrar();
    }
}