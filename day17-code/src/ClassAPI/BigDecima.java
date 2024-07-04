package ClassAPI;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecima {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.012");
//        double a1 = 0.09;
//        double a2 = 0.01;
//        System.out.println(bd1);
//        System.out.println(a2+a1);
//        System.out.println(bd2.add(bd1));
//        BigDecimal bd3=BigDecimal.valueOf(3.0);
        BigDecimal bd3 = bd1.divide(bd2,2, RoundingMode.HALF_UP);
        System.out.println(bd3);

    }
}
