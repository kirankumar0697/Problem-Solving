//Solution 1
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int zCount = 0, oCount = 0;

        for (int i=0; i<name.length(); i++) {
            if (name.charAt(i) == 'z') {
                zCount++;
            } else {
                oCount++;
            }
        }
        System.out.println(zCount * 2 == oCount ? "Yes" : "No");
    }
}