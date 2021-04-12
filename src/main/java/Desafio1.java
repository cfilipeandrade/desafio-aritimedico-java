import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio1 {

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            //declare suas variaveis
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            br.close();

        //declare suas variaveis com o valor correto
        int menorN = -1;

        //continue o codigo
        for(int i = 1; i <= C/A; i++){
            int n = A*i;
            if (n % A == 0 && n % B != 0 && C % n ==0 && D % n != 0) {
                menorN = n;
                break;
            }
        }
        System.out.println(menorN);
    }
}
