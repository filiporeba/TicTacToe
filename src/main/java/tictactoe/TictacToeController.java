package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class TictacToeController {

    private Board gameState;
    private List<Player> players;
    private Judge judge;

    public TictacToeController(Player firstPlayer, Player secondPlayer) {
        this.gameState = new Board(3,3);
        this.gameState.displayBoard();
        this.players = new ArrayList<Player>();
        this.players.add(firstPlayer);
        this.players.add(secondPlayer);
        this.judge = new Judge(this.gameState);

    }

    public void start() {
        int moveCounter = 0;
        Player currentPlayer;
        while (!judge.endGame()) {
            currentPlayer = players.get(moveCounter % 2);
            int move = currentPlayer.getMove(gameState);

            if (!MoveValidator.isValid(gameState, move)) {
                System.out.println("Nieprawidłowy ruch");
                continue;
            }
            gameState.putPawn(move, currentPlayer.getPawn());
            gameState.displayBoard();

            judge.setGameState(gameState);
            moveCounter++;
        }
        System.out.println("Koniec gry!");
        for( Player player : players) {
            if(judge.isWinFor(player.getPawn())) {
                System.out.println("Wygrał gracz " + player.getPawn().getName());
            } else if (judge.isDraw()) {
                System.out.println("Remis");
            }
        }
        System.out.println();
    }
}
