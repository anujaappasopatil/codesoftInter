import java.util.*;
public class Tas3 {
    int balance=20000;
     public void Withdraw( int amount)
     {
        balance=balance-amount;
        System.out.println("Your bank acount xxxxxxx2345 debited by $ "+amount+"balance $"+balance);
        
     }
     public void Deposite(int  amount)
     {
        balance=balance+amount;
        System.out.println("Your bank acount  xxxxxxxxx2345 creadited by $ "+amount+" balance $"+balance);
     }
     public void checkBalance()
     {
        System.out.println("your bank balance:"+balance);
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
         Tas3 num = new Tas3();
         while (true) {
            System.out.println("1.Withdraw");
            System.out.println("2.Deposite");
            System.out.println("3.Check Balance");
            System.out.println("stop transaction");
            System.out.println("Bank transaction option");
            int choice = sc.nextInt();
           
            switch (choice) {
                case 1:
                   System.out.println("enter withdraw Amount :");
                    int Amount = sc.nextInt();
                    num.Withdraw(Amount);
                    break;

                case 2:
                   System.out.println("Enter deposite amount:");
                    Amount = sc.nextInt();
                   num.Deposite(Amount);
                   break;

                case 3:
                    
                    num.checkBalance();
                    break;

                case 4:
                  System.out.println("Thank you for transaction..");
                  System.exit(0);
                  break;
            

                default:
                    break;
            }
         }
    }  
}
