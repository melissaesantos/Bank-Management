public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate  ){
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance()* interestRate/100;
        deposit(interest);
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
}
