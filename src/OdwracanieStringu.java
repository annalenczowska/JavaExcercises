public class OdwracanieStringu {
    public static void main(String[] args) {
        String name = "Koczka"; //indeksy: K - 0, O - 1, C - 2, Z - 3, K - 4,A - 5

        for (int i = name.length() - 1; i >= 0; i--) {   //zaczynamy od największego indeksu, pętla się dekrementuje
            System.out.print(name.charAt(i));           // wyświel znaki na poszczególnych pozycjach indeksu

            
        }
    }
}
