package Labs;

public class Person6 {
    private String firstName, lastName;
    private Character gender;


    public Person6() {
        this.firstName = "Empty";
        this.lastName = "Empty";
        this.gender = 'X';
    }


    public Person6(String firstName, String lastName, Character gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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


    public Character getGender() {
        return gender;
    }


    public void setGender(Character gender) {
        this.gender = gender;
    }


    public void print(){

    }


    public static void main(String[] args) {
        Person6 p1 = new Person6("Sal", "Lopez", 'F');

        System.out.println("Person Details:");
        System.out.println("First Name: " + p1.getFirstName());
        System.out.println("Last Name: " + p1.getLastName());
        System.out.println("Gender: " + p1.getGender());

    }
}
