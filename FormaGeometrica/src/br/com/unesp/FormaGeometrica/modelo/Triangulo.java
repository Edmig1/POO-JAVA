package br.com.unesp.FormaGeometrica.modelo;

public class Triangulo extends FormaGeometrica {
    double base;
    double altura;
    double lado1;
    double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return (this.base * this.altura);
    }
    @Override
    public double perimetro(){
        return (lado1+lado2+base)/2;
    }
}
