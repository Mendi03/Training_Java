package pac1;

public class Use_static {

    static int num1 = 3;
    static int num2;

    static{
        System.out.println("Static block initialized");
        num2 = num1 * 3;
    }

    static void mymethod(int num3){
        System.out.println("num1 value: " + num1);
        System.out.println("num2 value: " + num2);
        System.out.println("num3 value: " + num3);
    }

    public static void main(String[] args) {
        mymethod(300);
    }

}
