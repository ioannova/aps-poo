/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author nelson
 */
class Conta {
    private double saldo = 100;
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public double getSaldo() {
    return this.saldo;
}
    
}
