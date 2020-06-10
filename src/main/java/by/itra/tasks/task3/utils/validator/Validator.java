package by.itra.tasks.task3.utils.validator;

import java.security.InvalidParameterException;

public interface Validator<T> {
    void isValid(T[] params) throws InvalidParameterException;
}
