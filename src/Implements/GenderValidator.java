package Implements;

import Interface.Validator;

import java.util.Objects;

public class GenderValidator implements Validator {
    public String gender;

    public GenderValidator(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean isValid() {
        return Objects.equals(gender, "MALE") || Objects.equals(gender, "FEMALE");
    }
}


