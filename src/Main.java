
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        List<String> number = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    Введите:
                    1) Для добавления номера
                    2) Для вывода всего""");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();
            String surname;
            if (action.equals("1")) {
                System.out.println("Введите фамилию: ");
                surname = scanner.nextLine();
                System.out.println("Введите номер: ");
                number.add(scanner.nextLine());
                phoneBook.put(surname, number);
            } else if (action.equals("2")) {
                for (var currentPerson : phoneBook.entrySet()) {
                    System.out.println(currentPerson);
                }
                flag = false;
            }
        }
    }
}