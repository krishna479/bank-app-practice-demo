import java.util.UUID;

public class Sbiuser implements BankInterface{
    private double balance;
    private int years;
    private String  account;
    private String password;
    private double rateofinterest;
    Sbiuser(double balance, int years, String password) {
        this.balance = balance;
        this.years = years;
        this.password = password;
        this.account = String.valueOf(UUID.randomUUID());
        this.rateofinterest=6.6;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public void setRateofinterest(double rateofinterest) {
        this.rateofinterest = rateofinterest;
    }

    @Override
    public String addmoney(double amount) {
        balance = balance +amount;
        return "successfully added,new balance is"+balance;

    }

    @Override
    public String withdraw(double amount, String pass) {

       if(pass.equals(this.password)){
           if(balance>=amount){
               balance = balance-amount;
               return "your new balance is "+balance;
           }
           else{
               return "insufficient balance your balance is "+balance;
           }
       }
       else {
           return "Entered password is wrong";
       }
    }



    @Override
    public double CheckBalance() {
        return balance;
    }

    @Override
    public double calint(int years) {
        return (balance*years*rateofinterest)/100;
    }
}
