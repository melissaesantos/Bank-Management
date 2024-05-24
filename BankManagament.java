public class BankManagament {
    //this class will hold our main function to test our implementation
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount account1 = new BankAccount("123456", 1000);
        SavingsAccount account2 = new SavingsAccount("789012", 2000, 3.5);
        CheckingAccount account3 = new CheckingAccount("345678", 500, 200);

        // Display initial state
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        // Perform some transactions
        account1.deposit(500);
        account1.withdraw(200);
        account1.transfer(account2, 300);

        account2.addInterest();

        account3.withdraw(600);// you should get insufficient balance or invalid amount
        account3.deposit(100);// go up to 600
        account3.withdraw(200);//this should bring you down to 400

        // Display final state
        System.out.println("\nAfter transactions:");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }

}
