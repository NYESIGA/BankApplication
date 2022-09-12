package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	BankAccount obj =new BankAccount("JUliet","px66779");
	obj.showMenu();
    }
}

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    
    // constructor for class BankAccount
    BankAccount(String customerName, String customerId){
        this.customerName=customerName;
        this.customerName=customerId;


    }
    // class methods of void return type
    void deposit(int amount){
        if(amount !=0){
            balance=balance+amount;
            previousTransaction=amount;
        }

        }
        void withdraw(int amount) {
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = amount;
            }
        }
        void getpreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("Deposited=" + previousTransaction);

            } else if (previousTransaction < 0) {

                System.out.println("withdraw=" + Math.abs(previousTransaction));
            } else {
                System.out.println("No Transaction Made");
            }
        }
            void showMenu(){
                    char option='\0';
                    Scanner scanner=new Scanner(System.in);
                    System.out.println("welcome"  + customerName);
                    System.out.println("Enter Your Pin"  + customerId);

                System.out.println("A: Chuck your Balance");
                System.out.println("B: Deposited");
                System.out.println("C: Withdraw ");
                System.out.println("D: previousTransaction");
                System.out.println("E: Exit The System");

                do {
                    System.out.println("*****************************************************************************************************************************************************************");
                    System.out.println("Enter Your option");
                    System.out.println("******************************************************************************************************************************************************************");

                    System.out.println("\n");

                    option = scanner.next().charAt(0);

                    switch (option) {

                        case 'A':
                        System.out.println("............................................................................................................");
                            System.out.println("Balance="+balance);
                            System.out.println("........................................................................................................");
                            System.out.println("\n");
                            break;

                        case 'B':
                        System.out.println("............................................................................................................");
                        System.out.println("Enter the amount to deposit");
                        System.out.println("........................................................................................................");
                        int amount=scanner.nextInt();
                        deposit(amount);

                        System.out.println("\n");
                        break;

                        case 'C':

                        System.out.println("............................................................................................................");
                        System.out.println("Enter amount to withdraw");
                        System.out.println("........................................................................................................");
                        int amount2=scanner.nextInt();
                        withdraw(amount2);

                        System.out.println("\n");
                        break;
                        case 'D':
                            System.out.println("...................................................................................");
                            getpreviousTransaction();
                            System.out.println("........................................................................................................");
                            System.out.println("\n");
                            break;
                        case 'E':
                            System.out.println("............................................................................................................");

                           // System.out.println("........................................................................................................");
                            System.out.println("\n");
                            break;
                        default:
                            System.out.println("Invailed option !! Please Enter correct option");
                    }

                }while (option !='E');
                    System.out.println("Thank you  for using our Services!!");

    }
}
