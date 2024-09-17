package models;

public class Classroom {


    // name; roomNo, ac, tv, capacity
    String name;
    int noOfStudents;
    boolean TV;
    boolean AC;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public boolean isTV() {
        return TV;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public Classroom(String name, int noOfStudents, boolean TV, boolean AC) {
        this.name = name;
        this.noOfStudents = noOfStudents;
        this.TV = TV;
        this.AC = AC;
    }
}
