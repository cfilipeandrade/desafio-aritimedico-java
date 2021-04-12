import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        int par = 0;
        int impar = 0;
        int pos = 0;
        int neg = 0;
        int entrada;

        //continue a solução
        while (leitor.hasNextInt()) {
            entrada = leitor.nextInt();
            if (entrada % 2 == 0){
                par++;
            }
            if (entrada % 2 != 0){
                impar++;
            }
            if (entrada > 0) {
                pos++;
            }
            if (entrada < 0) {
                neg++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
