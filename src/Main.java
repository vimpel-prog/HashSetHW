
public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 35f, 1);
        Product orange = new Product("апельсин", 55.5f, 2);
        Product peach = new Product("персик", 70.5f, 4);

        ProductList pl =new ProductList();
        pl.addProduct(apple);
        pl.addProduct(orange);
        pl.addProduct(peach);

        System.out.println(pl);

        pl.removeProduct(orange);

        System.out.println(pl);
    }
}