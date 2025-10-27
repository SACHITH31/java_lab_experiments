class Account {
    int accNo;
    double balance;
    String accType;
    
    Account () {
      accNo = 0;
      balance = 0.0;
      accType = "Default";  
    }

    Account (int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
        accType = "Savings";
    }

    Account (int accNo, double balance, String accType) {
        this.accNo = accNo;
        this.balance = balance;
        this.accType = accType; 
    }

    void deposit (int amount) {
        balance += amount;
    }

    void withDraw (int amount) {
        balance -= amount;
    }

    void getDetails () {
        System.err.println("Account Number is: " + accNo);
        System.err.println("Account type: " + accType);
        System.err.println("Balance is: " + balance);
    }
}


public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.getDetails();
    }
    
}
