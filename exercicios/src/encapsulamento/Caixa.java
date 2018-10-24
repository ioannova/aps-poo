/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
class Caixa {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);

        Conta c1 = new Conta();
        //System.out.print ("Insira o valor a ser depositado: R$");
        //int dinheiro = in.nextInt();
        //c1.depositar(dinheiro);
        c1.depositar(1000);
        c1.sacar(1000);
        System.out.println ("Saldo "+c1.getSaldo());
        System.out.println ("\nFim da operação!");
    }
    
}
