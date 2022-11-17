package Implements;

import Interface.Validator;

public abstract class IdValidator implements Validator {
    @Override
    public boolean isValid(String id) {
        return id.length() < 4;
    }
}
