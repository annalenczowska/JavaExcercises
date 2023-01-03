

public class SprawdzanieStringu {
    public static void main(String[] args) {

        String str = "Mama Muminka smaży naleśniki";
        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu wynosi: " + str.length());
        System.out.println("Znak na pozycji 6 to: " + str.charAt(5));
        System.out.println("Fragment tekstu od znaku 13 do znaku 18 to: " + str.substring(13, 18));
        System.out.println("Indeks pierwszej występującej litery 'u': " + str.indexOf('u'));
        System.out.println("Indeks początku słowa \"smaży\": " + str.indexOf("smaży"));   // \ = znak ucieczki
        System.out.println("Tekst dużymi literami: " + str.toUpperCase());



    }
}
