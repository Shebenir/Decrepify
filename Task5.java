//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public List<String> getPhoneNumbers(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Ваня", "1234567890");
        phoneBook.addContact("Вася", "9876543210");
        phoneBook.addContact("Иосиф", "5678901234");

        System.out.println("Номер Вани: " + phoneBook.getPhoneNumbers("Ваня"));
        System.out.println("Номер Васи: " + phoneBook.getPhoneNumbers("Вася"));
        System.out.println("Номер Иосифа: " + phoneBook.getPhoneNumbers("Иосиф"));
    }
}
 */
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.

/*
import java.util.*;

public class NameCounter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Иван Савин",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();

        // Подсчет количества повторений имен
        for (String name : names) {
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Сортировка по убыванию популярности
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCountMap.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Вывод повторяющихся имен с количеством повторений
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
 */