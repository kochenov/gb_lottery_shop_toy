/**
 * Интерфейс для записи результатов розыгрыша в файл.
 */
public interface ResultWriter {
    /**
     * Записать результат розыгрыша в файл.
     *
     * @param result результат розыгрыша (идентификатор игрушки)
     */
    void writeResult(int result);
}
