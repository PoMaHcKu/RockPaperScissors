package by.itra.tasks.task3;

import by.itra.tasks.task3.utils.ParametersValidator;

import java.security.SecureRandom;

public class Game {
    public static void main(String[] args) {
        ParametersValidator validator = new ParametersValidator();
        if (!validator.isValid(args)) {
            return;
        }

        String cpuSelection = args[getRandomNumber(args.length)];
    }

    private static int getRandomNumber(int bound) {
        SecureRandom random = new SecureRandom();
        return random.nextInt(bound);
    }
}
