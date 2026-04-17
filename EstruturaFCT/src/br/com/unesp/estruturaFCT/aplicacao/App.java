package br.com.unesp.estruturaFCT.aplicacao;
import br.com.unesp.estruturaFCT.modelo.*;

import java.util.Scanner;

public class App{
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        boolean cont = true;
        Universidade univ = new Universidade("FCT UNESP");
        Departamento dept1 = new Departamento("#199","DMC","(18)4002-8922");
        Funcionario func1 = new Funcionario("Pedro","1",100.0);
        Funcionario func2 = new Funcionario("Paulo","2",140.0);
        dept1.adicionaFuncionario(func1);
        dept1.adicionaFuncionario(func2);
        dept1.exibeDepartamento();
        dept1.removaFuncionario(func2);
        dept1.exibeDepartamento();

    }
}
