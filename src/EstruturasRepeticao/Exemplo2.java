package EstruturasRepeticao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String senha;

        do{
            System.out.println("digite uma senha: ");
            senha = teclado.nextLine();

            if (!senha.equals("123"));
            System.out.println("senha incorreta");
        }
        while (!senha.equals("123"));

        System.out.println("senha correta");
    }

}
