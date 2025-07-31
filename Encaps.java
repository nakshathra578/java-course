class BankAccount {
  private String accountNumber;
  private double balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String newAccountNumber) {
    accountNumber = newAccountNumber;
  }

  public double getBalance() {
    return balance;
  }
  
  public void setBalance(double newBalance) {
    if (newBalance >= 0) {
      balance = newBalance;
    } else {
      System.out.println("Balance");
    }
  }
}

public class Encaps {
  public static void main(String[] args) {
    BankAccount acc1 = new BankAccount();
    acc1.setAccountNumber("1234567890");
    acc1.setBalance(5000.75);
    acc1.setBalance(-1000);
    
    System.out.println("Account Number: " + acc1.getAccountNumber());
    System.out.println("Balance: " + acc1.getBalance());
  }
}
