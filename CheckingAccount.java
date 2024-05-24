public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String account,double initialBalance, double overdraftLimit){

        super(account, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount ){
        if(amount>0 && (getBalance()+overdraftLimit)>= amount){
            super.withdraw(amount);
        }else{
            System.out.println("Insufficient balance or overdraft limit exceeded.");
        }
    }

    @Override
    public String toString(){
        return super.toString()+  ", Overdraft Limit: " + overdraftLimit;
    }
}
