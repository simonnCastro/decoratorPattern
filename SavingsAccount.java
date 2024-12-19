public class SavingsAccount implements BankAccount{
    private int accountNumber;
    private String accountName;
    private Double balance;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }

    public String showAccountType(){
        return "Savings Account";
    };
    public Double getInterestRate(){
        return 0.01;
    };
    public Double getBalance(){
        return balance;
    };
    public String showBenefits(){
        return "Standard Savings Account";
    };
    public Double computeBalanceWithInterest(){
        return balance + (balance * getInterestRate());
    };
    public String showInfo(){
       return "Account number: " + accountNumber
                + "\nAccountName: " + accountName
                + "\nBalance: " + balance;
    };
}