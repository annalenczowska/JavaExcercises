public class StringTokenizer {

    public static void main(String[] args) {
        java.util.StringTokenizer str1, str2;

        String quote1 = "WSS 847 736";
        str1 = new java.util.StringTokenizer(quote1);

        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());

        String quote2 = "HHH-222-333";
        str2 = new java.util.StringTokenizer(quote2, "-");

        System.out.println("Token 1: " + str2.nextToken());
        System.out.println("Token 2: " + str2.nextToken());
        System.out.println("Token 3: " + str2.nextToken());


    }
}
