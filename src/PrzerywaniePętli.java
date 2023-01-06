public class PrzerywaniePętli {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            if (i % 2 == 1) {   //liczba nieparzysta
                continue;               //pętla przerywa działanie i przechodzi do następnego kroku, jej wykonanie jest pominięte
            }
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for (int j = 0; j < 10; j++) {

            if (j % 2 == 1) {   //liczba nieparzysta
                break;          //całkowicie kończy pętlę
            }
            System.out.println(j);
            System.out.print(" ");
        }

        /* for(String city : citiesList) {
            if(city.equals("Warszawa")) {
                break;
            }
            System.out.println(city);
        }
       Pętla zatrzyma się, jeśli na liście znajduje się Warszawa.
       Natomiast jeśli Warszawa będzie pierwsza na liście, to pętla zakończy
       się zanim cokolwiek się wyświetli.
         */

        out:
        for (int k = 0; k < 10; k++) {         //out to nzwa etykiety zewnętrzej
            for (int x = 0; x < 50; x++) {
                System.out.println(k + " " + x);
                break out;
            }
        }
    }
}
