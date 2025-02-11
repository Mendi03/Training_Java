package pac1;

public class lesson_String {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str1=new String("    Today is a beautiful day    ");
        System.out.println("String1:"+str1.length());
        String str2=new String("Sam");
        //String str2=str1;
        System.out.println("String2:"+str2.length());

        System.out.println(str1.indexOf("o"));
        System.out.println(str1.substring(11, 20));

        System.out.println(str1+str2);
        System.out.println(str1.trim()+str2);

        System.out.println(str1.concat(str2));
    }

}
