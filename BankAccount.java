

public class BankAccount{
      // declare private fields for account num and balance
      private String accountNum;
      private double balance;
      
  
      //create constuctors
      public BankAccount(String accountNum,double balance){
          this.accountNum = accountNum;
          this.balance = balance;
      }
      //create getter and setter methods for balance and account num 
      public String getAccount(){
        return accountNum;
      }
      
      public double getBalance(){
        return balance;
      }

      public void deposit( double amount ){
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("Deposit must be positive.");
        }
      }

       public void withdraw(double amount){
           if(amount > 0 && balance > amount){
                balance -= amount;
           }else{
            System.out.println("Insufficient balance or Invalid amount");
           }
       }
       
       public void transfer(BankAccount toAccount, double amount){
               double b=  toAccount.getBalance();
                
       }
} 
