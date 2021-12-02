package behavioral.iterator;

//дает возможность последовательно обходить элементы составных объектов, не раскрывая их внутреннего представления
public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Iterator it = tasks.getIterator();
        while (it.hasNext())
            System.out.println((String) it.next());
    }
}
