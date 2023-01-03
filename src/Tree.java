public class Tree {
    public static void main(String[] args) {
        String treeSign = "*";
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 18*2 ; j++) {
                if (j < (18 - i) || j > (18 + i)) {
                    System.out.print(" ");
            }
                else {
                    System.out.print(treeSign);
                }
        }
            System.out.println();
        }
    }
}
