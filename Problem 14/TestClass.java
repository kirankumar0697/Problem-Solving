import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int facto = 1;

        for(int i=num; i>1; i--) {
            facto = facto * i;
        }
        System.out.print(facto);
    }
}
