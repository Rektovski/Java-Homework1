package Interface;

import java.time.LocalDate;

public interface Validator {
    public boolean isValid(String text);
    public boolean isValid(LocalDate text);
}
