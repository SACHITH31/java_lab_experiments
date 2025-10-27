class SeatsFilledException extends Exception {
    SeatsFilledException(String message) {
        super(message);
    }
}

public class StudentRegistration {
    int regNo, joiningYear;
    String name, course;

    StudentRegistration(int regNo, String name, String course, int joiningYear) throws SeatsFilledException {
        int limit = (joiningYear % 100) * 100 + 60;

        if (regNo > limit) {
            throw new SeatsFilledException("Seats filled! Max allowed: " + limit);
        }
        this.regNo = regNo;
        this.name = name;
        this.course = course;
        this.joiningYear = joiningYear;
    }

    void display() {
        System.out.println("RegNo: " + regNo + ", Name: " + name + ", Course: " + course);
    }

    public static void main(String[] args) {
        try {
            StudentRegistration s1 = new StudentRegistration(2555, "Ravi", "B.Tech", 2025);
            s1.display();
            StudentRegistration s2 = new StudentRegistration(2565, "Meena", "BCA", 2025);
            s2.display();
        } catch (SeatsFilledException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
