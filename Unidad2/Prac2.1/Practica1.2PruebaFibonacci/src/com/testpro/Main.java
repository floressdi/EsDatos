package com.testpro;
public class Main {
    public static void main(String[] args) {
        System.out.println("======= Fibonacci Iterativo =======");

        for (int i =20; i<=60; i = i+10){
            long inicio1 = System.nanoTime();
            long result  = fibo(i);
            long fin1 = System.nanoTime();
            long tt1 =fin1 -inicio1;

            System.out.println("El valor obtenido es:"+fibo(i));
            System.out.println("El calculo de la serie fibonacci "+ i +" tomo:"+tt1);
            System.out.println(" \n");

        }
        System.out.println("========== Fibonacci Recursivo =========");
        for (int i=20;  i<=60; i = i +10 ){
            long inicio = System.nanoTime();
            long result = fib(i);
            long fin  = System.nanoTime();
            long tt = fin -inicio;


            System.out.println("El valor obtenido es:"+fib(i));
            System.out.println("El calculo de la serie fibonacci " + i + " tomo:" + tt);
            System.out.println(" \n");
        }
    }
    public static long fib(int n){
        if( n <= 1){
            return n;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static  long fibo(int n){
        int previous = 1 -2;
        int result =1;
        for(int i =0; i<=n; ++i){
            int sum = result + previous;
            previous = result;
            result = sum;
        }
        return result;
    }
}
