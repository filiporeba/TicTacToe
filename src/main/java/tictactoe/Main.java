package tictactoe;

public class Main {
    public static final String NEW_AI_GAME = "Nowa gra z komputerem";
    public static final String NEW_HUMAN_GAME = "Nowa gra z drugim graczem";
    public static final String EXIT = "Wyjscie";

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.addElement(NEW_AI_GAME);
        menu.addElement(NEW_HUMAN_GAME);
        menu.addElement(EXIT);

        mainLoop:
        while (true) {
            switch (menu.getChoice()) {
                case NEW_AI_GAME:
                    TictacToeController game = new TictacToeController(
                            new HumanPlayer(new XPawn()),
                            new AIPlayer(new OPawn()));
                    game.start();
                    break;
                case NEW_HUMAN_GAME:
                    //
                    break;
                case EXIT:
                    break mainLoop;
            }
        }
    }
}
