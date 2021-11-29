package generating.prototype;

//Прототип - позволяет легко копировать объекты
public class Main {
    public static void main(String[] args) {
        Human orig = new Human(20, "Olya");
        System.out.println(orig);
        Human clone = (Human) orig.copy();
        System.out.println(clone);
        System.out.println(orig.equals(clone));
    }
}
