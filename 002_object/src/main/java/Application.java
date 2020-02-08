import model.Student;
public class Application {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "李莉";
        stu.age = 20;
        stu.gender = "女";
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.gender);
        stu.study();
        stu.rest();
    }
}
