import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance to open the account");
        double balance =sc.nextDouble();
        System.out.println("password please");
        String password = sc.next();
        System.out.println("enter the no. of years to calculate the years");
        int years = sc.nextInt();

        Sbiuser obj = new Sbiuser(balance,years,password);

       System.out.println( obj.CheckBalance());
       System.out.println( obj.addmoney(500));
        System.out.println(obj.calint(5));
       System.out.println( obj.withdraw(1,"123g"));


    }
}