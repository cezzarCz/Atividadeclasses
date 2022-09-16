package atividadeclasse;

import java.util.Scanner;

public class Lampada {
    String modelo;
    String corLuz;
    int potencia;
    int escolha;
    
    void status(){           
        System.out.println("Lampada:");
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor da luz: " +this.corLuz);
        System.out.println("Potencia: " +this.potencia+ "W");
    }
    
    //Metodos
    Scanner op = new Scanner(System.in);
    void estadoAtual(){
        System.out.println("Deseja acender a lampada?");
        System.out.println("1 - Sim | Outro - Nao");
        escolha = op.nextInt();
        if (escolha == 1){
            System.out.println("A lampada esta acesa!");
        } else {
            System.out.println("A lampada continua apagada!");
        }
    }
}
