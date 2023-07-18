import java.util.*;

public class Laptop {
    private String brand;
    private int ram; // Оперативная память (ОЗУ) в ГБ
    private int hdd; // Объем жесткого диска (ЖД) в ГБ
    private String os; // Операционная система
    private String color;

    // Конструктор класса
    public Laptop(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    // Геттеры и сеттеры (если необходимо)

    @Override
    public String toString() {
        return "Brand: " + brand +
               ", RAM: " + ram + "GB" +
               ", HDD: " + hdd + "GB" +
               ", OS: " + os +
               ", Color: " + color;
    }

    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP", 8, 256, "Windows 10", "Black"));
        laptops.add(new Laptop("Dell", 16, 512, "Windows 11", "Silver"));
        laptops.add(new Laptop("Lenovo", 12, 512, "Windows 10", "Grey"));
        laptops.add(new Laptop("Apple", 16, 512, "macOS", "Silver"));

        // Метод для фильтрации ноутбуков по заданным критериям
        filterLaptops(laptops);
    }

    public static void filterLaptops(Set<Laptop> laptops) {
        // Критерии фильтрации
        Map<Integer, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criteria = scanner.nextInt();
        scanner.nextLine(); // Считываем лишний перевод строки

        switch (criteria) {
            case 1:
                System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
                int minRAM = scanner.nextInt();
                filters.put(criteria, minRAM);
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД (в ГБ): ");
                int minHDD = scanner.nextInt();
                filters.put(criteria, minHDD);
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                String os = scanner.nextLine();
                filters.put(criteria, os);
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = scanner.nextLine();
                filters.put(criteria, color);
                break;
            default:
                System.out.println("Некорректный ввод.");
                return;
        }

        // Фильтрация ноутбуков по заданным критериям
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean isValid = true;

            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int key = entry.getKey();
                Object value = entry.getValue();

                switch (key) {
                    case 1:
                        if (laptop.ram < (int) value) {
                            isValid = false;
                        }
                        break;
                    case 2:
                        if (laptop.hdd < (int) value) {
                            isValid = false;
                        }
                        break;
                    case 3:
                        if (!laptop.os.equalsIgnoreCase((String) value)) {
                            isValid = false;
                        }
                        break;
                    case 4:
                        if (!laptop.color.equalsIgnoreCase((String) value)) {
                            isValid = false;
                        }
                        break;
                    default:
                        isValid = false;
                        break;
                }

                if (!isValid) {
                    break;
                }
            }

            if (isValid) {
                filteredLaptops.add(laptop);
            }
        }

        // Вывод отфильтрованных ноутбуков
        System.out.println("\nОтфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}