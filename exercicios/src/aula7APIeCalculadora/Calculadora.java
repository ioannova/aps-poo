/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7APIeCalculadora;

/**
 *
 * @author nelsonfonseca
 */
public class Calculadora {
    public double num1, num2, result;
    
    public Calculadora(){
        num1 = 0;
        num2 = 0;
        result = 0;
    }
    
    public double soma(){
        result = num1+num2;
    }
    
    public double multiplica(){
        result = num1*num2;
    }
    
    public double divide(){
        result = num1/num2;
    }
    
    public double subtrai(){
        result = num1-num2;
    }
    
    public double getResult(){
        return result;
    }
}
