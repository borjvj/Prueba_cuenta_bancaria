package cuentas;
/**Author Borja Garzon
*/

public class main {

	public static void main(String[] args) {
		CCuenta cuenta1 = operativa_cuenta(0.0f);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}

	/**
	 * @param cantidad TODO
	 * @return
	 */
	public static CCuenta operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
		return cuenta1;
	}

}
