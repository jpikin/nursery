import java.util.List;

public class Camels extends PackAnimals {
    String type = "Верблюд";

    Camels(String name, List commands) {
        super(name, commands);
    }

    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }
}
