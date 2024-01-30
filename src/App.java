import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Cats cat1 = new Cats("Barsik",  List.of("Come here", "go to eat"));
        Dogs dog1 = new Dogs("Собака","Bobik",  List.of("Sit", "Come here"));
        Hamsters hamster1 = new Hamsters("Хомяк","Rudolph",new ArrayList<>());
        Horses horse1 = new Horses("Bella", List.of("allure", "Come here"));
        Donkeys donkey1 = new Donkeys("Martin", List.of("Stay", "Back", "Forwadr"));
        Camels camel1 = new Camels("Halif", List.of("Go", "Eat", "Run"));
        AnimalList.addAnimal(cat1);
        AnimalList.addAnimal(dog1);
        AnimalList.addAnimal(hamster1);
        AnimalList.addAnimal(horse1);
        AnimalList.addAnimal(donkey1);
        AnimalList.addAnimal(camel1);
        Menu menu = new Menu();
        menu.menu();
//        System.out.println(horse1.type);
//        System.out.println(camel1.type);


    }
}
