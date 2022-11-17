package Interface;

import Exceptions.ValidatorException;

import java.util.List;

public class ValidatorService {
    public static void validate(List<Validator> list) throws ValidatorException{
        for(Validator i: list){
            if(!i.isValid()){
                throw new ValidatorException("Invalid data");
            }
        }

        System.out.println("Everything is valid");
    }
}
