package pac1;

public class Constructor_01 {
    int num1;
    int num2;

    public Constructor_01(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void main(String[] args) {
        Constructor_01 obj = new Constructor_01(100, 200);

        System.out.println("Value of num1 is: " + obj.num1);
        System.out.println("Value of num2 is: " +  obj.num2);
    }




}
