/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;
/**
*
* @author USUARIO
*/
public class Cuenta {
	/* Atributo que define el sueldo de una cuenta bancaria*/
	protected float saldo;
	/*Atributo que define el numero de consignaciones realizadas en una cuenta bancaria*/
	protected int numeroConsignaciones = 0;
	/*Atributo que define el numero de retiros de una cuenta bancaria*/
	protected int numeroRetiros = 0;
	/*Atributo que define la tasa anual de intereses de una cuenta bancaria*/
	protected float tasaAnual;
	/* Atributo que define la comisión mensual que se cobra a una cuenta bancaria */
	protected float comisionMensual = 0;
	
	/**
	 * Constructor de la clase Cuenta
	 *@param saldo Parametro que define el saldo de la cuenta
	 *@param tasaAnual Parametro que define la tasa anual de interes de la cuenta
	 */
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}
	/**
	 * Metodo que recibe una cantidad de dinero a consignar y actualiza el saldo de la cuenta
	 * @param salado Parametro que define la cantidad de dinero a consignar en la cuenta
	 */
	public void consignar(float cantidad) {
		saldo = saldo + cantidad; /* Se actualiza el saldo con la cantidad consignada*/
		//Se actualiza el numero de consignaciones realizadas en la cuenta
		numeroConsignaciones = numeroConsignaciones + 1;
	}
	/**
	 * Metodo que recibe una cantidad de dinero a retirar y actualiza el saldo de la cuenta
	 * @param saldo Parametro que define la cantidad de dinero a retirar de la cuenta
	 */
	public void retirar(float cantidad) {
		float nuevoSaldo = saldo - cantidad;
		/*Si la cantidad a retirar no supera el saldo, el retiro no se puede realizar*/
		if (nuevoSaldo >= 0) {
			saldo -= cantidad;
			numeroRetiros = numeroRetiros + 1;
		}else {
			System.out.println("La cantidad a retirar ")
		}
	}
}
