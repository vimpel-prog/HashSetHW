import java.util.HashSet;
import java.util.Set;

public class CookingBook {
    private final Set<Recepts> receptsSet = new HashSet<>();

    public void addRecept(Recepts recept) {
        for (Recepts recepts : receptsSet) {
            if(recepts.getName().equals(recept.getName())){
                throw new IllegalArgumentException("Такой рецепт уже существует");
            }
        }
        receptsSet.add(recept);
    }

    @Override
    public String toString() {
        return "CookingBook :" + receptsSet;
    }
}
