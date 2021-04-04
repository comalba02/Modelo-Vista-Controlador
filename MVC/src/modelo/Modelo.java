/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Modelo {
    
    private int num1, num2, resultado;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int sumar (){
        this.resultado = this.num1 + this.num2;
        return this.resultado;
    }
    
     public int restar (){
        this.resultado = this.num1 - this.num2;
        return this.resultado;
    }
    
}
