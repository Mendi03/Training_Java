package Labs;

import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab1_9 {

    public static void selfAdd(String value) throws ParseException {
        int num = Integer.parseInt(value);

        System.out.println(num *2);
    }

    public static void replaceHash(String value) throws ParseException {
        StringBuilder newString = new StringBuilder(value);

        for(int i = 0; i< value.length(); i = i+2) {
            newString.setCharAt(i, '#');
            if(i+2 >= value.length()){
                break;
            }
        }
        System.out.println(newString);
    }

    public static void rmvDup(String s) {

        char[] chars = s.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (int i = 0; i < chars.length; i++) {
            charSet.add(chars[i]);
        }

        System.out.println(charSet);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(character);
        }

        System.out.println(sb.toString());

    }




    public static void main(String[] args) throws ParseException {
        Scanner input1 = new Scanner(System.in);
        Scanner option = new Scanner(System.in);

        System.out.println("Enter a string to be manipulated: ");

        String str = input1.nextLine();

        System.out.println("Enter an option:");
        System.out.println("1: Add the String to itself");
        System.out.println("2: Replace odd positions with #");
        System.out.println("3: Remove duplicate characters in the String");
        System.out.println("4: Change odd characters to upper case");

        int opt = input1.nextInt();


            switch(opt){
                case 1:
                    selfAdd(str);
                    break;
                case 2:
                    replaceHash(str);
                    break;
                case 3:
                case 4:
                default:
                    System.out.println("Invalid option, Program exit");
                    break;
            }

    }
}
