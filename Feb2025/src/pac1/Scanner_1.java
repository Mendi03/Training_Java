package pac1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Scanner_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);

        System.out.println(sqrt(9));

    }
}
