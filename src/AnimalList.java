import java.util.ArrayList;
import java.util.List;

public class AnimalList {

    static List<Animals> animalList = new ArrayList<Animals>();

    public static void addAnimal(Animals a){
        animalList.add(a);
    }

}
