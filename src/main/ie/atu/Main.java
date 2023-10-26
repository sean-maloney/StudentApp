package StudentApp.src.main.ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName;
        String Name3,Email3,Course3;
        Scanner scanner = new Scanner(System.in);
        Student user1 = new Student();

        System.out.print("STUDENT 1\n");
        System.out.print("Enter First Name: ");
        user1.setName(scanner.nextLine());
        System.out.print("Enter Email Name: ");
        user1.setEmail(scanner.nextLine());
        System.out.print("Enter Course Name: ");
        user1.setCourse(scanner.nextLine());
        System.out.print("\n");


        user1.displayInfo();
        }
    }
