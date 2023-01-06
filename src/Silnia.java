import java.math.BigInteger;

public class Silnia {
    public static void main(String[] args) {

        int number = 5;  //silnia: 1 * 2 * 3 * 4 * 5
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++ ){
            factorial = factorial.multiply(BigInteger.valueOf(i));  //multiply - metoda mnożenia

        }
        System.out.printf("%d! = %s%n", number, factorial);

    }

}
