import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Реализация интерфейса ToyLottery для розыгрыша игрушек с учетом их весов.
 */
public class WeightedToyLottery implements ToyLottery {
    private List<Toy> toys = new ArrayList<>();
    private List<Integer> weights = new ArrayList<>();

    /**
     * Добавить игрушку и её вес в список доступных игрушек.
     *
     * @param input строка с данными об игрушке (id, название, вес)
     */
    @Override
    public void put(String input) {
        String[] parts = input.split(" ");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int weight = Integer.parseInt(parts[2]);
        Toy toy = new Toy(id, name, weight);
        toys.add(toy);
        weights.add(weight);
    }

    /**
     * Выбрать случайную игрушку на основе их весов.
     *
     * @return id выбранной игрушки или -1, если нет доступных игрушек
     */
    @Override
    public int get() {
        if (toys.isEmpty()) {
            return -1; // В магазине нет игрушек
        }

        int totalWeight = weights.stream().mapToInt(Integer::intValue).sum();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int threshold = 0;

        for (int i = 0; i < toys.size(); i++) {
            threshold += toys.get(i).getWeight();
            if (randomNumber <= threshold) {
                return toys.get(i).getId();
            }
        }

        return toys.get(0).getId(); // Вернуть первую игрушку, если что-то пошло не так
    }
}
