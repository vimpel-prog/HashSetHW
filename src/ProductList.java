import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private final Set<Product> productsList = new HashSet<>();
    public void addProduct(Product product){
        if(productsList.contains(product)){
            throw new RuntimeException("Этот продукт уже есть в списке");
        }
        productsList.add(product);
    }
    public void removeProduct(Product product){
        productsList.remove(product);
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productsList=" + productsList +
                '}';
    }

    public void checkProduct(String name) {
        for (Product product : productsList) {
            if(product.getName().equals(name)){
                product.setChecked();
                break;
            }
        }
    }
}
