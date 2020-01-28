import java.sql.SQLOutput;
import java.util.Scanner;

public class mArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array of rows and columns
        String[][] rowsColumns = new String[10][5];

        rowsColumns[0][0] = "";
        rowsColumns[0][1] = "";
        rowsColumns[0][2] = "";
        rowsColumns[0][3] = "";
        rowsColumns[0][4] = "";

        rowsColumns[1][0] = "";
        rowsColumns[1][1] = "";
        rowsColumns[1][2] = "";
        rowsColumns[1][3] = "";
        rowsColumns[1][4] = "";

        rowsColumns[2][0] = "";
        rowsColumns[2][1] = "";
        rowsColumns[2][2] = "";
        rowsColumns[2][3] = "";
        rowsColumns[2][4] = "";

        rowsColumns[3][0] = "";
        rowsColumns[3][1] = "";
        rowsColumns[3][2] = "";
        rowsColumns[3][3] = "";
        rowsColumns[3][4] = "";

        rowsColumns[4][0] = "";
        rowsColumns[4][1] = "";
        rowsColumns[4][2] = "";
        rowsColumns[4][3] = "";
        rowsColumns[4][4] = "";

        rowsColumns[5][0] = "";
        rowsColumns[5][1] = "";
        rowsColumns[5][2] = "";
        rowsColumns[5][3] = "";
        rowsColumns[5][4] = "";

        rowsColumns[6][0] = "";
        rowsColumns[6][1] = "";
        rowsColumns[6][2] = "";
        rowsColumns[6][3] = "";
        rowsColumns[6][4] = "";

        rowsColumns[7][0] = "";
        rowsColumns[7][1] = "";
        rowsColumns[7][2] = "";
        rowsColumns[7][3] = "";
        rowsColumns[7][4] = "";

        rowsColumns[7][0] = "";
        rowsColumns[7][1] = "";
        rowsColumns[7][2] = "";
        rowsColumns[7][3] = "";
        rowsColumns[7][4] = "";

        rowsColumns[8][0] = "";
        rowsColumns[8][1] = "";
        rowsColumns[8][2] = "";
        rowsColumns[8][3] = "";
        rowsColumns[8][4] = "";

        rowsColumns[9][0] = "";
        rowsColumns[9][1] = "";
        rowsColumns[9][2] = "";
        rowsColumns[9][3] = "";
        rowsColumns[9][4] = "";

        //  nested for loop asking for input
        for (int r = 0; r < 10; r++){
            for (int c = 0; c < 5; c++){
                System.out.println("Please enter a number: ");
                rowsColumns[r][c] = sc.nextLine();
            }
        }
        // nested for loop to display the values of the multidimensional array
        for (int r = 0; r < 10; r++){
            for (int c = 0; c < 5; c++){
                System.out.println(rowsColumns[r][c]);
            }
        }
    }
}
