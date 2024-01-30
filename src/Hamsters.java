import java.util.ArrayList;
import java.util.List;


public class Hamsters extends Pets {

    String type = "Хомяк";

    Hamsters(String name, List commands) {

        super(name, commands);
    }

    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }
}
