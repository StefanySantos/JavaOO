package EstruturasRepeticao;

import java.io.InterruptedIOException;

public class Exemplo3 {
    public static void main(String[] args)throws InterruptedException {

        String [] listaCarros = {"Fusca", "SP2", "Maverick", "Gt40"};

        for (String cadaCarro: listaCarros) {
            System.out.println(cadaCarro);
            Thread.sleep(3000); //time para ler a lista, cada elemento vai aparecer apos 3 segundos
        }
    }
}
