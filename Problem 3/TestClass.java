import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        int[] data = newint[N];

        for (int i = 0; i < N; i++) {
            data[i] = s.nextInt();
        }
        System.out.println(data[N - 1] % 10 == 0 ? "Yes" : "No");
    }
}