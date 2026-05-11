
class BankApp
{
    public static void main(String[] args)
    {
        SavingsAccount savingsAccount = new SavingsAccount("Stefan", 1000);
        System.out.println(savingsAccount);
        try
        {
            savingsAccount.deposit(350);
            System.out.println(savingsAccount);

            savingsAccount.withdraw(1300);
            System.out.println(savingsAccount);
        }
        catch (InvalidAmountException e)
        {
            System.out.println(e.getMessage());
        }
        catch (InsufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }



    }
}