import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String village = sc.nextLine();
        String str = village;
        boolean flag = true;

        for (int i=0; i<village.length() - 1; i++) {
            if(village.charAt(i) == 'H' && village.charAt(i + 1) == 'H') {
                System.out.println("NO");
                flag = false;
                break;
            }
            else if(village.charAt(i) == '.') {
                str = str.substring(0, i) + 'B' + str.substring(i + 1);
            }
        }

        if(flag) {
            System.out.println("YES");
            if (str.charAt(str.length() - 1) == '.') {
                str = str.substring(0, str.length() - 1) + 'B';
            }
            System.out.println(str);
        }
    }
}