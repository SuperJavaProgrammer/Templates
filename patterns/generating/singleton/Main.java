package generating.singleton;

//Одиночка - гарантирует, что у класса есть только один экземпляр и предоставляет к нему глобальную точку доступа
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
