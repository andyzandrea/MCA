/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author Andrea
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean primo;
        int num;
        int i;
        System.out.println("Los números primos que existen entre 10 y 50 son:");
 
 for (num = 10; num <= 50; num++) {
 // num: es la variable que tendrá el número a evaluar entre el 10 y el 50
 
     primo = true;
 for (i = 2; i < num; i++) {
 //Si tiene un divisor i diferente a 1 y a sí mismo entonces NO es primo
 if (num % i == 0){
    // System.out.println(num % i);
 
     primo = false;
     
 break; //Sale del ciclo for
 }
 }
 //Si no tiene un divisor diferente a 1 y a si mismo entonces SI es primo
 if (primo) {
 System.out.print(num + ",");
 }

    }
    } 
}
