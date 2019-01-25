package borrarr;

public class Borrarr {

    public static void main(String[] args) {
        int n = 4;
        int m;
        int a = 0;
        int sum = 0;
        int lastOdd = 0;

        if (n == 1) {
            System.out.println("1");
        } else {
            m = n * (n - 1);
            while (m >= 1) {
                if ((a + 1) % 2 != 0) {
                    System.out.println(a + 1);
                    lastOdd = a + 1;

                }
                a++;
                m--;
            }
        

        System.out.println("***" + lastOdd);
        for (int i = 1; i <= n; i++) {
            lastOdd+=2;
            sum+=lastOdd;
        }
        System.out.println(sum);

    }
    }

}
