import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List animalList = new ArrayList();
        Cats cat1 = new Cats("Barsik", List.of("Come here", "go to eat"));
        Menu menu = new Menu();
        menu.menu();
    }
}
