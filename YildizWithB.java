//import java.util.Scanner;
public class YildizWithB {

    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int row = 0; row < letter.length; row++) {
            for (int col = 0; col < letter[row].length; col++) {
                if (col == 0 || row == 0 || row == letter.length / 2 || row == letter.length - 1
                        || (col == letter[row].length - 1 && (row <= letter[row].length / 2||row <= letter[row].length))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                
            }
            System.out.println();

        }
    }
}