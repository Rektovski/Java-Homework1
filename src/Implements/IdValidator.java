package Implements;

import Interface.Validator;

public class IdValidator implements Validator {
    public String id;

    public IdValidator(String id) {
        this.id = id;
    }

    public boolean isValid() {
        return this.id.length()==11;
    }
}
