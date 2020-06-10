package by.itra.tasks.task3;

import by.itra.tasks.task3.process.GameProcess;

public class Game {

    private final GameProcess process;

    public Game(String[] moves) {
        this.process = new GameProcess(moves);
    }

    public static void main(String[] args) {
        Game game = new Game(args);
        game.process.start();
    }
}
