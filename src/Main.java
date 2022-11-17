import Exceptions.ValidatorException;
import Implements.GenderValidator;
import Implements.ISODateValidator;
import Implements.IdValidator;
import Interface.Validator;
import Interface.ValidatorService;

import java.io.IOError;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ValidatorException {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine(), gender = scanner.nextLine();
        LocalDate date = LocalDate.parse(scanner.nextLine());

        GenderValidator list1 = new GenderValidator(gender);
        IdValidator list2 = new IdValidator(id);
        ISODateValidator list3 = new ISODateValidator(date);

        List<Validator> list = List.of(
                list1,
                list2,
                list3
        );

        ValidatorService.validate(list);
    }
}