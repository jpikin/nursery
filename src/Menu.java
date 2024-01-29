import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void menu() {
        System.out.println("Реестр домашних животных");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Выберите один из пунктов меню:");
        System.out.println("1. Добавить новое животное");
        System.out.println("2. Вывести список животных питомника");
        int menuInput = scanner.nextInt();
        switch (menuInput) {
            case 1:
                subMenuAddNewAnimal();
                break;
            case 2:
                subMenuAnimalList();
                break;
            default:
                System.out.println("!!! Вы ввели неверное значение !!! ");
                System.out.println();
                menu();
                break;
        }
    }
    public void subMenuAddNewAnimal() {
        System.out.println("Реестр домашних животных");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Добавьте новое животное:");
        System.out.println("Выберите тип животного:");
        System.out.println("1. Домашнее животное");
        System.out.println("2. Вьючное животное");
        System.out.println("3. В предыдущее меню");
        int subMenuInput = scanner.nextInt();
        switch (subMenuInput){
            case 1:
                createPet();
                break;
            case 2:
                ;
                break;
            case 3:
                System.out.flush();
                menu();
                break;
            default:
                System.out.println("!!! Вы ввели неверное значение !!! ");
                System.out.println();
                subMenuAddNewAnimal();
                break;
        }

    }

    private void createPet() {
        System.out.println("Выберите животное, которое хотите добавить в реестр:");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
        System.out.println("3. Хомяк");
        System.out.println("4.Возврат в предыдущее меню");
        int newPetInput = scanner.nextInt();
        switch (newPetInput){
            case 1:
                Cats newCat = new Cats("noName", new ArrayList<>(), new Date());
                break;
            case 2:
                Dogs newDog = new Dogs("noName", new ArrayList<>(), new Date());
                break;
            case 3:
                Hamsters newHamster = new Hamsters("noName", new ArrayList<>(), new Date());
                break;
            case 4:
                subMenuAddNewAnimal();
                break;
            default:
                System.out.println("!!! Вы ввели неверное значение !!! ");
                System.out.println();
                subMenuAddNewAnimal();
                break;
        }
    }

    public void subMenuAddAnimalName(){

    }
    public void subMenuAddAnimalCommand(){

    }
    public void subMenuAnimalList(){
        System.out.println("Реестр домашних животных");
        System.out.println("Подменю 2");
    }
}
