import java.util.List;

public class Cats extends Pets {
    String type = "Кошка";

    Cats(String name, List<String> commands) {

        super(name, commands);

    }

    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }
}

