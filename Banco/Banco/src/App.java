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
    }

}