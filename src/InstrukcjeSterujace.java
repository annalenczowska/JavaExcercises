import javax.sound.midi.Soundbank;

public class InstrukcjeSterujace {
    public static void main(String[] args) {

        // Instrukcja warunkowa If
        int a = 3;

                if (a < 3){
                    System.out.println("a mniejsze niż 3");
                } else if (a > 3){
                    System.out.println("a większe niz 3");
                } else {
                    System.out.println("a równe 3");
                };

        char grade = 'E';

        if (grade == 'A') {
            System.out.println("Wspaniale!");
        } else if (grade == 'B') {
            System.out.println("Dobrze!");
        } else if (grade == 'C') {
            System.out.println("Mogło być lepiej!");
        } else {
            System.out.println("Rozważ oszukiwanie");
        }


        // Instrukcja warunkowa Switch
        String read = "książki";
        switch (read) {
            case "komiksy":
                System.out.println("Chętnie czytam komiksy");
                break;
            case "książki":
                System.out.println("Chętnie czytam książki");
                break;
            default:
                System.out.println("Wszystko czytam");
        }

        //Wyrażenie warunkowe switch

        //Operator trójargumentowy
        //arg1 ? arg 2: arg 3
        //arg 1 - warunek, arg 2 wykona sie gdy warunek jest prawdziwy, arg 3 wykona się gdy warunek fałszywy

        int myScore = 60;
        int yourScore = 50;

        int ourBestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println(ourBestScore);



    }
}
