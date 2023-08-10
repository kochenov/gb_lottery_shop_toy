import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Реализация интерфейса ResultWriter для записи результатов розыгрыша в файл.
 */
public class FileResultWriter implements ResultWriter {
    private String filename;

    /**
     * Конструктор для создания экземпляра класса FileResultWriter.
     *
     * @param filename имя файла, в который будут записываться результаты розыгрыша
     */
    public FileResultWriter(String filename) {
        this.filename = filename;
    }

    /**
     * Записать результат розыгрыша в файл.
     *
     * @param result результат розыгрыша (идентификатор игрушки)
     */
    @Override
    public void writeResult(int result) {
        try (FileWriter fileWriter = new FileWriter(filename, true)) {
            fileWriter.write(result + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
