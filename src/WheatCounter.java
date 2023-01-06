import java.math.BigInteger;

public class WheatCounter {
    public static void main(String[] args) {

        int squares = 64;

        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 1; i <= squares; i++) {
            System.out.println("Ilość ziaren pszenicy na kwadracie " + i + " wynosi " + sum + ".");
            sum = sum.multiply(BigInteger.valueOf(2));
        }
        System.out.println();
        System.out.println("Łączna liczba ziaren pszenicy wynosi: " + sum + ".");
    }
}



