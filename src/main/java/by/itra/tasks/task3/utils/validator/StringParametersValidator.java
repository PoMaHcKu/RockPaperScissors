package by.itra.tasks.task3.utils.validator;

import java.util.Arrays;

public class StringParametersValidator implements Validator<String> {
    @Override
    public boolean isValid(String[] params) {
        if (params.length % 2 == 0 || params.length < 3) {
            System.out.println("Incorrect count of parameters.");
            return false;
        } else if (isHasSameParameters(params)) {
            System.out.println("There is one or more same parameters.");
            return false;
        }
        return true;
    }

    private boolean isHasSameParameters(String[] params) {
        return Arrays.stream(params).map(String::toLowerCase).distinct().count() != params.length;
    }
}
