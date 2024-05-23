

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
               // so we want to get the balance of the other account that they want to transfer it to
            if(amount > 0 && balance > amount){
                this.withdraw(amount);
                toAccount.deposit(amount);
           }else{
            System.out.println("Insufficient balance or Invalid amount");
           }    
                
       }
} 
