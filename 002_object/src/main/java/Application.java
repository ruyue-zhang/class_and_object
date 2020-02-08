import model.Student;
public class Application {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("李莉");
        stu.setAge(20);
        stu.setGender("女");
        System.out.println(stu.getName() + "," + stu.getAge() + "," + stu.getGender());
        stu.study();
        stu.rest();
    }
}
