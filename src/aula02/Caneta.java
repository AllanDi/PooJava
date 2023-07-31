package aula02;

import java.sql.SQLOutput;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não pode rabiscar com a caneta tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada =false;
    }

}
