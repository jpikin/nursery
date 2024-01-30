
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dogs extends Pets {
    String type = "Собака";

    Dogs(String name, List<String> commands) {
        super(name, commands);
    }

    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }

    public void addNewCommand() {
        int answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Хотите ввести новую команду?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        answer = sc.nextInt();
        switch (answer) {
            case 1:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите новую команду");
                commands.add(sc2.nextLine());
                addNewCommand();
                break;
            case 2:
                break;
            default:
                System.out.println("Неправильный ввод");
                addNewCommand();
                break;
        }
    }
}
