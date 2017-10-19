/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion1;

import java.io.Serializable;

/**
 *
 * @author otorradomiguez
 */
public class Mclase implements Serializable{
    
    String nome;
    //Establecemos numero1 como transient, al escribir-leer este objeto se ignora esta variable
    //con lo cual se iniciara a 0 en caso de numero o null en caso de strings
    transient int numero1;
    double numero2;

    public Mclase(String nome, int numero1, double numero2) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Mclase() {
        this.nome="";
        this.numero1=0;
        this.numero2=0;
    }

    @Override
    public String toString() {
        return "Mclase{" + "nome=" + nome + ", numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
}
