package model;

public class Teacher {
    private String name;
    private Student[] studentList;

    public Teacher() {}

    public Teacher(String name, Student[] studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        Student[] newStudentList = new Student[this.studentList.length + 1];
        System.arraycopy(studentList, 0, newStudentList, 0, this.studentList.length);
        newStudentList[newStudentList.length - 1] = student;
        this.setStudentList(newStudentList);
    }

    public void showStudentList() {
        for (Student student : this.studentList) {
            System.out.println(student.getName() + "," + student.getAge() + "," + student.getGender());
        }
    }
}
