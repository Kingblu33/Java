public class Test{
    public static void main(String[] args) {
        BankAccount account1= new BankAccount(2000,3000);
        BankAccount account2= new BankAccount(2000,4000);

        System.out.println("Account 1 Total : "+account1.gettotal());
        System.out.println("Account 2 Total :"+account2.gettotal());
        System.out.println("Total Accounts Created:"+BankAccount.numofaccounts);
        System.out.println("total:"+account1.totalAccounts());
        System.out.println("Account Number Account 1:"+account1.getAccountNumber());

        System.out.println("Account Number Account 2:"+account2.getAccountNumber());
        account2.setWithdrawSaving(300);
        System.out.println("Account 2 After Withdrawl :  " +account2.gettotal());

    }
}