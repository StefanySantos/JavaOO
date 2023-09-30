package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio_Idade {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int idade;

        do {
            System.out.println("digite sua idade: ");
            idade = teclado.nextInt();

            System.out.println("idade invalida");

        }while (idade < 18);
        System.out.println("maior que 18 anos");
    }
}
