public class Main {

    public static void main(String[] args) {
        WineCellar cellar = new WineCellar();
        cellar.addBottle(new WineBottle("Red", 2));
        cellar.addBottle(new WineBottle("White", 39));
        cellar.addBottle(new WineBottle("Red", 50));
        cellar.addBottle(new WineBottle("White", 103));

        // Without iterator:

        for (WineBottle wb : cellar.bottles) {
            System.out.println(wb);
        }

        // With iterator:

        for (WineBottle wb : cellar) {
            System.out.println(wb);
        }
    }
}
