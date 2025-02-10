package pac1;

public class conditional_Statements {
    public static void main(String[] args) {


        int a = 100;
        int b = 200;

        if(b > a) {
            System.out.println("b is bigger");
        }

        else {
            System.out.println("a is bigger or same as b");
        }

        for (int i=0; i <= 4; i++) {
            switch(i){
                case 0:
                    System.out.println("i value is zero");
                    break;
                case 1:
                    System.out.println("i value is one");
                    break;
                case 2:
                    System.out.println("i value is two");
                    break;
                case 3:
                    System.out.println("i value is three");
                    break;
                case 4:
                    System.out.println("i value is four");
                    break;
                default:
                    System.out.println("i is greater than 4");
                    break;
            }
        }

        int n = 5;

        while(n>0){
            System.out.println(n);
            n--;
        }

        int m = 5;

        do{
            System.out.println(m);
            m--;
        }while ( m > 0);

        for (int j = 5; j>0; j--){

            System.out.println("j value: "+ j);
        }

    }
}
