
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List animalList = new ArrayList();
        Cats cat1 = new Cats("Barsik", List.of("Come here", "go to eat"));
        Dogs dog1 = new Dogs("Bobik", List.of("Sit", "Come here"));
        Hamsters hamster1 = new Hamsters("Rudolph",List.of(""));
        Menu menu = new Menu();
        menu.menu();
    }
}
