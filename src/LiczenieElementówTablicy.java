public class LiczenieElementówTablicy {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 5, 3, 6, 3, 7};
        int[] counters = new int[10];  //ilość elementow ktore moga znajdowac sie w naszym zbiorze

        for (int i = 0; i < arr.length ; i++) {
            counters[arr[i]]++;
        }
        int mostFrequent = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("counters[" + i + "] = " + counters[i]);
        }

    }
}
