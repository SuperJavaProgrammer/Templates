package behavioral.templateMethod;

//определяет скелет алгоритма, перекладывая ответственность за некоторые его шаги на подклассы. Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры
public class Main {
    public static void main(String[] args) {
        C a = new A();
        a.templateMethod();
        C b = new B();
        b.templateMethod();
    }
}
