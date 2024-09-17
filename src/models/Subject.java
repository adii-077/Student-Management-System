package models;

public class Subject {

    // name, fullmarks, passmarks, teacher,

    int id;
    String name;
    int FM;
    int PM;
    String teacher;

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

    public int getFM() {
        return FM;
    }

    public void setFM(int FM) {
        this.FM = FM;
    }

    public int getPM() {
        return PM;
    }

    public void setPM(int PM) {
        this.PM = PM;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Subject(int id, String name, int FM, int PM, String teacher) {
        this.id = id;
        this.name = name;
        this.FM = FM;
        this.PM = PM;
        this.teacher = teacher;
    }
}
