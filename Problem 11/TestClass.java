import java.util.*;

class TestClass {
    
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long product = 1L;
        for(int i=0; i<size; i++) {
            int num = sc.nextInt();
            product = (product * num) % 1000000007;
        }
        
        System.out.println(product);
        sc.close();
    }
}