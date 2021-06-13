import java.io.*;
import java.util.StringTokenizer;
// OLHAR MAIN2 PARA ALGO QUE FUNCIONE
public class main {

    public static void main(String[] args) throws IOException {
        int numOne, numTwo, numThree, numFour, numFive, numSix, qtdPositivo = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
                numOne = Integer.parseInt(st.nextToken());
                if (numOne > 0) {
                    qtdPositivo++;
                }
            }
        System.out.println(qtdPositivo + " valores positivos");
    }
}

