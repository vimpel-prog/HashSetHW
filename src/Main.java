import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
        System.out.println();
////////////////////////////////
        Recepts olivje = new Recepts("Оливье");
        Recepts oliva = new Recepts("Оливыч");

        oliva.addToRecept(orange);
        oliva.addToRecept(apple);

        olivje.addToRecept(apple);
        olivje.addToRecept(orange);

        CookingBook cookingBook= new CookingBook();
        cookingBook.addRecept(olivje);
        cookingBook.addRecept(oliva);

        System.out.println(cookingBook);
//////////////////////////////////////////
        Set<Integer> integerSet = new HashSet<>();
        Random RANDOM = new Random();
        for (int i = 0; i < 20; i++) {
            integerSet.add(RANDOM.nextInt(1000));
        }
        integerSet.removeIf(integer -> integer % 2 != 0);
        for (Integer integer : integerSet) {
            System.out.print(integer+" ");
        }
        System.out.println();
////////////////////////////////////////////
        MultiTable multiTable =new MultiTable();

        multiTable.printTasks();
        ///////////////////////
//     Для четвертого вопроса лучше всего подходит множество HashSet, потому что мы будем искать элементы Интеджер ,
//        а у них получится хороший ХэшКод и операцию поиска можно будет выполнять за константу времени
    }
}