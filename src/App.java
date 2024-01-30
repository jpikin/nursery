import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> commands1 = new ArrayList<>();
        List<String> commands2 = new ArrayList<>();
        List<String> commands3 = new ArrayList<>();
        List<String> commands4 = new ArrayList<>();
        List<String> commands5 = new ArrayList<>();
        List<String> commands6 = new ArrayList<>();

        commands1.add("Come here");
        commands1.add("go to eat");
        Cats cat1 = new Cats("Barsik", commands1);
        commands2.add("Sit");
        commands2.add("Come here");
        Dogs dog1 = new Dogs("Bobik", commands2);
        Hamsters hamster1 = new Hamsters("Rudolph", commands3);
        commands4.add("allure");
        commands4.add("Come here");
        Horses horse1 = new Horses("Bella", commands4);
        commands5.add("Stay");
        commands5.add("Back");
        commands5.add("Forwadr");
        Donkeys donkey1 = new Donkeys("Martin", commands5);
        commands6.add("Go");
        commands6.add("Eat");
        commands6.add("Run");
        Camels camel1 = new Camels("Halif", commands6);
        AnimalList.animalList.add(cat1);
        AnimalList.addAnimal(dog1);
        AnimalList.addAnimal(hamster1);
        AnimalList.addAnimal(horse1);
        AnimalList.addAnimal(donkey1);
        AnimalList.addAnimal(camel1);
        Counter.count = AnimalList.animalList.size();
        Menu menu = new Menu();
        menu.menu();
    }
}
