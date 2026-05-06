package br.com.unesp.FormaGeometrica.modelo;

public class Quadrado extends FormaGeometrica{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        return (this.lado*this.lado);
    }
    @Override
    public double perimetro(){
        return (this.lado *4);
    }


}
