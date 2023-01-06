public class Tree {
    public static void main(String[] args) {

        //char[] treeElements = {43, 46, 42, 126, 94, 111};
        char c = 126;
        int height = 18;

            for (int j = 0; j < height; j++) {
                for (int k = 0; k < height * 2; k++) {
                    if (k < (height - j) || k > (height + j)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
            }
        }



// ASCII: ‘+’, ‘.’, ‘*’, ‘~’, ‘^’, ‘o’.
// char = 43, 46, 42, 126, 94, 111,
