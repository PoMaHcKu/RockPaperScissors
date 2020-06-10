package by.itra.tasks.task3.process;

import java.security.SecureRandom;

public class CpuOpponent {

    private final String[] steps;
    private String selectedMove;

    public CpuOpponent(String[] steps) {
        this.steps = steps;
    }

    public String getSelectedMove() {
        return selectedMove;
    }

    public void doMove() {
        SecureRandom random = new SecureRandom();
        selectedMove = steps[random.nextInt(steps.length)];
    }
}
