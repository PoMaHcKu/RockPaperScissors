package by.itra.tasks.task3.players;

public abstract class Player {

    protected final String[] moves;
    protected String selectedMove;

    public Player(String[] moves) {
        this.moves = moves;
    }

    public String getSelectedMove() {
        return selectedMove;
    }

    public abstract void doMove();
}
