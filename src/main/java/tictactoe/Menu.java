package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<String> menuElements = new ArrayList<String>();

    public String getChoice() {
        this.displayMenu();

        return menuElements.get(getInputChoice());
    }

    private int getInputChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt() - 1;
    }

    private void displayMenu() {
        for(int i = 0; i < menuElements.size(); i++) {
            System.out.println(i+1 + ", " + menuElements.get(i));
        }
    }

    public void addElement(String element) {
        this.menuElements.add(element);
    }
}
