package by.itra.tasks.task3;

import by.itra.tasks.task3.utils.ParametersValidator;

public class Game {
    public static void main(String[] args) {
        ParametersValidator validator = new ParametersValidator();
        if (!validator.isValid(args)) {
            return;
        }

        System.out.println("Parameters is true");

    }
}
