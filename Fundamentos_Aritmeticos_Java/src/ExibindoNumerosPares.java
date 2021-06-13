import java.io.IOException;
import java.util.*;

public class ExibindoNumerosPares{

public static void main(String[] args) throws IOException {
    int numReader;
    Scanner teclado = new Scanner(System.in);
    numReader = teclado.nextInt();
        for (int i = 1 ; i <= numReader ; i++) {
        if (i%2 == 0) {System.out.println(i);}
        }
    }
}