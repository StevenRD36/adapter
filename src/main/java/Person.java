import java.util.Date;

public class Person implements HasBirthday {
    private String firstName;
    private String lastName;
    private Date birthdate;


    public Person(String firstName, String lastName, Date birthdate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Date getBirthdate() {
        return birthdate;
    }

}
