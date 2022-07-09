import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag ? "YES" : "NO");
    }
}