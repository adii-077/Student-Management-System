package models;

import java.util.ArrayList;

public class Student {

    int id;
    String name;
    int roll;
    String section;
    int grade; //grade means class ( 11 or 12 )
    Classroom classroom;
    ArrayList<Subject> subject;

    public Student(int id, String aditya, int roll, String khumbila, int grade, int i) {
    }

    public Student(ArrayList<Subject> subject) {    
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public Student(int id, String name, int roll, String section, int grade, Classroom classroom, ArrayList<Subject> subject) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.section = section;
        this.grade = grade;
        this.classroom = classroom;
        this.subject = new ArrayList<>();
    }
}
