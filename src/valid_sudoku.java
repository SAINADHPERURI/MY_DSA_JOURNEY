import java.util.*;

public class valid_sudoku {

    public static boolean isValidSudoku(char[][] board) {

        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        // Create HashSet for each row, column, and box
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Visit every cell
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                // Ignore empty cells
                if (board[r][c] == '.') {
                    continue;
                }

                char num = board[r][c];

                // Find the 3x3 box
                int box = (r / 3) * 3 + (c / 3);

                // Check duplicate
                if (rows[r].contains(num) ||
                        cols[c].contains(num) ||
                        boxes[box].contains(num)) {

                    return false;
                }

                // Add number to row, column and box
                rows[r].add(num);
                cols[c].add(num);
                boxes[box].add(num);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},

                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},

                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean result = isValidSudoku(board);

        System.out.println("Is Sudoku valid? " + result);
    }
}