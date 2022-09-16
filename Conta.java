package atividadeclasse2;


public class Conta {
    String titular;
    int numero;
    int agencia;
    float saldo;
    
    //Metodos
    void extrato(){
        System.out.println("Consulta de saldo:");
        System.out.println("Titular da conta: " +this.titular);
        System.out.println("Saldo atual: " +this.saldo);
        System.out.println("Numero da conta: " +this.numero+ ", Agencia: " +this.agencia);
    }
}
