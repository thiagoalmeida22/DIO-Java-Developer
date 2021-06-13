import java.util.*;
// ESSA AQUI FUNCIONA, A OUTRA NÃO - MAS ELA NÃO TRATA INPUT ERRADO
// (STRING, NULL ETC de entrada na linha 13!
public class QuantidadeNumerosPositivos {

    public static void main(String[] args) {
        float numReader;
        int qtdPositivo = 0;
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.ENGLISH); // Faz o float ser considerado com "."(DOT) e não com ","(Virgula)

        for (int i = 0; i < 6; i++) {
                numReader = teclado.nextFloat();
                if (numReader > 0) {
                    qtdPositivo++;
                }
            }
        System.out.println(qtdPositivo + " valores positivos");
    }
}

