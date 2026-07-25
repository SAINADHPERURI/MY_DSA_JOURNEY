import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First and last numbers of every row are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> previousRow = pascal.get(i - 1);

                    int leftNumber = previousRow.get(j - 1);
                    int rightNumber = previousRow.get(j);

                    row.add(leftNumber + rightNumber);
                }
            }

            pascal.add(row);
        }

        return pascal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = scanner.nextInt();

        List<List<Integer>> result = generate(numRows);

        System.out.println("Pascal's Triangle:");

        for (List<Integer> row : result) {
            System.out.println(row);
        }

        scanner.close();
    }
}