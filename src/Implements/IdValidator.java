package Implements;

import Interface.Validator;

public class IdValidator implements Validator {
    public String id;

    public IdValidator(String id) {
        this.id = id;
    }

    @Override
    public String getInfo() {
        return "ID: " + id;
    }

    public boolean isValid() {
        return this.id.length()==11;
    }
}
