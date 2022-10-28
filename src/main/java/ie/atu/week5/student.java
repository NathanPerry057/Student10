package ie.atu.week5;

import java.util.Scanner;

public class student {

    String firstName;
    String secondName;
    String email;
    String course;

    public void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter student first name: ");
    setFirstName(s.nextLine());


    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
}
