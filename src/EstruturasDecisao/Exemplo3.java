package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome, senha;

        System.out.println("Digite seu nome de usuario: ");
        nome = teclado.nextLine();
        System.out.println("Digite a senha: ");
        senha = teclado.nextLine();

        if (nome.equals("admin") && senha.equals("senha123")){
            System.out.println("login bem sucedido");
        }else {
            System.out.println("nome ou usuario incorretos");
        }

    }
}
