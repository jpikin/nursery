import java.util.List;

public class Horses extends PackAnimals {
    String type = "Лошадь";

    Horses(String name, List commands) {
        super(name, commands);
    }

    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }
}
