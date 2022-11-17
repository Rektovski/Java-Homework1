package Implements;

import Interface.Validator;

import java.util.Objects;

public abstract class GenderValidator implements Validator {
    @Override
    public boolean isValid(String gender) {
        return Objects.equals(gender, "MALE") || Objects.equals(gender, "FEMALE");
    }
}


