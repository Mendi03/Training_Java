package pac1;

import pac2.*;

public class Objects {

    int i;
    public static void main(String[] args) {
        student stu1 = new student();
        Objects obj1 = new Objects();
        stu1.sum();

        System.out.println(obj1.i);

        pac2.student stu2 = new pac2.student();
        stu2.sub();

        courses course = new courses();
        course.div();

        teacher teach = new teacher();
        teach.mult();



    }
}
