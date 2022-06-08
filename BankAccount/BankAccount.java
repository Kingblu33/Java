import java.util.Random;
import java.util.ArrayList;
public class BankAccount{
    private double checkingBalance=0.0;
    private double savingBalance=0.0;
    public static int numofaccounts=0;
    private static double totalMoney=0;
    public String accountNumber = "";

    public BankAccount(){
        this.checkingBalance=0;
        this.savingBalance=0;
        numofaccounts++;
        totalMoney=this.checkingBalance + this.savingBalance;
    }
    public BankAccount(double checkingBalance,double savingBalance){
        Random rand = new Random();
        this.checkingBalance=checkingBalance;
        this.savingBalance=savingBalance;
        numofaccounts++;
        totalMoney=this.checkingBalance + this.savingBalance;
        String alphabetString = "123456789";
        String newchar="";
        for (int i = 0; i < 9; i++) {
            newchar = String.valueOf(alphabetString.charAt(i));
            System.out.println(newchar);
        }
        this.accountNumber=newchar;
    }
    public double getcheckingBalance(){
        return this.checkingBalance;
    }
    public double gettotal(){
        return this.checkingBalance + this.savingBalance;
    }
    public double getSavingBalance(){
        return this.savingBalance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance= checkingBalance;
        totalMoney+=checkingBalance;
    }
    public void setSavingBalance(double savingBalance){
        this.savingBalance= savingBalance;
        totalMoney+=this.savingBalance;
    }
    public void setWithdrawSaving(double withdrawlamount){
        this.savingBalance-= withdrawlamount;
    }
    public void setWithdrawChecking(double withdrawlamount){
        if(this.checkingBalance==0){
            System.out.println("Insufficient Funds");
        }
        else{
            this.checkingBalance-= withdrawlamount;
            totalMoney-=withdrawlamount;
        }
    
    }
        public static double totalAccounts(){
            return totalMoney;   
    }
}


