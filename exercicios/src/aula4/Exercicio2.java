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
public class Exercicio2 {
    public static void main (String[]args){
    System.out.println ("Insira uma frase para contar as letras \"a\": ");
    Scanner in = new Scanner (System.in);
    String quantidade = in.nextLine();
    int qtoficial = quantidade.length();
    System.out.println ("Esta frase contém \""+qtoficial+"\" letras.");
    String letraA = quantidade;
    int total = qtoficial;
    int cont=0;
    for (int i=0; i<letraA.length();i++){
        if (('a' == letraA.charAt(i)) || ('A'==letraA.charAt(i))){
            cont++;
        }
    }
        System.out.println ("O total de letras A em sua frase é de: "+cont);    
    }
}
