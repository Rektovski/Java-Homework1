package Implements;

import Interface.Validator;

import java.time.LocalDate;
import java.util.Objects;

public abstract class ISODateValidator implements Validator {
    @Override
    public boolean isValid(LocalDate date) {
        return LocalDate.now().isAfter(date);
    }
}
