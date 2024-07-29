import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        int balance = 30000;
        int withdraw = 0;
        int deposit = 0;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------** Welcome to ATM ** ------");
            System.out.println("--------------------------------------");
            System.out.println("Option 1: Withdraw");
            System.out.println("Option 2: Deposit");
            System.out.println("Option 3: Check Balance");
            System.out.println("Option 4: Exit");
            System.out.println("choose any one option above:---------");


            int option= sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter Withdraw amout:");
                    System.out.println("--------------------------------------");
                    withdraw=sc.nextInt();
                    if(balance < withdraw){
                        System.out.println("Sorry insufficient balance");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Successfully Withdraw");
                        System.out.println("--------------------------------------");
                    }   
                break;

                case 2:
                    System.out.println("Enter deposit amount");
                    System.out.println("--------------------------------------");
                    deposit=sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Successfully deposit");
                    System.out.println("--------------------------------------");
                    break;

                case 3:
                    System.out.println("Your Account Balance is :" + balance);
                    System.out.println("--------------------------------------");
                    break;

                case 4:
                    System.exit(0);
                    break;
                
                default:System.out.println("Please enter correct Option!");
            }
        }
    }
}