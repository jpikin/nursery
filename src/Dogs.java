import java.util.Date;
import java.util.List;

public class Dogs extends Pets{
    private String name;
    List commands;
    private Date dateOfBirth;

    Dogs(String name, List commands, Date dateOfBirth) {
        this.name = name;
        this.commands = commands;
        this.dateOfBirth = dateOfBirth;
    }
    public void addNewCommand(String newCommand){
        commands.add(newCommand);
    }
    public String getName(){
        return this.name;
    }
    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }
}
