package behavioral.strategy;

//определяет семейство схожих алгоритмов и помещает каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы
public class Main {
    public static void main(String[] args) {
        var client = new StrategyClient();
        int[] values = {7, 4, 9, 1, 2, 3, 8};
        client.setStrategy(new SelectionSort());
        client.executeStrategy(values);
        client.setStrategy(new BubbleSort());
        client.executeStrategy(values);
        client.setStrategy(new InsertingSort());
        client.executeStrategy(values);
    }
}
