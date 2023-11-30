import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Board board = new Board();
        board.initialize();
        board.print();

        Scanner scanner = new Scanner(System.in);

        while (!board.isGameFinished()) {
            System.out.print("Enter your move (e.g., 'e2 e4'): ");
            String move = scanner.nextLine();

            if (board.isValidMove(move)) {
                board.makeMove(move);
                board.print();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        System.out.println("Game Over. " + board.getGameResult());
        scanner.close();
    }
}

class Board {
    private char[][] grid;

    public void initialize() {
        // Initialize the chessboard
        // 'r' and 'R' represent rooks, 'n' and 'N' represent knights, etc.
        grid = new char[][]{
            {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
        };
    }

    public void print() {
        // Print the current state of the chessboard
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isValidMove(String move) {
        // Implement logic to validate if the move is legal
        // For simplicity, assume all moves are valid in this example
        return true;
    }

    //This is my second commit

    public void makeMove(String move) {
        // Implement logic to update the chessboard after a move
        // For simplicity, assume all moves are valid in this example
    }

    public boolean isGameFinished() {
        // Implement logic to check if the game is finished
        // For simplicity, assume the game is never finished in this example
        return false;
    }

    public String getGameResult() {
        // Implement logic to determine the game result
        // For simplicity, assume the game result is always a draw in this example
        return "It's a draw!";
    }
}
