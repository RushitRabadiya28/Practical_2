 public class SavingAccount extends Ass_p_2_2{
        // saving account doesn't support overdraft

        public SavingAccount() {
        }

        public SavingAccount(int id, double balance) {
            super(id, balance);
        }

        public void withdraw(double money){
            if(money<=getBalance()){
                super.withdraw(money); // parent class method to withdraw amount.
            }
            else {
                System.out.println("You don't have sufficient balance to withdraw "+money+" Rs.");
            }
        }
    }
