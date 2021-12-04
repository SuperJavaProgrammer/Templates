package behavioral.interpreter;

//решает часто встречающуюся, но подверженную изменениям, задачу
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Expression ex = context.evaluate("-91+2-3+4");
        System.out.println(ex.interpret());
    }
}
