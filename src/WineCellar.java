import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WineCellar implements Iterable<WineBottle>{

    private List<WineBottle> redWines = new ArrayList<>();
    private List<WineBottle> whiteWines = new ArrayList<>();

    public void addBottle(WineBottle b) {
        if (b.getType() == "Red") redWines.add(b);
        if (b.getType() == "White") whiteWines.add(b);
    }

    @Override
    public Iterator<WineBottle> iterator() {
        return new WineIterator<>();
    }

    private class WineIterator<WineBottle> implements Iterator<WineBottle> {
        private Iterator redWineIterator = redWines.iterator();
        private Iterator whiteWineIterator = whiteWines.iterator();

        public boolean hasNext() {
            return redWineIterator.hasNext() || whiteWineIterator.hasNext();
        }

        public WineBottle next() {
            if (redWineIterator.hasNext()) {
                return (WineBottle) redWineIterator.next();
            } else {
                return (WineBottle) whiteWineIterator.next();
            }

        }
    }

}

