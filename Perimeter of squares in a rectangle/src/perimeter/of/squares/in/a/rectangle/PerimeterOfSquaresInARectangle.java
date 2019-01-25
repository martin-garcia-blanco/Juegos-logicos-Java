package perimeter.of.squares.in.a.rectangle;

import java.math.BigInteger;
import java.util.ArrayList;

public class PerimeterOfSquaresInARectangle {

    public static void main(String[] args) {
        BigInteger n = new BigInteger("1");
        BigInteger m = n.add(n);
        BigInteger cuatro = new BigInteger("4");

        long sum = 0;
        ArrayList lista = new ArrayList();
        if (m.equals(1)) {
            m = m.multiply(cuatro);
            System.out.println(m);
        } else if (m.equals("2")) {
            m = m.multiply(cuatro);
            System.out.println(m);
            
            //hasta aqui esta bien, tengo que seguir currando en bigInteger.
        } else {
            BigInteger x=new BigInteger("");
            lista.add("1");
            lista.add("1");
            for (int i = 2; i < m.intValue(); i++) {
                lista.add(((int) lista.get(i - 2)) + ((int) lista.get(i - 1)));
            }
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
                sum += (int) lista.get(i);
            }
            System.out.println(sum * 4);
        }

    }

}
