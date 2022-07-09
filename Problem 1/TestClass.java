import java.util.*;

class TestClass {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0; i<testCase; i++) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int max = 0;

            for (int j = 0; j < rows; j++) {
                int count = 0;
                String inputString = sc.next();
                for (int k = 0; k < cols; k++) {
                    if ('#' == inputString.charAt(k)) {
                        count = count + 1;
                        if (k + 1 < cols && '#' != inputString.charAt(k + 1)) {
                            break;
                        }
                    }
                }

                if (count > max) {
                    max = count;
                }
            }
            System.out.println(max);
        }
    }
}