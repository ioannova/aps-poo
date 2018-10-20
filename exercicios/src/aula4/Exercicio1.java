/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class Exercicio1 {
        public static void main (String[]args){
    double av1, av2, media;
    Scanner in = new Scanner (System.in);
    
    System.out.print ("Insira a nota do 1º bimestre: ");
    av1 = 2 * in.nextDouble();
    System.out.print ("Insira a nota do 2º bimestre: ");
    av2 = 3 * in.nextDouble();
    media = (av1+av2)/5;
    System.out.println ("Sua média final é: " +media);
    if(media>=7)
       System.out.println ("Você foi aprovado.");
       else
               System.out.println("Você não foi aprovado");
            
    } 

}

