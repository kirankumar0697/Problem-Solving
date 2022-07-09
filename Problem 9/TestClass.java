import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
        sc.close();
    }
}