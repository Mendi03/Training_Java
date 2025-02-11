package Labs;



public class Person8 {
    enum Gender{
        M,F,X
    }

    private String firstName, lastName;
    private Gender gender;
    private int phoneNum;

    public Person8(String firstName, String lastName, Gender gender, int phoneNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    public Person8() {
        this.firstName = "Empty";
        this.lastName = "Empty";
        this.gender = Gender.X;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
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

        Gender gen = Gender.M;
        Person8 p1 = new Person8("Sal", "Lopez", gen, 1234567890);

        System.out.println(p1.getGender().getClass().getName());

        p1.print();

    }
}
