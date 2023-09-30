import java.math.BigDecimal;
import java.math.RoundingMode;

public class Big_Decimal {
    public static void main(String[] args) {

        double x = 0.03;
        double y = 0.04;
        double ans = y - x;
        System.out.println(ans); // This is not an exact answer due to double precision limitations

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");

        BigDecimal Add = Y.add(X);
        BigDecimal Sub = Y.subtract(X);
        BigDecimal Mul = Y.multiply(X);
        BigDecimal Div = Y.divide(X, 10, RoundingMode.HALF_UP);
        BigDecimal Rem = Y.remainder(X);

        System.out.println("Addition: " + Add);
        System.out.println("Subtraction: " + Sub);
        System.out.println("Multiplication: " + Mul);
        System.out.println("Division: " + Div);
        System.out.println("Remainder: " + Rem);

        System.out.println(X.pow(2));
        System.out.println(X.negate());
    }
}
