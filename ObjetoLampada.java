
package atividadeclasse;


public class AtividadeClasse {

    
    public static void main(String[] args) {
        Lampada lamp1 = new Lampada();
        lamp1.modelo = "Bulbo Led";
        lamp1.corLuz = "Branca";
        lamp1.potencia = 10;
        lamp1.status();
        lamp1.estadoAtual();
    }
    
}
