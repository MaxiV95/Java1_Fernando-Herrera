package bankApi;

public class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        System.out.println("Hola " + owner + ", gracias por usar nuestra aplicación.\n");
    }

    public String getOwner() {
        return owner;
    }

    public void printBalance() {
        System.out.println("Su saldo actual es de: $" + balance + " \n");
    }

    protected void depositBalance(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("El monto debe ser positivo.\n");
        this.balance += amount;
    }

    protected void withdrawBalance(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("El monto debe ser positivo.\n");
        if (amount > this.balance) throw new IllegalArgumentException("Fondos insuficientes.\n");
        this.balance -= amount;
    }
}
