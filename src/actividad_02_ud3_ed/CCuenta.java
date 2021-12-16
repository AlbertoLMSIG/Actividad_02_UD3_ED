/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   * pARAMTRO
   */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue ES17 8654839856 83465834
    * @param sal 5.667.4
    * @param tipo Unicaja
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * 
    * @return nombre 
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * 
     * @return estado 
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad de dinero
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * 
    * @param cantidad a reitart
    * @throws Exception 
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return obtenercuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta ES17 64738545467 
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * 
   * @param saldo dinero de la cuenta 
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @return tipo interes
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * 
   * @param tipoInterés 3 por ciento 
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
