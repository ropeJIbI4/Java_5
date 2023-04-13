// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class J1 
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Александров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Александров", List.of("+7(999)123-45-67", "+7(999)234-56-78"));
        phoneBook.put("Бабаев", List.of("+7(999)345-67-89", "+7(999)456-78-90"));
        phoneBook.put("Воронов",List.of("+7(999)567-89-01", "+7(999)678-90-12"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
    
