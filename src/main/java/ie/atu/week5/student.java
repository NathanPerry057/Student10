package ie.atu.week5;

import java.util.Scanner;

public class student {

    String firstName;
    String secondName;
    String email;
    String course;

    public student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter students first name:" );
        this.firstName = in.nextLine();


        System.out.print("Enter students second name: ");
        this.secondName = in.nextLine();

        System.out.print("Enter student email:");
        this.email = in.nextLine();

        System.out.print("Enter student course ");
        this.course = in.nextLine();
    }
}
