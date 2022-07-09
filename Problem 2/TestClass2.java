//Solution 2:
import java.util.Scanner;

class TestClass2 {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int zCount = 0;

        for (int i=0; i<name.length(); i++) {

            if (name.charAt(i) == 'z') {
                zCount++;
            } else {
                break;
            }
        }
        System.out.println(zCount * 2 == name.length() - zCount ? "Yes" : "No");
    }
}