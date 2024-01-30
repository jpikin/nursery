
import java.util.ArrayList;
import java.util.List;

public class Dogs extends Pets{
    String type = "Собака";

    Dogs(String type, String name, List commands) {
        super(name, commands);
    }
    public String toString() {
        return type + ": " + getName() + ", Знает команды: " + getCommands();
    }
}
