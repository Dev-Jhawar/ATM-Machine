import java.util.Scanner;

class ATM_Machine{
    float Balance;
    int Pin = 9999;

    public void checkpin(){
        System.out.println("Enter Your Pin :");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == Pin) {
            System.out.println("Pin is Correct");
            menu();
        }
        else{
            System.out.println("Enter a Valid Pin\n"+"Pin is Incorrect!!");
        }
    }

    public void menu(){
        System.out.println("Menu :-");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        System.out.println("Enter Your Choice :");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            System.out.println("Exiting...\n"+"Thank You");
        }
        else{
            System.out.println("Enter a Valid Choice :");
        }
    }

    public void checkBalance(){
        System.out.println("Your Current Balance is : " + Balance);
        menu();
    }
    public void withdrawMoney(){
        // System.out.println("Your Current Balance is : " + Balance);
        System.out.println("Enter the amount you want to withdraw :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println(" Money Withdrawal Successfully \n"+"Your Remaining Amount is : " + Balance);
        }
        menu();
        
        
    }
    public void depositMoney(){
        System.out.print("Enter the amount you want to deposit : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }


        public static void main(String[] args) {
            ATM_Machine obj = new ATM_Machine();
            obj.checkpin();
        }
    }