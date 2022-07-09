import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;

        if ((str.charAt(0) + str.charAt(1)) % 2 != 0 || (str.charAt(3) + str.charAt(4)) % 2 != 0 || (str.charAt(4) + str.charAt(5)) % 2 != 0 || (str.charAt(7) + str.charAt(8)) % 2 != 0) {
            flag = false;
        }
        if (flag == true && (str.charAt(2) == 'A' || str.charAt(2) == 'E' || str.charAt(2) == 'I' || str.charAt(2) == 'O' || str.charAt(2) == 'U' || str.charAt(2) == 'Y')) {
            flag = false;
        }

        if (flag) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}