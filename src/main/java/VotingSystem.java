import java.util.ArrayList;
import java.util.List;

public class VotingSystem {


    public static void main(String[]args){
        List<Person> personList = new ArrayList<Person>();
        for(Person person : personList){
            AgeAdapter ageAdapter = new AgeAdapter(person);
            if(ageAdapter.getAge()>17){
                System.out.println("can vote");
            }
        }
    }
}
