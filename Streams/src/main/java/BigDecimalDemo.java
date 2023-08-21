import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // Use BigDecimal for exact calculations to get precise not like normal double or float
        double d1 = 174.56;
        double d2 = 174.26;

        System.out.println(d1-d2);

        BigDecimal b1 = new BigDecimal("174.56"); // we are passing constructors with String to get more precise results
        BigDecimal b2 = new BigDecimal("174.26");

        System.out.println(b1.subtract(b2)); // use subtract method because these are Object not primitive types

        //Scaling and Rounding
        BigDecimal number1 = new BigDecimal(23.12);
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(2,RoundingMode.CEILING));
        System.out.println(number1.setScale(2,RoundingMode.FLOOR));

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));

        //BigDecimals are immutable




    }
}
