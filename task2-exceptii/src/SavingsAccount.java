
public class SavingsAccount extends BankAccount
{
    double sumaMinima=100;
    public SavingsAccount(String titular, double sold)
    {
        super(titular, sold);
    }
    @Override
    public void withdraw(double suma) throws InvalidAmountException,InsufficientFundsException
    {
        if(sold-suma<sumaMinima)
        {
            throw new InsufficientFundsException("Nu puteti retrage aceasta suma! In cont trebuie sa ramana minim " +
                    sumaMinima + " lei\n");
        }
        else
        {
            super.withdraw(suma);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "sumaMinima=" + sumaMinima +
                ", titular='" + titular + '\'' +
                ", sold=" + sold +
                '}';
    }
}
