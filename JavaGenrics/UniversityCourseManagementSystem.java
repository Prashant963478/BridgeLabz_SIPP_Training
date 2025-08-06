package generics_package;

import java.util.*;

//Abstract course type
abstract class CourseType {
 String courseName;
 String instructor;
 
//Constructor
 CourseType(String courseName, String instructor) {
     this.courseName = courseName;
     this.instructor = instructor;
 }

 abstract void evaluate();

 public String toString() {
     return courseName + " by " + instructor;
 }
}

//Subtypes of CourseType
class ExamCourse extends CourseType {
 ExamCourse(String courseName, String instructor) {
     super(courseName, instructor);
 }

 public void evaluate() {
     System.out.println(courseName + " is evaluated by written exam.");
 }
}

class AssignmentCourse extends CourseType {
 AssignmentCourse(String courseName, String instructor) {
     super(courseName, instructor);
 }

 public void evaluate() {
     System.out.println(courseName + " is evaluated by assignments.");
 }
}

class ResearchCourse extends CourseType {
 ResearchCourse(String courseName, String instructor) {
     super(courseName, instructor);
 }

 public void evaluate() {
     System.out.println(courseName + " is evaluated by research work.");
 }
}

//Generic Course Manager
class Course<T extends CourseType> {
 private List<T> courseList = new ArrayList<>();

 public void addCourse(T course) {
     courseList.add(course);
 }

 public void displayCourses() {
     for (T c : courseList) {
         System.out.println(c);
         c.evaluate();
     }
 }

 //Wildcard method
 static void displayAll(List<? extends CourseType> courses) {
     for (CourseType c : courses) {
         System.out.println(c);
         c.evaluate();
     }
 }
}

//Main class
public class UniversityCourseManagementSystem {
 public static void main(String[] args) {
	 
     //Create specific course managers
     Course<ExamCourse> examDept = new Course<>();
     examDept.addCourse(new ExamCourse("Math 101", "Dr. Singh"));
     examDept.addCourse(new ExamCourse("Physics 201", "Dr. Rao"));

     Course<AssignmentCourse> assignmentDept = new Course<>();
     assignmentDept.addCourse(new AssignmentCourse("English 101", "Prof. Nair"));
     assignmentDept.addCourse(new AssignmentCourse("History 102", "Dr. Sharma"));

     Course<ResearchCourse> researchDept = new Course<>();
     researchDept.addCourse(new ResearchCourse("AI Research", "Dr. Gupta"));

     //Display each department
     System.out.println("=== Exam-Based Courses ===");
     examDept.displayCourses();

     System.out.println("\n=== Assignment-Based Courses ===");
     assignmentDept.displayCourses();

     System.out.println("\n=== Research-Based Courses ===");
     researchDept.displayCourses();

     //Combine all into one list and use wildcard method
     List<CourseType> allCourses = new ArrayList<>();
     allCourses.add(new ExamCourse("Chemistry 301", "Dr. Banerjee"));
     allCourses.add(new AssignmentCourse("Literature 205", "Prof. Iyer"));
     allCourses.add(new ResearchCourse("Quantum Computing", "Dr. Mehta"));

     System.out.println("\n=== All Mixed Courses (Wildcard Demo) ===");
     Course.displayAll(allCourses);
 }
}

