package bankApi;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static String getName() {
        String nombre = "";
        while (true) {
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();
            if (nombre != null && !nombre.trim().isEmpty()) {
                nombre = nombre.trim().toLowerCase();
                nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1).toLowerCase();
                break;
            } else {
                System.out.println("El nombre no puede estar vacío. Intente nuevamente.");
            }
        }
        return nombre;
    }

    public static void changeBalance(BankAccount account, ActionType action) {
        double amount = -1;
        do {
            System.out.print("Ingrese el monto a "
                    + (action.equals(ActionType.DEPOSIT) ? "depositar" : "retirar")
                    + " (o 'N' para cancelar):\n-> $");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("n")) {
                System.out.println("Operación cancelada.\n");
                return;
            }
            try {
                amount = Double.parseDouble(input);
                amount = Math.round(amount * 100.0) / 100.0;
                if (amount <= 0) System.out.println("El monto debe ser positivo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un monto valido.");
            }
        } while (amount <= 0);

        try {
            if (action.equals(ActionType.DEPOSIT)) account.depositBalance(amount);
            if (action.equals(ActionType.WITHDRAW)) account.withdrawBalance(amount);
            System.out.print((action.equals(ActionType.DEPOSIT) ? "Depósito" : "Retiro") + "exitoso de $" + amount + " \n\n");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getActionChoice() {
        try {
            System.out.print("-> ");
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException _) {
            return -1;
        }
    }
}
