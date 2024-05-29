import java.util.Scanner;

public class PuzzleGame {
    private static final int SIZE = 3;
    private static final int[][] goalState = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
    };
    private int[][] board;

    public PuzzleGame() {
        board = new int[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        shuffleArray(values);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = values[i * SIZE + j];
            }
        }
    }

    private void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean move(int number) {
        int[] position = findPosition(number);
        int[] zeroPosition = findPosition(0);

        if (position == null) {
            return false;
        }

        int rowDiff = Math.abs(position[0] - zeroPosition[0]);
        int colDiff = Math.abs(position[1] - zeroPosition[1]);

        if (rowDiff + colDiff == 1) {
            board[zeroPosition[0]][zeroPosition[1]] = number;
            board[position[0]][position[1]] = 0;
            return true;
        }

        return false;
    }

    private int[] findPosition(int number) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == number) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public boolean isSolved() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != goalState[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PuzzleGame game = new PuzzleGame();

        while (true) {
            System.out.println("Current board:");
            game.printBoard();

            if (game.isSolved()) {
                System.out.println("Congratulations! You solved the puzzle!");
                break;
            }

            System.out.print("Enter the number you want to move (or 0 to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Exiting the game. Goodbye!");
                break;
            }

            if (!game.move(number)) {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }
}
