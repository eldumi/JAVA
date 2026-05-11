public class BankAccount
{
    String titular;
    double sold;

    public BankAccount(String titular, double sold)
    {
        this.titular = titular;
        this.sold = sold;
    }
    public void deposit(double amount) throws InvalidAmountException
    {
        if(amount <= 0)
        {
            throw new InvalidAmountException("Nu poti depune aceasta suma!\n");
        }
        sold += amount;
        System.out.println("Suma depusa: " + amount + " lei");
    }

    public void withdraw(double suma) throws InvalidAmountException, InsufficientFundsException
    {
        if(suma<=0)
            throw new InvalidAmountException("Nu poti retrage sume negative!\n");
        else
        {
            sold -= suma;
            System.out.println("Suma retrasa: " + suma + " lei");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
