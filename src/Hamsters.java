import java.util.ArrayList;
import java.util.List;


public class Hamsters extends Pets{

    String type = "Хомяк";
    Hamsters(String type, String name, List commands) {

        super(name, commands);
    }
    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }
}
