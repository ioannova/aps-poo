/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7APIeCalculadora;

import java.util.Scanner;

/**
 *
 * @author nelsonfonseca
 */
public class Calcula {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        Calculadora calc = new Calculadora();
        System.out.println ("Escolha uma opçao: ");
        int n = in.nextInt();
        
        switch(n){
            case 1: System.out.println (" Soma ");
            System.out.println ("Insira um numero: ");
            calc.num1= in.nextDouble();
            System.out.println ("Insira o segundo numero: ");
            calc.num1= in.nextDouble();
                break;
            case 2: System.out.println (" Soma ");
            System.out.println ("Insira um numero: ");
            calc.num1= in.nextDouble();
            System.out.println ("Insira o segundo numero: ");
            calc.num1= in.nextDouble();
            calc.soma(num1, num2);
                break;
            default:
        } 
        
        
    }
    
}
