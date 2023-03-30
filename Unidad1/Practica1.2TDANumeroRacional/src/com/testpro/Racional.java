package com.testpro;

public class Racional {
    int num, denom;
    public Racional(){

    }
    public Racional(int num, int denom){
        this.num = num;
        this.denom = denom;
    }
    public void setNum(int num){
        this.num = num;
    }
    public void setDenom(int denom){
        this.denom = denom;
    }
    public void mostrar(){
        System.out.println(num+" / "+denom);
    }
    public Racional Suma(Racional r1, Racional r2){
        Racional suma = new Racional();
        suma.setDenom(r1.denom * r2.denom);
        suma.setNum(r1.num * r2.denom + r2.num * r1.denom);
        return suma;
    }

    public Racional Resta(Racional r1, Racional r2){
        Racional resta = new Racional();
        resta.setDenom(r1.denom * r2.denom);
        resta.setNum(r1.num * r2.denom - r2.num * r1.denom);
        return resta;
    }

    public void simplificar(){
        int divisor = maximoComunDivisor(num, denom);
        setNum(num / divisor);
        setDenom(denom / divisor);
    }
    private int maximoComunDivisor(int a, int b){
        int temporal;
        while (b !=0){
            temporal = b;
            b = a%b;
            a = temporal;
        }
        return a;
    }
}

