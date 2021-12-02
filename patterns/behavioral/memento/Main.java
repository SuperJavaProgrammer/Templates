package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
            game.set("Lev1", 3000);
        System.out.println(game);

        File file = new File();
            file.setSave(game.save());

        game.set("Lev2", 5000);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);
    }
}
