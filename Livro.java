package atividadeclasse3;


public class Livro {
    String autor;
    String nome;
    String editora;
    String categoria;
    int paginas;
    float valor;
    
    //Metodos
    void mostrarLivro(){
        System.out.println("Livraria Spetin");
        System.out.println("Livro disponivel: " +this.nome);
        System.out.println("Autor: " +this.autor);
        System.out.println("Categoria: " +this.categoria);
        System.out.println("Paginas: " +this.paginas);
        System.out.println("Editora: " +this.editora);
        System.out.printf("Valor: %.2f reais \n", this.valor);
        
    }
}
