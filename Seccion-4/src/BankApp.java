import bankApi.ActionType;
import bankApi.BankAccount;
import bankApi.InputUtils;

public class BankApp {
    private final BankAccount account;

    public BankApp() {
        this.account = new BankAccount(InputUtils.getName(), 0.00);
    }

    public void run() {
        int option;
        do {
            displayMenu();
            option = InputUtils.getActionChoice();
            processOption(option);
        } while (option != 4);
    }

    private void displayMenu() {
        System.out.println("Seleccione una acción:");
        System.out.println("1: Depositar dinero");
        System.out.println("2: Retirar dinero");
        System.out.println("3: Mostrar saldo");
        System.out.println("4: Salir");
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                InputUtils.changeBalance(account, ActionType.DEPOSIT);
                break;
            case 2:
                InputUtils.changeBalance(account, ActionType.WITHDRAW);
                break;
            case 3:
                account.printBalance();
                break;
            case 4:
                System.out.println("¡Hasta luego " + account.getOwner() + "!");
                return;
            default:
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
        }
    }
}
