public class BityWBajcie {
    public static void main(String[] args) {
        for (int j = 1, sum = 1; j <= 128; j = j * 2, sum += j) {
            System.out.printf("j = %d, sum = %d%n", j, sum);
        }

    }
}
