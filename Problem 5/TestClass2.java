//Solution2:
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class TestClass2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = newint[N];

        for (int i_A = 0; i_A < arr_A.length; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        String out_ = solve(A);
        System.out.println(out_);
        wr.close();
        br.close();
    }

    static String solve(int[] A) {
        int length = A.length;
        int finalNumber1 = 0;
        int finalNumber = 0;
        for (int i = 0; i < length / 2; i++) {
            int num = A[i];
            while (num / 10 != 0) {
                num = num / 10;
            }
            if (i % 2 == 0) {
                finalNumber1 = finalNumber1 + num;
            } else {
                finalNumber1 = finalNumber1 - num;
            }
        }

        if ((length / 2) % 2 == 0) {
            finalNumber = finalNumber1 + A[length / 2] % 10;
        } else {
            finalNumber = finalNumber1 - A[length / 2] % 10;
        }

        for(int i = (length / 2) + 1; i < length; i++) {
            if (i % 2 == 0) {
                finalNumber = finalNumber + A[i] % 10;
            } else {
                finalNumber = finalNumber - A[i] % 10;
            }
        }
        returnfinalNumber % 11 == 0 ? "OUI" : "NON";
    }
}