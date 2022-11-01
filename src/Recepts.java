import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recepts {
    private final Set<Product> setProducts = new HashSet<>();
    private float totalCost;
    private final String name;

    public Recepts(String name) {
        this.name = name;
    }

    public void addToRecept(Product product) {
        setProducts.add(product);
    }
    public Set<Product> getSetProducts() {
        return setProducts;
    }

    public String getName() {
        return name;
    }

    public float getTotalCost() {
        for (Product setProduct : setProducts) {
            totalCost+=setProduct.getPrice();
        }
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recepts recepts = (Recepts) o;
        return Objects.equals(name, recepts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
