public class Main {

    public static void main(String[] args) {
        WineCellar cellar = new WineCellar();
        cellar.addBottle(new WineBottle("Red", 2));
        cellar.addBottle(new WineBottle("White", 39));
        cellar.addBottle(new WineBottle("Red", 50));
        cellar.addBottle(new WineBottle("White", 103));

        for (WineBottle wb : cellar) {
            System.out.println(wb);
        }
    }
}
