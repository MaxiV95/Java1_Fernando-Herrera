Consigna sugerida para los estudiantes (nivel básico):

---

### **Proyecto Final: Simulador de Cuenta Bancaria**

Desarrollar una aplicación de consola en Java que simule el funcionamiento básico de una cuenta bancaria.

#### Requisitos:

1. **Crear una clase `BankAccount`** que tenga:

   * Atributos privados:

     * Titular de la cuenta.
     * Saldo.
   * Un constructor que inicialice ambos valores.
   * Métodos públicos para:

     * Depositar dinero (validando que el monto sea mayor a cero).
     * Retirar dinero (validando que el monto sea válido y no supere el saldo).
     * Mostrar el saldo actual por consola.

2. **Crear una clase `BankApp`** que:

   * Reciba una cuenta bancaria por constructor.
   * Muestre un menú interactivo en consola con las opciones:

     1. Depositar dinero
     2. Retirar dinero
     3. Mostrar saldo
     4. Salir
   * Permita al usuario ingresar opciones y montos utilizando `Scanner`.
   * Procese las opciones usando una estructura `switch`.

3. **Crear una clase `Main`** que:

   * Cree una cuenta bancaria con un saldo inicial.
   * Inicie la aplicación bancaria.

#### Objetivos de aprendizaje:

* Uso de clases y objetos.
* Encapsulamiento.
* Constructores.
* Métodos.
* Control de flujo (`if`, `switch`, `do-while`).
* Entrada de datos por consola.

---