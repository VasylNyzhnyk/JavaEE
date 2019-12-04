

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        int max = mas[0];
        int min = mas[0];

        for (int i = 0; i < mas.length ; i++) {
            if (mas [i] > max )
                max = mas[i];
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas [i] > min)
                min = mas[i];
        }
        System.out.println(max + " " + min );
    }
}
