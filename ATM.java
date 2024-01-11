import java.util.*;
public class ATM {
    public static void main(String args[])
    {  double amount;
        BankAccount ba=new BankAccount(1000);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("          WELCOME TO ATM          ");
        while(true)
        {
        System.out.println("Press 1 for withdraw\nPress 2 for deposit\nPress 3 for checking the balance\nPress 4 for Exit");
        int choice =sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Enter the amount to be withdrew");
            amount=sc.nextDouble();
            ba.withdraw(amount);
            break;

            case 2:
            System.out.println("Enter the amount to be deposited");
            amount=sc.nextDouble();
            ba.deposit(amount);
            break;

            case 3:
            ba.getBalance();
            break;

            case 4:
           System.exit(0);
           break;

           default:
           System.out.println("invalid input");
        


        }
        
    }
    
    }
}
class BankAccount
{
    double bal;
    public BankAccount(double bal)
    {
        bal=this.bal;
    }
    public void getBalance()
    {
        System.out.println("Your Balance is "+bal);
    }
    public void withdraw(double amt)
    {
        if(amt>0 && amt<=bal)
        {
            bal=bal-amt;
            System.out.println("Amount is withdrew");
        }
        else
        {
            System.out.println("Balance is insuffiecient");
        }

    }
    public void deposit(double amt)
    {
        if(amt>0)
        {
            bal=bal+amt;
            System.out.println("Amount is deposited");
        }
        
    }

}
