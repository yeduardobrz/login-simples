package exercicios;

import java.util.Scanner;

public class Loginsimples {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);

        String loginCorreto = "admin";
        String senhaCorreta = "admin";

        String login, senha;
        int tentativas = 0;
        boolean acessoLiberado = false;

        System.out.println("Sistema de login");
        System.out.println("Voce tem no maximo 3 tentativas\n");

        while (tentativas < 3 && !acessoLiberado) {

            System.out.print("Digite o login: ");
            login = sc.next();

            System.out.print("Digite a senha: ");
            senha = sc.next();

            if (loginCorreto.equals(login) && senhaCorreta.equals(senha)) {
                System.out.println("Acesso permitido");
                acessoLiberado = true;
            } else {
                tentativas++;
                System.out.println("Acesso negado");
                System.out.println("Tentativas restantes: " + (3 - tentativas));
                System.out.println();
            }
        }

        if (!acessoLiberado) {
            System.out.println("Acesso bloqueado. Numero maximo de tentativas atingido.");
        }

        sc.close();
	}
}
