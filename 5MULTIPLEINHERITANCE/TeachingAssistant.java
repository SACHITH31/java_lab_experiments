import java.util.*;

interface Person {
    void getNAG();
    void display();    
}

interface Student extends Person {
    void getSC();
}

interface Staff extends Person {
    void getEid_Sal();
}

public class TeachingAssistant {
    Scanner scan = new Scanner(System.in);
    int grossSalary;

    String name, gender;
    int age, studentCode, eid, basic;

    void getNAG () {
        System.err.println("Enter name: ");
        name = scan.nextLine();

        System.err.println("Enter age");
        age = scan.nextInt();
        scan.nextLine();

        System.err.println("Enter Gender: ");
        gender = scan.nextLine();
    }

    void getSC () {
        System.err.println("Enter student code: ");
        studentCode = scan.nextInt();
    }

    void getEid_Sal () {
        System.err.println("Enter employee id: ");
        eid = scan.nextInt();
        System.err.println("Enter basic salary: ");
        basic = scan.nextInt();
        grossSalary = (int) (basic + (0.1 * basic) + (0.5 * basic));
    }

    void display () {
        System.err.println("Name: " + name);
        System.err.println("Age: " + age);
        System.err.println("Gender: " + gender);
        System.err.println("Student Code: " + studentCode);
        System.err.println("Employee Id: " + eid);
        System.err.println("Basic salary: " + basic);
        System.err.println("Gross salary: " + grossSalary);
    }

    public static void main (String args[]) {
        TeachingAssistant t1 = new TeachingAssistant();
        t1.getNAG();
        t1.getSC();
        t1.getEid_Sal();
        t1.display();
    }


}
