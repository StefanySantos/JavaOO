package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero, para verificar se é positivo ou negativo: ");
        int numero = teclado.nextInt();

        if (numero > 0){
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        }else {
            System.out.println("neutro");
        }
    }
}
