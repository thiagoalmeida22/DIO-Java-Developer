import java.util.*;
// Funciona, mas ela não checa se os inputs da linha 13 são inputs validos
// e.g: se for passado o parametro null ou "asasasas" o programa não ignora esse valor
// gostaria que ao passar um parametro errado, o index aumentasse e nada mais fosse feito ate o loop repetir
// ou seja, o programa so checaria o sinal de 5...4...3..etc numeros
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

