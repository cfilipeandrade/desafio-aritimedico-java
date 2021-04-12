import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        int numeros =sc.nextInt();
        while(numeros --> 0)
            list.add(sc.nextInt());

        SortedMap<Integer, Integer> quantidade = new TreeMap<>();
        list.forEach(id -> quantidade.compute(id, (key , val) -> (val == null ? 1 : val  + 1)));

        quantidade.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}
