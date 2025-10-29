package ProductComparision;
import java.util.Comparator;

public class NameComparator implements Comparator<ProductComparable> {
    @Override
    public int compare(ProductComparable p1, ProductComparable p2) {
        return p1.getName().compareTo(p2.getName());
    }
}