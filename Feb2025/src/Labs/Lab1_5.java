package Labs;

import java.util.Scanner;

public class Lab1_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("num is 0");
        }

        else if(num > 0){
            System.out.println("num is positive");
        }

        else{
            System.out.println("num is negative");
        }

    }
}
