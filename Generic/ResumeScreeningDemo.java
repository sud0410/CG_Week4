package generics;

import java.util.*;

abstract class JobRole {
    String title;
    public JobRole(String title) { this.title = title; }
    public String getTitle() { return title; }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() { super("SE"); }
}

class DataScientist extends JobRole {
    public DataScientist() { super("data sciencits"); }
}

class ProductManager extends JobRole {
    public ProductManager() { super("Productmanager"); }
}

class Resume<T extends JobRole> {
    T role;
    public Resume(T role) { this.role = role; }
    public T getRole() { return role; }
}

class ScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles)
            System.out.println("Screening for: " + role.getTitle());
    }
}

public class ResumeScreeningDemo {
    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer());
        resumes.add(new DataScientist());
        resumes.add(new ProductManager());

        ScreeningPipeline.screenResumes(resumes);
    }
}
