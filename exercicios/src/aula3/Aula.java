/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class Aula {
    public static void main(String[]args){
        int numero = 10;
        System.out.print("O número é: ");
        System.out.println(numero);
        System.out.println("O número é: " +numero);
        System.out.println("O número +1 é: " +(numero+1));
        
        //Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o seu nome completo: ");
        String nome = in.nextLine();
        
        System.out.print("Digite a sua idade: ");
        int idade = in.nextInt();
        System.out.println("Nome: "+nome+"\nIdade: "+idade);
        // Nota do 1º bimestre tem peso 2, do 2º bimestre tem peso 3.
    }
    
}
