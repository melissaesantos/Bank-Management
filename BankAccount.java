import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

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
        }
      }

       public void withdraw(double amount){
            if(amount > balance){
                System.out.println("withdrawal greater than balance");
            }
            if(amount < 0){
                System.out.println("You can not withdraw a negative amount");
            }else{
                balance -= amount;
            }
       }
       
       public void transfer(BankAccount toAccount, double amount){
               double b=  toAccount.getBalance();
                
       }
} 
