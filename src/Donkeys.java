import java.util.List;

public class Donkeys extends PackAnimals{
    String type = "Осёл";
    Donkeys(String name, List commands) {
        super(name, commands);
    }
    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }
}
