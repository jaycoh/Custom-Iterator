public class Main {

    public static void main(String[] args) {
        WineCellar cellar = new WineCellar();
        cellar.addBottle(new WineBottle(WineBottle.Type.red, 2));
        cellar.addBottle(new WineBottle(WineBottle.Type.white, 39));
        cellar.addBottle(new WineBottle(WineBottle.Type.red, 50));
        cellar.addBottle(new WineBottle(WineBottle.Type.white, 103));

        for (WineBottle wb : cellar) {
            System.out.println(wb);
        }
    }
}
