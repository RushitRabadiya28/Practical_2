import java.util.ArrayList;
import java.util.Scanner;

    public class Ass_p_2_ATM_main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String id = "";
            String id2 = "";
            boolean flag = true;
            int choice;
            double amt;

// array list 
            ArrayList<Ass_p_2_ATM> people = new ArrayList<Ass_p_2_ATM>();
            for (int i = 1; i <= 10; i++) {
                people.add(new Ass_p_2_ATM());
            }
            System.out.print("Enter Your Account Number : ");
            id = sc.next();
            int userNumber = userID(id, people);

            while (flag) {

 // all choice 
                System.out.println();
                System.out.println("Make a choice......");
                System.out.println("1.Balance inquiry ");
                System.out.println("2.Withdraw money ");
                System.out.println("3.Deposit money");
                System.out.println("4.Money Transfer ");
                System.out.println("5.Create Account ");
                System.out.println("6.Deactivate Account");
                System.out.println("7.Exit ");
                choice = sc.nextInt();
                switch (choice) {

// all case 
                    case 1 -> {
                        System.out.println("Account Number : " + id);
                        System.out.println("Current Balance : " + people.get(userNumber).getBalance());
                    }
                    case 2 -> {
                        System.out.print("Enter Amount To Withdraw : ");
                        amt = sc.nextDouble();
                        people.get(userNumber).withdraw(amt);
                    }
                    case 3 -> {
                        System.out.print("Enter Amount To Deposit : ");
                        amt = sc.nextInt();
                        people.get(userNumber).deposit(amt);
                    }
                    case 4 -> {
                        System.out.print("Enter Account Number To Transfer Money :");
                        id2 = sc.next();
                        int u2 = userID(id2, people);
                        System.out.print("Enter Amount To Transfer : ");
                        amt = sc.nextInt();
                        people.get(userNumber).MoneyTransfer(people.get(u2), amt);
                    }
                    case 5 -> {
                        people.add(new Ass_p_2_ATM());
                        System.out.println("Account Created Successfully.");
                        System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                    }
                    case 6 -> {
                        people.remove(userNumber);
                        System.out.println("Account Deleted Successfully.");
                        flag = false;
                    }
                    case 7 -> flag = false;
                    default -> System.out.println("Make a valid choice..");
                }
            }

        }

        public static int userID(String id, ArrayList<Ass_p_2_ATM> people) {
            Scanner s = new Scanner(System.in);
            int user = 10000;
            int i;
            for (i = 0; i < people.size(); i++) {
                if (id.equals(people.get(i).getId())) {
                    user = i;
                    break;
                }
            }
            if (i == people.size()) {
                System.out.println("No Such Account Exists.\nTry Again..");
                System.out.print("Enter your account id :");
                id = s.next();
                return userID(id, people);
            } else return user;
        }
    }
