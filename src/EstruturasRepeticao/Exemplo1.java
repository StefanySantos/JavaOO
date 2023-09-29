package EstruturasRepeticao;

public class Exemplo1 {
    public static void main(String[] args) {

        String[] listaProfessores = {"Alexia", "Odirlei", "Jessica", "Thiago"};

        for (int contador = 0; contador < listaProfessores.length ; contador++) {

            if (contador == 0){
                System.out.println("o indice do professor é " + listaProfessores[contador] + " é Zero");
            } else if (contador % 2 ==0 ) {
                System.out.println("o indice do professor é " + listaProfessores[contador] + " é par");
            }else{
                System.out.println("o indice do professor é " + listaProfessores[contador] + " é impar");
            }

        }
    }
}
