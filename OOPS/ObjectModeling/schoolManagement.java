import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class schoolManagement {
    public static void main(String[] args) {
        School school = new School("ABC School");

        Student a = new Student("Amit");
        Student b = new Student("Bhavna");

        Course java = new Course("Java");
        Course python = new Course("Python");

        a.enroll(java);
        a.enroll(python);
        b.enroll(python);

        school.addStudent(a);
        school.addStudent(b);

        a.showCourses();
        b.showCourses();

        java.showStudents();
        python.showStudents();

        school.showStudents();
    }
}
