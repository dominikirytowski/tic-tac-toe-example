package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Game {

    private final static Scanner scanner = new Scanner(System.in);
    private boolean running = true;
    private final TicTacToe ticTacToe = new TicTacToe();
    private final ComputerAI computerAI = new ComputerAI();
    private final List<Coordinates> usedCoordinates = new ArrayList<>();

    public void runGame() {
        Player player;
        Player computer;
        System.out.println("Choose X or O to start game: ");
        String mark = scanner.nextLine();

        if (mark.toUpperCase(Locale.ROOT).equals("X")) {
            player = new Player(Mark.PLAYER_ONE);
            computer = new Player(Mark.PLAYER_TWO);
        } else if (mark.toUpperCase(Locale.ROOT).equals("O")) {
            player = new Player(Mark.PLAYER_TWO);
            computer = new Player(Mark.PLAYER_ONE);
        } else {
            throw new IllegalStateException("Wrong mark. Choose X or O");
        }

        for (int i = 1; i != 0; i++) {
            if (i % 2 == 0) {
                computerTurn(computer);
            } else {
                ticTacToe.printBoard();
                playerTurn(player);
            }
        }
    }

    private void playerTurn(Player player) {
        int x, y;

        System.out.println("Pass coordinates x and y");
        try {
            x = Integer.parseInt(scanner.nextLine());
            y = Integer.parseInt(scanner.nextLine());
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Wrong input! Should be positive integer number in range <1," + ticTacToe.getBOARD_SIZE() + ">");
        }

        ticTacToe.markField(new Coordinates(x, y), player);
        usedCoordinates.add(new Coordinates(x, y));
    }

    private void computerTurn(Player computer) {
        Coordinates coordinates = computerAI.generateCoordinates();
        if (usedCoordinates.contains(coordinates)) {
            computerTurn(computer);
        } else {
            ticTacToe.markField(coordinates, computer);
        }
        usedCoordinates.add(coordinates);
    }
}
