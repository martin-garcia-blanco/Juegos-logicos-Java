package bit.counting;

import java.util.ArrayList;

public class BitCounting {

    public static void main(String[] args) {
        int n = 1234;
        int m;
        int sum=0;
        String strN = "";
        String fina = "";
        while (n >= 1) {
            m = n % 2;
            n = n / 2;
            if (m==1) {
                sum++;
            }
        }
        

        System.out.println(sum);
       
    }

}
