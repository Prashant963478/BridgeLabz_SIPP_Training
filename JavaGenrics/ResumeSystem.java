package generics_package;

import java.util.*;

//Abstract class 
abstract class JobRole {
 private String candidateName;
 private int experience;
 
//Constructor
 public JobRole(String candidateName, int experience) {
     this.candidateName = candidateName;
     this.experience = experience;
 }

 public String getCandidateName() {
     return candidateName;
 }

 public int getExperience() {
     return experience;
 }

 //Abstract method
 public abstract boolean isEligible();
}

class SoftwareEngineer extends JobRole {
 public SoftwareEngineer(String candidateName, int experience) {
     super(candidateName, experience);
 }

 @Override
 public boolean isEligible() {
     return getExperience() >= 2;
 }
}

//Concrete class 
class DataScientist extends JobRole {
 public DataScientist(String candidateName, int experience) {
     super(candidateName, experience);
 }

 @Override
 public boolean isEligible() {
     return getExperience() >= 3;
 }
}

//Concrete class 
class ProductManager extends JobRole {
 public ProductManager(String candidateName, int experience) {
     super(candidateName, experience);
 }

 @Override
 public boolean isEligible() {
     return getExperience() >= 4;
 }
}

//Generic Resume class
class Resume<T extends JobRole> {
 private T jobRole;

 public Resume(T jobRole) {
     this.jobRole = jobRole;
 }

 public T getJobRole() {
     return jobRole;
 }

 public void processResume() {
     System.out.println("Processing resume of " + jobRole.getCandidateName() + " for role: " + jobRole.getClass().getSimpleName());
     if (jobRole.isEligible()) {
         System.out.println("Status: Eligible\n");
     } else {
         System.out.println("Status: Not Eligible\n");
     }
 }
}

//Resume screening system using wildcard
class ResumeScreeningSystem {
 public static void screenAll(List<? extends JobRole> resumes) {
     for (JobRole role : resumes) {
         Resume<? extends JobRole> resume = new Resume<>(role);
         resume.processResume();
     }
 }
}

//Main class 
public class ResumeSystem {
 public static void main(String[] args) {
     List<JobRole> jobRoles = new ArrayList<>();
     jobRoles.add(new SoftwareEngineer("Alice", 3));
     jobRoles.add(new DataScientist("Bob", 2));
     jobRoles.add(new ProductManager("Charlie", 5));

     System.out.println("AI Resume Screening System Output:\n");

     ResumeScreeningSystem.screenAll(jobRoles);
 }
}
