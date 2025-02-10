package Labs;

public class Person7 {

    private String firstName, lastName;
    private Character gender;
    private int phoneNum;

    public Person7(String firstName, String lastName, Character gender, int phoneNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    public Person7() {
        this.firstName = "Empty";
        this.lastName = "Empty";
        this.gender = 'X';
        this.phoneNum = 0000000000;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
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
        System.out.println("Person Details:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Phone: " + getPhoneNum());
    }

    public static void main(String[] args) {
        Person7 p1 = new Person7("Sal", "Lopez", 'F', 1234567890);

        p1.print();

    }

}
