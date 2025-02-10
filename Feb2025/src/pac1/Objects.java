package pac1;

import pac2.*;

public class Objects {
    public static void main(String[] args) {
        student stu1 = new student();
        stu1.sum();

        pac2.student stu2 = new pac2.student();
        stu2.sub();

        courses course = new courses();
        course.div();

        teacher teach = new teacher();
        teach.mult();

    }
}
