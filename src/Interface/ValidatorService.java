package Interface;

import Exceptions.ValidatorException;
import Implements.Person;

import java.util.List;

public class ValidatorService {
    public static void validate(List<Validator> list) throws ValidatorException{
        System.out.println("Everything is valid");
    }
}
