/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;
import java.util.Scanner;
/**
 *
 * @author nelsonfonseca
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        Conta conta = new Conta();
        Cambio cambio=new Cambio();
        int opcao=0;
        while (opcao<1 || opcao>4)
        {
        System.out.println("Digite a opção :");
        System.out.println("1-Sacar");
        System.out.println("2-Depositar");
        System.out.println("3-Consultar Saldo");
        System.out.println("4-Mostrar valor em dólares");
        opcao=in.nextInt();
        }
        switch (opcao)
        {
            case 1 :
            System.out.println("Digite o valor a sacar :");
        float valor=in.nextFloat();
        conta.sacar(valor);
        System.out.println("O saldo é"+conta.consultar_saldo());
        break;
          case 2 :
            System.out.println("Digite o valor a depositar :");
        valor=in.nextFloat();
        conta.depositar(valor);
        System.out.println("O saldo é"+conta.consultar_saldo());
        break;
          case 3 :
                System.out.println("O saldo é"+conta.consultar_saldo());
        break;
          case 4:
                System.out.println("Digite o valor a converter :");
        valor=in.nextFloat();
        cambio.converter_para_dolar(valor);
        System.out.println( cambio.converter_para_dolar(conta.consultar_saldo()));
    }
    }
    
}