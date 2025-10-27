package std;

public class Student {
String name;
int rollNo, m1, m2, m3, m4, total;
char grade;

public Student (String name, int rollNo, int m1, int m2, int m3, int m4) {
this.name = name;
this.rollNo = rollNo;
this.m1 = m1;
this.m2 = m2;
this.m3 = m3;
this.m4 = m4;
}

public int getTotal () {
total = m1 + m2 + m3 + m4;
return total;
}

public char setGrade (char grade) {
this.grade = grade;
return grade;
}

public void display () {
System.out.println("Name of the student is: " + name);
System.out.println("Roll No is: " + rollNo);
System.out.println("Total marks are: " + total);
System.out.println("Grade is: " + grade);
}
}