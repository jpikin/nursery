import java.util.Date;
import java.util.List;

public class Cats extends Pets{

    private String name;
    List commands;

    Cats(String name, List commands) {
        this.name = name;
        this.commands = commands;
            }
    public void addNewCommand(String newCommand){
        commands.add(newCommand);
    }
    public String getName(){
        return this.name;
    }

}
