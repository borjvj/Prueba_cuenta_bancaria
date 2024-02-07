package cuentas;
/**
 * La clase CCuenta representa una cuenta bancaria.
 * Permite realizar operaciones como ingresar dinero, retirar dinero, obtener el saldo actual y configurar los atributos de la cuenta.
 * 
 * @author Borja Garzon
 */

public class CCuenta {
	
	private String nombre; // Nombre del titular de la cuenta
    private String cuenta; //numero de cuenta
    private double saldo;	//Saldo en cuenta
    private double tipoInterés; // tipo de interes
    
    /**
     * Constructor por defecto de la clase CCuenta.
     * Inicializa una cuenta con valores predeterminados.
     */

    public CCuenta(){}
    /**
     * Constructor de la clase CCuenta.
     * Inicializa una cuenta con los valores proporcionados.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés asociado a la cuenta.
     */

    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

   
    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo actual de la cuenta.
     */
    
	public double estado(){
        return saldo;
    }
	/**
     * Obtiene el nombre del titular de la cuenta
     * @return El nombre del titular de la cuenta
     */

    public String getNombre() {
		return nombre;
	}
    
    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre El nombre del titular de la cuenta.
     */
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
     * Obtiene el número de cuenta.
     * @return El número de cuenta.
     */
	

	public String getCuenta() {
		return cuenta;
	}
	
	/**
     * Establece el número de cuenta.
     * @param cuenta El número de cuenta.
     */

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo actual de la cuenta.
     */
	public double getSaldo() {
		return saldo;
	}
	
	/**
     * Establece el saldo de la cuenta.
     * @param saldo El saldo de la cuenta.
     */
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/** Ingresa una cantidad de dinero en la cuenta.
     * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
	 * 
	 */
	
	public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
	/**
     * Retira una cantidad de dinero de la cuenta.
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay suficiente saldo.
     */

    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

}
