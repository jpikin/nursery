import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void menu() {
        System.out.println("Реестр домашних животных");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Выберите один из пунктов меню:");
        System.out.println("1. Добавить новое животное");
        System.out.println("2. Работа с реестром");
        System.out.println("3. Выход");
        int menuInput = scanner.nextInt();
        switch (menuInput) {
            case 1:
                createAnimal();
                break;
            case 2:
                subMenuAnimalList();
                break;
            case 3:
                break;
            default:
                System.out.println("!!! Вы ввели неверное значение !!! ");
                System.out.println();
                menu();
                break;
        }
    }

    private void createAnimal() {
        System.out.println("Выберите животное, которое хотите добавить в реестр:");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
        System.out.println("3. Хомяк");
        System.out.println("4. Лошадь");
        System.out.println("5. Осёл");
        System.out.println("6. Верблюд");
        System.out.println("7.Возврат в предыдущее меню");
        int newPetInput = scanner.nextInt();
        switch (newPetInput){
            case 1:
                Cats newCat = new Cats("noName", new ArrayList<>());
                newCat.addName();
                newCat.addNewCommand();
                AnimalList.addAnimal(newCat);
                System.out.println("Новое животное добавлено");
                menu();
                break;
            case 2:
                Dogs newDog = new Dogs("noName", new ArrayList<>());
                newDog.addName();
                newDog.addNewCommand();
                AnimalList.addAnimal(newDog);
                System.out.println("Новое животное добавлено");
                menu();
                break;
            case 3:
                Hamsters newHamster = new Hamsters("noName", new ArrayList<>());
                newHamster.addName();
                newHamster.addNewCommand();
                AnimalList.addAnimal(newHamster);
                System.out.println("Новое животное добавлено");
                menu();
                break;
            case 4:
                Horses newHorse = new Horses("noName", new ArrayList<>());
                newHorse.addName();
                newHorse.addNewCommand();
                AnimalList.addAnimal(newHorse);
                System.out.println("Новое животное добавлено");
                menu();
                break;
            case 5:
                Donkeys newDonkey = new Donkeys("noName", new ArrayList<>());
                newDonkey.addName();
                newDonkey.addNewCommand();
                AnimalList.addAnimal(newDonkey);
                System.out.println("Новое животное добавлено");
                menu();
                break;
            case 6:
                Camels newCamel = new Camels("noName", new ArrayList<>());
                newCamel.addName();
                newCamel.addNewCommand();
                AnimalList.addAnimal(newCamel);
                System.out.println("Новое животное добавлено");
                Counter.addCount();
                menu();
                break;
            case 7:
                System.out.flush();
                menu();
                break;
            default:
                System.out.println("!!! Вы ввели неверное значение !!! ");
                System.out.println();
                createAnimal();
                break;
        }
    }
    public void subMenuAnimalList() {
        System.out.println("Реестр домашних животных");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("1. Вывести всех животных в питомнике");
        System.out.println("2. Обучить животное новым командам");
        System.out.println("3. Назад");
        int subMenuChoise = scanner.nextInt();
        switch (subMenuChoise){
            case 1:
                System.out.println("Всего животных в питомнике: " + Counter.count);
                System.out.println();
                for (int i = 0; i < AnimalList.animalList.size(); i++) {
                    System.out.println(i + 1 + ". " + AnimalList.animalList.get(i));
                }
                subMenuAnimalList();
                break;
            case 2:
                System.out.println("Выберите животное для обучения:");
                for (int i = 0; i < AnimalList.animalList.size(); i++) {
                    System.out.println(i + 1 + ". " + AnimalList.animalList.get(i));
                }
                int choiseLirningAnimal = scanner.nextInt();
                AnimalList.animalList.get(choiseLirningAnimal-1).addNewCommand();
                subMenuAnimalList();
                break;
            case 3:
                menu();
                break;
            default:
                System.out.println("Неправильный ввод");
                subMenuAnimalList();
                break;
        }
    }
}
