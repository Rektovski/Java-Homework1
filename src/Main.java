import Implements.Person;
import Interface.Validator;
import Interface.ValidatorService;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine(), gender = scanner.nextLine();
        LocalDate date = LocalDate.parse(scanner.nextLine());
        Person person = new Person(id, date, gender);

//        ValidatorService.validate();
    }
}