import java.util.*;

public class StringOperations {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String str = "Welcome! This is cs212 Java Course.";

        System.out.println("Lowercase is: " + str.toLowerCase());
        System.out.println("UpperCase is: " + str.toUpperCase());

        System.out.println("Length is: " + str.length());
        System.out.println("Replaced is: " + str.replace("cs212", "csd212"));

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sum += (int) str.charAt(i);
            }
        }
        System.out.println("Sum is: " + sum);

        System.out.println("Enter full Name: ");
        String FullName = scan.nextLine();

        String[] splittedName = FullName.split(" ");

        for (int i = 0; i < splittedName.length; i++) {
            if (i == 0) {
                System.out.println("first name is: " + splittedName[0]);
            } else if (i == splittedName.length - 1) {
                System.out.println("Last name is: " + splittedName[splittedName.length - 1]);
            } else {
                continue;
            }

        }

    }

}