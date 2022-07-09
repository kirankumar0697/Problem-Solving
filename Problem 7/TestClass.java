import java.io.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        int matchsticks[] = new int[] {6,2,5,5,4,5,6,3,7,6};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder number = new StringBuilder("");

        while (testCase != 0) {
            int count = 0;
            String st = br.readLine();

            for (int i = 0; i < st.length(); i++) {
                count += matchsticks[st.charAt(i) - '0'];
            }

            if (count % 2 == 1) {
                number.append("7");
                count -= 3;

                for (int i = 0; i < count; i = i + 2) {
                    number.append("1");
                }
            } else {


                for (int i = 0; i < count; i = i + 2) {
                    number.append("1");
                }
            }

            number.append("\n");
            testCase = testCase - 1;
        }
        System.out.println(number);
    }
}