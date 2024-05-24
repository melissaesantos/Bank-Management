public class SavingsAccount extends BankAccount{
    // create the private interest rate
    private double interestRate;
    //Saving account extends bank account so we need the super 
    //which is used to invoke the constructor of the immediate parent class
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate  ){
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    //create the new balance iin the savings account with added interest
    public void addInterest(){
        double InterestB = getBalance()* interestRate/100;
        deposit(InterestB);
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
}
