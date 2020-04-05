import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WineCellar implements Iterable<WineBottle>{

    public List<WineBottle> bottles = new ArrayList<>();

    public void addBottle(WineBottle b) {
        bottles.add(b);
    }

    public void removeBottle(WineBottle b) {
        for (WineBottle wb : bottles) {
            if (wb.type == b.type && wb.age == b.age) {
                bottles.remove(wb);
            }
        }
    }

    @Override
    public Iterator<WineBottle> iterator() {
        return bottles.iterator();
    }
}
