package Implements;

import Interface.Validator;

import java.time.LocalDate;
import java.util.Objects;

public class ISODateValidator implements Validator {
    public LocalDate date;

    public ISODateValidator(LocalDate date){
        this.date = date;
    }

    @Override
    public boolean isValid() {
        return LocalDate.now().isAfter(this.date);
    }
}
