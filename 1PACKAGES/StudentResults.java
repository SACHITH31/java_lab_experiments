import std.*;
import grd.*;
import java.util.*;

public class StudentResults {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter Student name: ");
String name = scan.nextLine();

System.out.println("Enter Roll No: ");
int rollNo = scan.nextInt();

System.out.println("Enter m1 marks: ");
int m1 = scan.nextInt();

System.out.println("Enter m2 marks: ");
int m2 = scan.nextInt();


System.out.println("Enter m3 marks: ");
int m3 = scan.nextInt();


System.out.println("Enter m4 marks: ");
int m4 = scan.nextInt();

Student s1 = new Student(name, rollNo, m1, m2, m3, m4);
int total = s1.getTotal();

Grade g1 = new Grade(total);
char grade = g1.getGrade();

s1.setGrade(grade);
s1.display();
}
}