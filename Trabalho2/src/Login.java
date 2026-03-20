import java.util.Objects;
import java.util.Scanner;

public class Login{
    static Scanner entrada = new Scanner(System.in);
    public static boolean trysenha(int senha){
    int tentativa = entrada.nextInt();
    entrada.nextLine();
    if(tentativa == senha){
        return true;
    }
    return false;
    }
    public static boolean tryuser(String user){
        String tentativa = entrada.nextLine();
        if(Objects.equals(tentativa, user)){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        int senha = 1234;
        String user = "usuario";
        boolean logado = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Usuario: ");
            boolean userOk = tryuser(user);

            System.out.print("Senha: ");
            boolean senhaOk = trysenha(senha);

            if (userOk && senhaOk) {
                System.out.println("Login feito com sucesso");
                logado = true;
                break;
            }
        }
        if(!logado){
            System.out.println("Limite de tentativas atingido");

        }


    }
}