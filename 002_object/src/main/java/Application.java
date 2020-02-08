import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
        Student stu = new Student("李莉", 20, "女" );
        System.out.println(stu.getName() + "," + stu.getAge() + "," + stu.getGender());
        stu.study();
        stu.rest();

        Student[] studentList = new Student[2];
        studentList[0] = stu;
        studentList[1] = new Student("王其", 21, "男");
        Teacher teacher = new Teacher("张龙", studentList);
        teacher.addStudent(new Student("赵毅", 22, "男"));
        teacher.showStudentList();
    }
}
