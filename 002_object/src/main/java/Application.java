import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
        Student stu = new Student("李莉", 20, "女");
        System.out.println(stu.getName() + "," + stu.getAge() + "," + stu.getGender());
        stu.study();
        stu.rest();
    }
}
