import java.io.IOException;

/**
 * Основной класс для запуска программы розыгрыша игрушек.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр розыгрыша игрушек
        ToyLottery toyLottery = new WeightedToyLottery();

        // Добавляем игрушки и их веса
        toyLottery.put("1 Мяч 20");
        toyLottery.put("2 Робот 20");
        toyLottery.put("3 Кукла 60");

        // Создаем экземпляр записи результатов в файл
        ResultWriter resultWriter = new FileResultWriter("output.txt");

        // Вызываем метод get 10 раз и записываем результаты в файл
        for (int i = 0; i < 10; i++) {
            int result = toyLottery.get();
            resultWriter.writeResult(result);
        }
    }
}
