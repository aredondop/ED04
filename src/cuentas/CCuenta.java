package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 *
 * @author Ángel Redondo
 * @version 1.0
 * @since Tara 04 de Entornos de Desarrollo
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;

    /** Número de cuenta */
    private String cuenta;

    /** Saldo actual de la cuenta */
    private double saldo;

    /** Tipo de interés de la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta.
     *
     * @param nom    Nombre del titular de la cuenta.
     * @param cue    Número de cuenta.
     * @param sal    Saldo inicial de la cuenta.
     * @param tipo   Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad en la cuenta.
     *
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Getters y Setters para encapsular todo el tema
     * Omitidos por brevedad, son bastante autoexplicativos :_)
    */
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}