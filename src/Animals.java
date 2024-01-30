import java.util.List;
import java.util.Scanner;

public class Animals {
    private String type;
    private String name;
    List<String> commands;

    public Animals(String name, List<String> commands) {

        this.name = name;
        this.commands = commands;

    }

    public void addName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя питомца");
        String newName = sc.nextLine();
        this.name = newName;
    }
    public void addNewCommand(){
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
public List getCommands() {
        return commands;
}

    public String getName() {
        return this.name;
    }
    public String getType() {
        return type;
    }

}
