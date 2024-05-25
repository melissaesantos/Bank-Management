# Bank Management System
## Description
The Bank Management System is a Java application designed to manage bank accounts including basic bank accounts, savings accounts, and checking accounts with overdraft capabilities. It demonstrates object-oriented programming principles such as inheritance, method overriding, and encapsulation.

## Features
* Create and manage multiple types of bank accounts: Basic Account, Savings Account, and Checking Account.

* Perform transactions such as deposits, withdrawals, and transfers between accounts.

* Calculate and add interest for savings accounts.

* Handle overdrafts for checking accounts with specified limits.

## Usage
The BankManagementSystem class demonstrates how to create different types of bank accounts and perform various transactions. The system output shows the initial state of the accounts and their states after performing a series of transactions.

## Project Structure
### BankAccount.java: 
The base class for all bank accounts, includes methods for depositing, withdrawing, and transferring money.
### SavingsAccount.java: 
Extends BankAccount and includes an interest rate, with a method to add interest to the balance.
### CheckingAccount.java: 
Extends BankAccount and includes an overdraft limit, with an overridden method to handle withdrawals considering the overdraft limit.
### BankManagementSystem.java: 
The main class to demonstrate the creation and management of accounts and perform transactions.
## Classes and Methods
### BankAccount
* BankAccount(String accountNumber, double initialBalance): Constructor to initialize account number and balance.

* void deposit(double amount): Method to deposit money into the account.

* void withdraw(double amount): Method to withdraw money from the account.

* void transfer(BankAccount toAccount, double amount): Method to transfer money to another account.

* String toString(): Overridden method to return a string representation of the account.

### SavingsAccount
* SavingsAccount(String accountNumber, double initialBalance, double interestRate): 
Constructor to initialize account number, balance, and interest rate.

* void addInterest(): Method to add interest to the balance.

* String toString(): Overridden method to return a string representation of the savings account including the interest rate.

### CheckingAccount
* CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit): Constructor to initialize account number, balance, and overdraft limit.

* void withdraw(double amount): Overridden method to handle withdrawals considering the overdraft limit.

* String toString(): Overridden method to return a string representation of the checking account including the overdraft limit.
