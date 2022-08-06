public class Ass_p_2_ATM {


        private static int count;
        private final String id;
        private double balance;

        public String getId()  // method for get id number 
 {
            return id;
        }

        public double getBalance() // method for get balance 
 {
            return balance;
        }

        public Ass_p_2_ATM()  //  constructor
 {
            count++;
            if (count < 10) {
                id = "AC00" + (count);
            } else {
                id = "AC0" + (count);
            }
            balance = 300;
        }

        public void withdraw(double money)   // withdraw method for withdraw money 
  {
            if (balance - money >= 300) {
                balance -= money;
                System.out.println(money + " Rs successfully withdrawn.");
                System.out.println("Remaining Balance is : " + balance);
            } else {
                System.out.println("Insufficient balance to withdraw the amount.");
            }
        }

        public void deposit(double amount)  // deposit method for deposit money 
 {
            balance += amount;
            System.out.println(amount + "Rs deposited to your account.");
            System.out.println("Current Balance is : " + balance);
        }

        public void MoneyTransfer(Ass_p_2_ATM obj, double amount)  // money transfer method for money transfer 1 acc. To other acc. 
{
            if (balance - amount >= 300) {
                balance -= amount;
                obj.balance += amount;
                System.out.println(amount + " Rs successfully Transferred.");
                System.out.println("Remaining Balance is : " + balance);
            } else {
                System.out.println("Insufficient balance to transfer the amount.");
            }
        }
}
