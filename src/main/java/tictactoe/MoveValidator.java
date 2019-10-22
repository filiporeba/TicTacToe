package tictactoe;

public class MoveValidator {

    public static boolean isValid(Board board, int move) {
        Pawn pawn;

        try {
            if (board.getPawn(move) != null) {
                return false;
            }
        } catch (invalidFieldNumberException e) {
            return false;
        }

        return  true;
    }
}
