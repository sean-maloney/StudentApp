package StudentApp.src.main.ie.atu;

import java.util.Scanner;


public class Student {
    private String studentName;
    private String studentEmail;
    private String studentCourse;
    private String studentAName;
    private String studentAEmail;
    private String studentACourse;
    private String studentCName;
    private String studentCEmail;
    private String studentCCourse;
    public Student() {
        this.studentName = "";
        this.studentEmail = "";
        this.studentCourse ="";
    }

    public Student(String studentCName, String studentCEmail, String studentCCourse){
        this.studentCName = studentCName;
        this.studentCEmail = studentCEmail;
        this.studentCCourse = studentCCourse;
    }


    //Display Student A Data
    public void displayInfo(){System.out.println("Name: "+ getName() + " \n"+ "Email: " + getEmail() + " \n"+ "Course: " +getCourse()+ "\n\n");}


    //Getters

    public String getName(){return studentName;}

    public String getEmail(){return studentEmail;}

    public String getCourse(){return studentCourse;}

    //Setters

    public void setName(String studentName){this.studentName= studentName;}
    public void setEmail(String studentEmail){this.studentEmail=studentEmail;}
    public void setCourse(String studentCourse){this.studentCourse=studentCourse;}


}
