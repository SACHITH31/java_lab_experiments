interface  tollBooth {
    void payCars(int n);
    void nonPayCars(int n);
    void totalAmount();
}

public class Vehicle implements tollBooth{
    int totalPayCars = 0;
    int totalNonPayCars = 0;
    int total = 0;

    public void payCars (int n) {
        totalPayCars += n;
    }
    
    public void nonPayCars (int n) {
        totalNonPayCars += n;
    }

    public void totalAmount () {
        total = totalPayCars * 50;
        System.out.println("Total Paying Cars: " + totalPayCars);
        System.out.println("Total Non-Paying Cars: " + totalNonPayCars);
        System.out.println("Total Amount Collected: ₹" + total);
    }

    
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.payCars(3);
        v1.nonPayCars(2);
        
        v1.totalAmount();
    }
}

