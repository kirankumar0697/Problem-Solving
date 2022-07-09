//Solution1:
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class TestClass {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = newint[N];

        for (inti_A = 0; i_A < arr_A.length; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        String out_ = solve(A);
        System.out.println(out_);
        wr.close();
        br.close();
    }

    static String solve(int[] A) {

        int length = A.length;
        double finalNumber = 0;

        for (int i = 0; i < length / 2; i++) {
            int num = A[i];

            while(num / 10 != 0) {
                num = num / 10;
            }
            finalNumber = finalNumber * 10 + num;
        }

        for (int i = length / 2; i < length; i++) {
            finalNumber = finalNumber * 10 + A[i] % 10;
        }
        returnfinalNumber % 11 == 0 ? "OUI" : "NON";
    }
}