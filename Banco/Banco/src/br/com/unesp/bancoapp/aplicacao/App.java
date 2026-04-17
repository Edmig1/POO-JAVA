package br.com.unesp.bancoapp.aplicacao;
import br.com.unesp.bancoapp.modelo.*;
import br.com.unesp.bancoapp.servico.ControleBonificacoes;


public class App{

    public static void main( String[] args){
        Cliente cliente1 = new Cliente("Aura Reels da Silva Shorts","10");
        Conta c1 = new Conta(1,cliente1);
        //c1.saldo = 67;

        Cliente cliente2 = new Cliente("Maria Juana","11");
        Conta c2 = new Conta(2,cliente2);
        //c1.saldo = 241;

        System.out.println("Nome: "+c1.getTitular().getNome() + "\n" +"Número da conta: "+c1.getNumero()+ "\n" +"Saldo da conta: "+c1.getSaldo() +"\n");

        System.out.println("Nome: "+c2.getTitular().getNome() + "\n" +"Número da conta: "+c2.getNumero()+ "\n" +"Saldo da conta: "+c2.getSaldo()+"\n");

        c1.deposita(10);
        System.out.println("Valores após o depósito: " +c1.getSaldo());
        c2.saca(5);
        System.out.println("Valores após o saque: " +c2.getSaldo());

        if(c1.transfere(c2,10)){
            System.out.println("Valores após a transferência: " +c1.getSaldo()+" | "+c2.getSaldo());
        }else{
            System.out.println("Saldo insuficiente para tal transferência");
        }
        Gerente gerente1 = new Gerente("Jorge Marques","40028922", 100.0,5.0);
        System.out.println("Nome do gerente: "+ gerente1.getNome());
        Funcionario funcionario1 = new Funcionario("Xi Jinping","123163", 20.0);
        System.out.println("Nome do funcionário: "+ funcionario1.getNome());

        ControleBonificacoes controle = new ControleBonificacoes();
        controle.registraBonificacao(funcionario1);
        controle.registraBonificacao(gerente1);
        System.out.println("Bonificação dos funcionario: " + controle.getTotalBonificacao());

    }

}