import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner sc = newScanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int price1 = sc.nextInt();
            int price2 = sc.nextInt();
            int lines = sc.nextInt();
            int amount = 0;
            List < Integer > contest1 = newArrayList<>(lines);
            List < Integer > contest2 = newArrayList<>(lines);

            for (int j = 0; j < lines; j++) {
                contest1.add(sc.nextInt());
                contest2.add(sc.nextInt());
            }
            contest1.removeAll(Arrays.asList(0));
            contest2.removeAll(Arrays.asList(0));

            if (contest1.size() < contest2.size()) {
                if (price1 < price2) {
                    amount = contest1.size() * price2;
                    amount = amount + contest2.size() * price1;
                } else {
                    amount = contest1.size() * price1;
                    amount = amount + contest2.size() * price2;
                }
            } else {
                if (price1 < price2) {
                    amount = contest2.size() * price2;
                    amount = amount + contest1.size() * price1;
                } else {
                    amount = contest2.size() * price1;
                    amount = amount + contest1.size() * price2;
                }
            }
            System.out.println(amount);
        }
    }
}