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
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                subMenuAddNewAnimal();
                break;
            case 2:
                subMenuAnimalList();
                break;
            default:
                System.out.println("!!! Вы ввели неверное значение!!! ");
                System.out.println();
                menu();
                break;
        }
    }
    public void subMenuAddNewAnimal() {
        System.out.println("Реестр домашних животных");
        System.out.println("Подменю 1");
    }
    public void subMenuAnimalList(){
        System.out.println("Реестр домашних животных");
        System.out.println("Подменю 2");
    }
}
