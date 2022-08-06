import java.util.Date;

public class Ass_p_2_2 {
    private int id=0 ;
    private double balance=500;
    private double annual=07;
    private Date date = new Date();

    Ass_p_2_2(){}   //  no-arg constructor 
    Ass_p_2_2(int id ,double balance)    // parameterized constructor
    {
        this.id=id;
        this.balance=balance;
    }

    public int getId() //  getid method  for get id
    {
        return id;
    }

    public double getBalance() //  getbalance method for get balance
    {
        return balance;
    }

    public double getAnnual() //  getannual method for get annual
    {
        return annual;
    }

    public Date getDate() // for get date 
    {
        return date;
    }

    public void setId(int id) // setid method for set id 
    {

        this.id = id;
    }

    public void setBalance(double balance) // setbalance method for set balance 
    {
        this.balance = balance;
    }

    public void setAnnual(double annual)// setannual method for set annual
    {
        this.annual = annual;
    }

    public void setDate(Date date)//  setdate method  for set date
    {
        this.date = date;
    }
    public double getMonthlyrate() // getMonthlyrate method for  find mounthlyrate
    {
        return  annual/12;

    }
    public double getMonthlyinterest()// getMonthlyinterest method for find mounthlyinterest 
    {
        return balance*(annual/1200);
    }
    public void withdraw(double a) // withdraw method 

    {
        balance=balance-a;
        System.out.println(a + " Rs. Withdrawn successfully.");

    }
    public void deposit(double a)// deposit method 
    {
        balance=balance+a;
        System.out.println(a + " Rs. Deposited successfully.");

    }
}


