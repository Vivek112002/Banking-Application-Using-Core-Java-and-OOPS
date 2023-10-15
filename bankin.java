import java.util.Scanner;
public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number,double Balance,String Name,String Email
    ,String PhoneNumber){
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void DepositMoney(double DepositedMoney){
        this.Balance+=DepositedMoney;
        System.out.println("Deposit is Successful, new Balance is " +this.Balance);
    }

    public void WithDrawMoney(double WithdrawalMoney){
        if(this.Balance - WithdrawalMoney < 0){
            System.out.println("WithDraw Unseccessful only " + this.Balance+" is left");
        }else {
            this.Balance-=WithdrawalMoney;
            System.out.println("Withdraw successful, Current Balance is "+this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public static void main(String[] args) 
    {
        double b,dm,wd;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Balance :");
        b=sc.nextDouble();
        System.out.println("How much money do you want to Deposite ?:");
        dm=sc.nextDouble();
        System.out.println("How much money do you want to Withdraw ?:");
        wd=sc.nextDouble();

        Account acc = new Account("121212",b,"Abhay","abhay@xyz.com","1212121");

        acc.DepositMoney(dm);
        acc.DepositMoney(dm);
        acc.WithDrawMoney(wd);
    
}
}