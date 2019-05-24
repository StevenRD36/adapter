import java.util.Date;

public class AgeAdapter implements  HasAge {

    private Person person;

    public AgeAdapter(Person person) {
        this.person = person;
    }

    public int getAge(){
        //logic for age calculation here!!
        return 18;
    }

}
