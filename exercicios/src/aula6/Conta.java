/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author nelson
 */
public class Conta {
    float saldo=200;
   
    public void sacar(float valor)
    {saldo-=valor;
    }
    public void depositar(float valor)
    {saldo+=valor;
  
    }
     public float consultar_saldo()
    {return saldo;
    }
}