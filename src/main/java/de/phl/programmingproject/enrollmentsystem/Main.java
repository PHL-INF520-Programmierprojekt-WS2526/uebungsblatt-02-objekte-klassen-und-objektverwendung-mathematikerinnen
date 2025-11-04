package de.phl.programmingproject.enrollmentsystem;



/**
 * PUT YOUR CODE FOR THE EXERCISE 'STUDENT ENROLLMENT SYSTEM' IN THIS CLASS
 */
public class Main {
    public static void main(String[] args) {
         Student john = new Student("John Doe", "12345");
        Course csIntro = new Course("Introduction to Computer Science");
        System.out.println("Student-Info: " + john.getInfo());
        System.out.println("Course-Info: " + csIntro.getInfo());
        Enrollment e1 = csIntro.enroll(john);              
        System.out.println("Einschreibung erstellt: " + e1.getInfo()); 
        System.out.println("Student-Info (nach Einschreibung): " + john.getInfo());
        System.out.println("Course-Info (nach Einschreibung): " + csIntro.getInfo());
        e1.setGrade(4.0);
        System.out.println("Enrollment mit aktualisierter Note: " + e1.getInfo());
        Course oop = new Course("Object-Oriented Programming"); 
        Enrollment e2 = oop.enroll(john);                       
        System.out.println("Zweite Einschreibung: " + e2.getInfo());
        System.out.println("Kurse von " + john.getName() + ": " + john.getCourses());
    
        
        System.out.println("Studierende in '" + csIntro.getName() + "': " + csIntro.getStudents());
    
        
        csIntro.drop(john);
        System.out.println("Student wurde aus '" + csIntro.getName() + "' gestrichen.");
    
        
        System.out.println("Studierende in '" + csIntro.getName() + "' (nach Drop): " + csIntro.getStudents());
    }
    }




      