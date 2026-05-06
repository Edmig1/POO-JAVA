package br.com.unesp.FormaGeometrica.aplicacao;
import br.com.unesp.FormaGeometrica.modelo.*;

public class App{

    public static void main(String[] args){
        FormaGeometrica tri = new Triangulo(6,8,8,10);
        FormaGeometrica qua = new Quadrado(5);

        System.out.println("Área do Triangulo: " + tri.area());
        System.out.println("Área do Quadrado: " + qua.area());

        System.out.println("Perímetro do Triangulo: " + tri.perimetro());
        System.out.println("Perímetro do Quadrado: " + qua.perimetro());
    }


}