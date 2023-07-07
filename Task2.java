// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

/*
import org.json.JSONObject;

public class SQLQueryBuilder {
    public static String buildWhereClause(JSONObject filters) {
        StringBuilder whereClause = new StringBuilder();
        
        String name = filters.optString("name", null);
        if (name != null) {
            whereClause.append("name = \"").append(name).append("\"").append(" and ");
        }
        
        String country = filters.optString("country", null);
        if (country != null) {
            whereClause.append("country = \"").append(country).append("\"").append(" and ");
        }
        
        String city = filters.optString("city", null);
        if (city != null) {
            whereClause.append("city = \"").append(city).append("\"").append(" and ");
        }
        
        String age = filters.optString("age", null);
        if (age != null) {
            whereClause.append("age = \"").append(age).append("\"").append(" and ");
        }
        
        // Удаление последнего "and "
        if (whereClause.length() > 0) {
            whereClause.setLength(whereClause.length() - 5);
        }
        
        return whereClause.toString();
    }

    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        JSONObject filters = new JSONObject(input);
        
        String whereClause = buildWhereClause(filters);
        
        String sqlQuery = "select * from students";
        if (!whereClause.isEmpty()) {
            sqlQuery += " where " + whereClause;
        }
        
        System.out.println("SQL-запрос: " + sqlQuery);
    }
}
 */

 // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

 /*
import java.io.FileWriter;
import java.io.IOException;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // Запись результатов итерации в лог-файл
            writeIterationToLog(array, i + 1);

            // Если на текущей итерации не было обменов, то массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public static void writeIterationToLog(int[] array, int iteration) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write("Iteration " + iteration + ": ");
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + " ");
            }
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1};
        bubbleSort(array);
    }
}
*/