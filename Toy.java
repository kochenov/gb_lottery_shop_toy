/**
 * Класс, представляющий игрушку.
 */
public class Toy {
    private int id;
    private String name;
    private int weight;

    /**
     * Конструктор для создания экземпляра игрушки.
     *
     * @param id     уникальный идентификатор игрушки
     * @param name   название игрушки
     * @param weight вес игрушки (используется для розыгрыша)
     */
    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    /**
     * Получить идентификатор игрушки.
     *
     * @return идентификатор игрушки
     */
    public int getId() {
        return id;
    }

    /**
     * Получить вес игрушки.
     *
     * @return вес игрушки
     */
    public int getWeight() {
        return weight;
    }
}
